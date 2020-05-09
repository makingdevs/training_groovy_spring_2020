class DoublerBean{
  public value

  void setValue(value){
    this.value = value
  }

  def getValue(){
    value * 2
  }
}

def bean = new DoublerBean(value:100)

assert 200 == bean.value
assert 100 == bean.@value
