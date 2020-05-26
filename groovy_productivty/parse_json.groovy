import groovy.json.*

payload = new URL("https://api.github.com/users/neodevelop/repos").text

jsonSlurper = new JsonSlurper()
document = jsonSlurper.parseText(payload)

println document
println document.size()
println document*.name
