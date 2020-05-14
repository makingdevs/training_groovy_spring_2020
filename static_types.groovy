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
