@Grab(group='mysql', module='mysql-connector-java', version='5.1.49')
@GrabConfig(systemClassLoader=true)

import groovy.sql.Sql

startTime = System.currentTimeMillis()
dbs = ["db1","db2","db3"]

dbParams = [
  url: 'jdbc:mysql://localhost/groovy_training',
  user: 'makingdevs',
  password: 'makingdevs',
  driver: 'com.mysql.jdbc.Driver']

sql = Sql.newInstance(dbParams)

sql.execute "drop table if exists issue;"
sql.execute """
  create table if not exists issue(
    id integer primary key  auto_increment,
    description varchar(500),
    priority integer,
    date_created datetime
  );
"""

sql.execute """
  insert into issue(description,priority,date_created) values
  ('No funciona el Login',1,now()),
  ('No hay estilo CSS',2,now()),
  ('No se puede crear el cliente',3,now()),
  ('Faltan validaciones',4,now()),
  ('No se puede acceder al menu',1,now()),
  ('No se crean facturas',2,now()),
  ('No se puede capturar emisor',3,now()),
  ('No se puede capturar receptor',4,now()),
  ('No se puede acceder al sistema',1,now());
"""

sql.eachRow("select * from issue") { row ->
  //println row
}

insertInstruction = "insert into issue(description, priority, date_created) values(?,?,?);"
params = ["error en pantalla", -10, new Date() - 1]

sql.execute insertInstruction, params

dataset = sql.dataSet('issue')
issues = dataset.findAll { r -> r.id >= 3 && r.id <= 6 }
println issues.sql
issues.each {
  println it
}

dataset.add([description: "The last issue", priority: 1, date_created: new Date() - 10])

endTime = System.currentTimeMillis()
println "Time: ${endTime - startTime}"
