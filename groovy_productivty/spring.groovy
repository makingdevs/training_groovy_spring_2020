@GrabConfig(systemClassLoader=true)
@Grapes([
  @Grab(group='mysql', module='mysql-connector-java', version='6.0.6'),
  @Grab(group='org.springframework', module='spring-jdbc', version='5.2.6.RELEASE')
])

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.datasource.DriverManagerDataSource

dataSource = new DriverManagerDataSource("jdbc:mysql://localhost/grooyy_training", "makingdevs", "makingdevs")
jdbcTemplate = new JdbcTemplate(dataSource: dataSource)
println jdbcTemplate.properties
