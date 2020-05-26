import org.codehaus.groovy.runtime.typehandling.GroovyCastException as GCE

def variableDinamica
variableDinamica = 1 ; assert variableDinamica.class == Integer
variableDinamica = 2f ; assert variableDinamica.class == Float
variableDinamica = 3d ; assert variableDinamica.class == Double
variableDinamica = 3g ; assert variableDinamica.class == BigInteger
variableDinamica = 'a' ; assert variableDinamica.class == String
variableDinamica = true ; assert variableDinamica.class == Boolean

BigDecimal variableTipada = 3
assert variableTipada.class == BigDecimal.class
variableTipada = "A"
assert variableTipada.class == BigDecimal.class
try {
    variableTipada = "Hola"
} catch(GCE e){
    println e.message
}
