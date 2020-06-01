import static groovyx.gpars.actor.Actors.*

currentActor = actor {
  loop {
    react { msg ->
      println "Received $msg"
    }
  }
}

currentActor.send "Hello world"
currentActor << "Another message"
currentActor "Super message"

inverse = reactor { message -> message.reverse() }
show = reactor { println it }
main =  actor {
  inverse "Hello world ${new Date()}"
  react { text ->
    show text
  }
}

currentActor.join()
