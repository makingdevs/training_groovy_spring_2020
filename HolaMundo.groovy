class HolaMundo {
  def nombre

  def saluda() {
    return "Hola " + this.nombre + " !!!"
  }

  static void main(String[] args) {
    HolaMundo objeto = new HolaMundo()
    objeto.setNombre("@grailsmx")
    println(objeto.saluda())
  }
}
