@Grab(group='mysql', module='mysql-connector-java', version='5.1.49')
@GrabConfig(systemClassLoader=true)

import groovy.sql.Sql

dbParams = [
  url: 'jdbc:mysql://localhost/groovy_training',
  user: 'makingdevs',
  password: 'makingdevs',
  driver: 'com.mysql.jdbc.Driver']

sql = Sql.newInstance(dbParams.url, dbParams.user, dbParams.password, dbParams.driver)

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
