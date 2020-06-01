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

currentActor.join()
