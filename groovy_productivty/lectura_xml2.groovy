documento = new XmlSlurper().parse("makingdevs_ns.xml").declareNamespace(fundamentals:"Essential")

println documento.roadmap.category.course.collect { "${it.@name}" }.join("\n")
println "*" * 100
println documento.roadmap.category.'fundamentals:course'.collect { "${it.@name}" }.join("\n")
