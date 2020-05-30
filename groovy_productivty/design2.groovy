class MiPropioSet implements Set {
  @Delegate
  Set delegate = new HashSet()

  boolean add(e) {
    println "$adding $e"
    delegate.add(e)
  }
  boolean addAll(Collection l) {
    println l
    delegate.addAll(l)
  }
}

set  = new MiPropioSet()
set.add(2)
set.addAll([3,4,5])
println set
