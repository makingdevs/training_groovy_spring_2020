import groovy.util.GroovyTestCase

class MyTest extends GroovyTestCase {
  void testSomething(){
    assert 1 == 1
  }

  void testSomething2(){
    assert 2+2 == 4 : "We're in math issues"
  }

  void testMultiple(){
    assertEquals([1,2,3,4], [1,2,3,4])
  }

  void testError(){
    shouldFail {
      throw RuntimeException()
    }
  }
}
