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
