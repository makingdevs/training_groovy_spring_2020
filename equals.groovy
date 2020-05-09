class Telefono {
  String tipo
  boolean equals(Telefono otroTelefono){
    println "Comparando..."
    tipo == otroTelefono.tipo
  }
}

def t1 = new Telefono()
t1.tipo = 'Smartphone'
def t2 = new Telefono()
t2.tipo = 'Cellphone'

assert t1 != t2
