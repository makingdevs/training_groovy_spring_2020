import groovyx.gpars.dataflow.Dataflows
import static groovyx.gpars.dataflow.Dataflow.task

flow = new Dataflows()
task { flow.gravitas = flow.m * flow.a  }
task { flow.result = flow.x + flow.y }
task { flow.x = 10 }
task { flow.y = 5 }
task { Thread.sleep(300); flow.m = 300  }
task { Thread.sleep(1000); flow.a = operation()  }

def operation() { 12*123*312*2.0 }

println flow.result
println flow.gravitas
