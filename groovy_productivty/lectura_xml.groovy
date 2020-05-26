documento = new XmlSlurper().parse("makingdevs.xml")
println documento.'@organization'
documento.roadmap.category.each { cat ->
  println "- ${cat.'@name'}"
  cat.course.each { c ->
    println "\t- ${c.text().trim()}"
  }
}
