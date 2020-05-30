//@ThreadInterrupt
//import groovy.transform.ThreadInterrupt
//@TimedInterrupt(10)
//import groovy.transform.TimedInterrupt
@ConditionalInterrupt({ errorCount >= 10 })
import groovy.transform.ConditionalInterrupt

//while(true){
  errorCount = 0

  1000.times {
    try {
      if(it == 500) {
        println "Wait for crash"
        Thread.sleep(2000)
        errorCount = 11
      }
    } catch(t) {
      errorCount++
    }
  }
//}
