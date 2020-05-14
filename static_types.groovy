def c(s){
  println s.toUpperCase()
}
c("hola")
c('c')
// c(4)

class Person {
  String firstName
  String lastName
  String getFullName() { "$firstName $lastname" }
}
def p = new Person()

int metodo(){
  if(false){ 'String' }
  else { 42 }
}

metodo()

def shout(String str) {
  println "Printing in uppercase"
  println str.toUpperCase()
  println "Printing again in uppercase"
  //println str.toUppercase()
}
shout('hello')
