import groovy.swing.SwingBuilder

frame = new SwingBuilder().frame(
  title: "MakingDevs",
  size: [400, 300],
  layout: new java.awt.FlowLayout(),
  defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE
) {
}

frame.show()
