root = new File(System.getProperty("user.home"))
// root = new File("C:\")
println root
println "*"*100
root.eachDir {
  println it
}
println "-"*100
root.eachFile {
  println it
}
println "#"*100

f2 = new File("parenthesis.txt")
println f2.name
println f2.absolutePath
println f2.directory

println f2.text
println f2.class

f3 = new File("the_early_history_of_smalltalk.txt")
lines = f3.readLines()
println lines.size()
println lines.class
println lines*.size()
// lines.each { line -> println line }
f3.splitEachLine("\n") { line ->  }
