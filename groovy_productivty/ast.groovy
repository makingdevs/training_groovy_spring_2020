//@groovy.transform.ToString
@groovy.transform.Canonical
class Curso {
  String nombre
  Integer duracion
  BigDecimal costo
}

println new Curso(nombre: "Groovy", duracion: 10, costo: 10500)

//@groovy.transform.EqualsAndHashCode
@groovy.transform.Canonical
class Posicion {
  Integer x,y
}

p1 = new Posicion(x: 30, y: 50)
p2 = new Posicion(x: 30, y: 50)

assert p1 == p2
assert p1.hashCode() == p2.hashCode()

//@groovy.transform.TupleConstructor
@groovy.transform.Canonical
class Persona {
  String nombre
  Date fechaDeNacimiento
  Integer peso
}

p1 = new Persona("Juan")
p2 = new Persona("Juan", new Date())
p3 = new Persona("Juan", new Date(), 258)

// @Canonical = @ToString  + @EqualsAndHashCode + @TupleConstructor
