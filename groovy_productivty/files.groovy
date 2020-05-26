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

