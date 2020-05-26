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
