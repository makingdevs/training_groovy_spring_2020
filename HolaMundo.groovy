class HolaMundo {
  String nombre
  String getNombre() {
    return nombre
  }
  void setNombre(String nombre) {
    this.nombre = nombre
  }

  String saluda() {
    return "Hola " + this.nombre + " !!!"
  }

  static void main(String[] args) {
    HolaMundo objeto = new HolaMundo()
    objeto.setNombre("@grailsmx")
    System.out.println(objeto.saluda())
  }
}
