lista = []
println lista.getClass().getName()

lista = ["Uno","Dos","Tres"]
println lista

println "Iterando la lista"
lista.each { println "$it"}

lista += 4
lista += ["Cuatro","Cinco"]
for(item in lista) {println "$item"}

lista << "Seis"
println lista

lista << "Siete" << "Ocho"
println lista

lista = lista - "Seis"
println lista

subLista = lista[4..6]
println subLista.dump()

lista = lista * 2
println lista
println lista.unique()

lista = lista.findAll() { it.class == Integer }

lista = lista.collect { it * it  }

println lista

println lista.sum()
