import groovy.swing.SwingBuilder

frame = new SwingBuilder().frame(
  title: "MakingDevs",
  size: [400, 300],
  layout: new java.awt.FlowLayout(),
  defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE
) {
  label = label(text: "Value")
  button = button(text: "Puchurrame!", actionPerformed: {
    println "new Date()"
  })
}

frame.show()
