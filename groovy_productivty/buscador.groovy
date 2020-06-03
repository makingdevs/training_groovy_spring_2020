engine = new groovy.text.SimpleTemplateEngine()
source = new File("buscador.template.html").text
template = engine.createTemplate(source)

breweries = []
if(params.q)
  breweries = BuscadorDeCervecerias.instance.findByPais(params.q)

out << template.make([message:"Cerveceras encontradas...", breweries: breweries])
