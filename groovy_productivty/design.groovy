@Singleton
class Servicio { }

s1 = Servicio.instance
s2 = Servicio.instance

println s1
println s2

assert s1 == s2
