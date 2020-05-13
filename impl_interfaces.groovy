// Script

import javax.swing.*
import java.awt.*
import java.awt.event.*

frame = new JFrame(
  size: [300, 300],
  layout: new FlowLayout(),
  defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE)

button = new JButton("click")
positionLabel = new JLabel("")
msgLabel = new JLabel("")

frame.contentPane.add button
frame.contentPane.add positionLabel
frame.contentPane.add msgLabel
frame.contentPane.add new JTextField("Texto")


button.addActionListener(
  { JOptionPane.showMessageDialog(frame, "Cliqueaste papuh!!!") } as ActionListener )

displayMouseLocation = { positionLabel.setText("$it.x , $it.y") }

frame.addMouseListener( displayMouseLocation as MouseListener )
frame.addMouseMotionListener( displayMouseLocation as MouseMotionListener )


frame.show()
