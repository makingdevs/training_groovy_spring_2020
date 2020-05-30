class Persona {
  @Lazy
  def connection = getConnection("jdbc:mysql://localhost/groovy_training")
}

assert new Persona()

@groovy.transform.InheritConstructors
class MyPrintWritter extends PrintWriter {}
assert new MyPrintWritter(new File('out.txt'))
