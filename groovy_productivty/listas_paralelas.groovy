
procesos = [300,500,100,900,400,300,400,1100,1500,100,200]

procesos.each { t ->
  Thread.sleep(t)
  println "Finish job: ${t}"
}
