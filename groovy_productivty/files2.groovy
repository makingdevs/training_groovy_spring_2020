file = new File("hello.txt")
file.write("Hola inmundo ${new Date()}!!!!\n")

file.append("Entrneamiento en Groovy para ser más productivo\n")
file << "Esto va a ponerse al final del archivo\n"

new File("hello_copy.txt").write(file.text)

document = new File("git-cheat-sheet_jrebel.pdf")
new File("copy.pdf").withOutputStream { out ->
  out.write(document.bytes)
}
