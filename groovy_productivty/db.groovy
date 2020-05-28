@Grab(group='mysql', module='mysql-connector-java', version='5.1.49')
@GrabConfig(systemClassLoader=true)

import groovy.sql.Sql

dbParams = [
  url: 'jdbc:mysql://localhost/groovy_training',
  user: 'makingdevs',
  password: 'makingdevs',
  driver: 'com.mysql.jdbc.Driver']

sql = Sql.newInstance(dbParams.url, dbParams.user, dbParams.password, dbParams.driver)
