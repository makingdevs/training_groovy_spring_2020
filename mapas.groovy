map = [:]

map.put("uno", 1)
map.put("dos", 2)
println map
println map.get("uno")

map.tres = 3
map["cuatro"] = 4

println map
println map.tres

map.each {
  println it
}
