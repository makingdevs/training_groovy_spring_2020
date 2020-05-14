def tiempo(posicion, funcion) {
  def comienzo = System.nanoTime()
  def resultado = funcion(posicion)
  def fin = System.nanoTime()
  def tiempoTotal = String.format("%.2f sec", (fin - comienzo)/1.0e9)
  println "Fibonacci($posicion): $resultado, tiempo total: $tiempoTotal"
}

serieFibonacci = [0: 1, 1: 1]

def fibonacciConSerieAlmacenada(position) {
  if(!serieFibonacci.containsKey(position))
    serieFibonacci[position] = fibonacciConSerieAlmacenada(position - 1) + fibonacciConSerieAlmacenada(position - 2)
    serieFibonacci[position]
}

tiempo(40) { posicion -> fibonacciConSerieAlmacenada(posicion)}
