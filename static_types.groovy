import groovy.transform.TypeChecked

@TypeChecked
def c(String s){
  println s.toUpperCase()
}
c("hola")
c('c')
// c(4)

@TypeChecked
class Person {
  String firstName
  String lastName
  String getFullName() { "$firstName $lastName" }
}
def p = new Person()

@TypeChecked
int metodo(){
  if(false){ 0 }
  else { 42 }
}

metodo()

@TypeChecked
def shout(String str) {
  println "Printing in uppercase"
  println str.toUpperCase()
  println "Printing again in uppercase"
  println str.toUpperCase()
}
shout('hello')

@TypeChecked
class Genericos{
  def usaLista() {
    ArrayList<Integer> list = new ArrayList<Integer>()
    list.add(1)
    list.add(2.0)
    list.add("hello")
    list
  }
}
def g = new Genericos()
println g.usaLista()
