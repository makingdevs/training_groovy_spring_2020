import groovy.swing.SwingBuilder

counter = 0

frame = new SwingBuilder().frame(
  title: "MakingDevs",
  size: [400, 300],
  layout: new java.awt.FlowLayout(),
  defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE
) {
  label = label(text: "Value")
  button = button(text: "Puchurrame!", actionPerformed: {
    counter++
    button.text = "Presionado ${counter} veces"
    label.text = "Mostrado ${counter} veces"
  })
  slider()
  comboBox(items: ['uno','dos','tres'])
  menuBar {
    menu('File') {
      menuItem "New..."
      menuItem "Open..."
    }
  }
}

frame.show()
