class HolaMundo {
  def nombre
  def saluda() {
    "Hola ${this.nombre} !!!"
  }
}

HolaMundo objeto = new HolaMundo(nombre:"@grailsmx")
println(objeto.saluda())
