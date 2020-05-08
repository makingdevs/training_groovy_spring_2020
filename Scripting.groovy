class Perfil {
  private String bio
  private String bornDate
  private Persona persona
  private String twitter
  private String facebook
}

class Pedido {
  Persona comprador
  Date dateCreated
  Date lastUpdated

  String toString() {
    "$comprador - $dateCreated"
  }
}

Persona persona = new Persona()
persona.setNombre("Rodrigo")

println persona.dump()
