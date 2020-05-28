@Grapes([
  @Grab(group='mysql', module='mysql-connector-java', version='5.1.49'),
  @Grab(group='org.springframework', module='spring-jdbc', version='5.2.6.RELEASE')
])
@GrabConfig(systemClassLoader=true)

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.datasource.DriverManagerDataSource

dataSource = new DriverManagerDataSource("jdbc:mysql://localhost/groovy_training", "makingdevs", "makingdevs")
dataSource.driverClassName = "com.mysql.jdbc.Driver"
jdbcTemplate = new JdbcTemplate(dataSource: dataSource)
println jdbcTemplate.properties

counter = jdbcTemplate.queryForObject("select count(*) from issue", Integer)
println "There are ${counter} issues"
