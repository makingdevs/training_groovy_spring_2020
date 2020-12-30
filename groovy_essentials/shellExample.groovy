#!/usr/bin/env groovy
def result = "ls -lrt".execute().text

println "OMG!! ${result}"
println "Hello world ${this.args[0]} !!"
println "Let`s rock ${this.args[1]} !!"
println this.args.dump()
