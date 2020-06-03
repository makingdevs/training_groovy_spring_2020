engine = new groovy.text.SimpleTemplateEngine()
source = new File("buscador.template.html").text
template = engine.createTemplate(source)

out << template.make([:])
