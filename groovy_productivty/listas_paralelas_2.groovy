import static groovyx.gpars.GParsPool.withPool

def benchmark(function) {
  def startTime = System.currentTimeMillis()
  function()
  def endTime = System.currentTimeMillis()
  println "Total time: ${endTime-startTime}"
}

procesos = [300,500,100,900,400,300,400,1100,1500,100,200]

withPool {
  heavyProcess procesos.makeConcurrent()
  //heavyProcess procesos
}

def heavyProcess(jobs){
  jobs.each {
    Thread.sleep(it)
      println "Finish job: ${it}"
  }
}
