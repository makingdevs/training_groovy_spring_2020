def tiempo(posicion, funcion) {
  def comienzo = System.nanoTime()
  def resultado = funcion(posicion)
  def fin = System.nanoTime()
  def tiempoTotal = String.format("%.2f sec", (fin - comienzo)/1.0e9)
  println "Fibonacci($posicion): $resultado, tiempo total: $tiempoTotal"
}

def fibonacci(posicion) {
  if (posicion < 2)
    1
  else
    fibonacci(posicion - 1) + fibonacci(posicion - 2)
}

tiempo(8) { posicion -> fibonacci(posicion)}
