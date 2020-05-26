map = [:]

map.put("uno", 1)
map.put("dos", 2)
println map
println map.get("uno")

map.tres = 3
map["cuatro"] = 4

println map
println map.tres

map.each { k, v ->
  println "$k ===>  $v"
}

println map.findAll { k, v ->
  v > 2
}

println map.findAll { k, v ->
  k.contains("u")
}

println map.find { k, v ->
  k.contains("u")
}
