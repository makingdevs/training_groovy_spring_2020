import groovy.json.*

//payload = new URL("https://api.github.com/users/neodevelop/repos").text
//
//jsonSlurper = new JsonSlurper()
//document = jsonSlurper.parseText(payload)
//
//println document
//println document.size()
//println document*.name

jsonBuilder = new JsonBuilder()

jsonBuilder.training {
  name "Groovy productivity"
  duration 10
  instructor "@neodevelop"
  students { ["Alfonso", "Xiomara"] }
}

println jsonBuilder.toString()
println JsonOutput.prettyPrint(jsonBuilder.toString())

