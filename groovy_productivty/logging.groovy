@Grab(group='log4j', module='log4j', version='1.2.17')

import groovy.util.logging.*

// @Log //java.util.loggin.Logger
@Log4j //org.apache.log4j.Logger
// @Slf4j
// @Commons
class Servicio {
  def metodo() {
    log.info "Mexican Debugger"
  }
}

new Servicio().metodo()
