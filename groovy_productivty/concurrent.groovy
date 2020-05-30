import static groovyx.gpars.GParsPool.withPool
import java.util.concurrent.atomic.AtomicInteger

procesos = [300,500,100,900,400,300,400,1100,1500,100,200]
AtomicInteger result = new AtomicInteger(0)
withPool {
  procesos.eachParallel { result.addAndGet(it) }
  println result
  println procesos.sum()
}

