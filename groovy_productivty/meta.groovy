String.metaClass.metodoQuenoExiste = { -> "Como ñooo!!!" }
String s = "Hola inmundo"

println s.class
println s.charAt(3)
println s.metodoQuenoExiste()
println s.class
