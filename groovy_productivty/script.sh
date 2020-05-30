#!/usr/bin/env groovy
println "Hello from the shebang line"
dir =  "pwd".execute().text.trim()
file = new File(dir)
file.eachFile { println it }
