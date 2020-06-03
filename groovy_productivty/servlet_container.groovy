@Grab(group='org.eclipse.jetty', module='jetty-server', version='9.4.29.v20200521')
@Grab(group='org.eclipse.jetty', module='jetty-servlet', version='9.4.29.v20200521')
@Grab(group='javax.servlet', module='javax.servlet-api', version='3.1.0', scope='provided')

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*


server = new Server(1234)
context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS)
context.resourceBase = "."
context.addServlet(GroovyServlet, "*.groovy")
server.start()
