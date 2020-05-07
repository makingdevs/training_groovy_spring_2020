class HolaMundo {
  def nombre

  def saluda() {
    "Hola ${this.nombre} !!!"
  }

  static void main(String[] args) {
    HolaMundo objeto = new HolaMundo(nombre:"@grailsmx")
    println(objeto.saluda())
  }
}
