def binding = [
  firstname : "Grace",
  lastname  : "Hopper",
  accepted  : false,
  title     : 'Groovy for COBOL programmers'
]
def engine = new groovy.text.SimpleTemplateEngine()
def text = new File('template.gsp').text
def template = engine.createTemplate(text).make(binding)
println template.toString()
