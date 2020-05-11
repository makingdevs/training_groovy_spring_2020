def calculoDeDiscriminante(a,b,c){
  (b*b) - (4*a*c)
}

println "Dado 1x^2 + 16x + 64 => ∆ = ${calculoDeDiscriminante(1,16,64)}"

def unaSolucion(a,b,c) {
  def d = calculoDeDiscriminante(a,b,c)
  if(d < 0)
    throw new RuntimeException('No tiene solución!')
  ((-1*b) + Math.sqrt(d)) / (2*a)
}

println "Dado 1x^2 + 16x + 64 => x1 = ${unaSolucion(1,16,64)}"
