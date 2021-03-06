def tiempo(posicion, funcion) {
  def comienzo = System.nanoTime()
  def resultado = funcion(posicion)
  def fin = System.nanoTime()
  def tiempoTotal = String.format("%.2f sec", (fin - comienzo)/1.0e9)
  println "Fibonacci($posicion): $resultado, tiempo total: $tiempoTotal"
}

def fibonacci
fibonacci = { posicion ->
  posicion < 2 ? 1 : fibonacci(posicion - 1) + fibonacci(posicion - 2)
}.memoize()

tiempo(40) { posicion -> fibonacci(posicion) }
