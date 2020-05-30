import static groovyx.gpars.GParsPool.withPool

withPool {
  urls = [
    'http://www.gpars.org/webapp/quickstart/index.html',
    'http://makingdevs.com/training/groovy-intermediate?category=groovy_expert',
    'https://groovy-lang.org/ecosystem.html'
  ]

  println "Número de ocurrencias GROOVY " + urls.parallel
  .map { it.toURL().text.toUpperCase() }
  .filter {it.contains('GROOVY')}
  .map { it.split() }
  .map { it.findAll { word -> word.contains('GROOVY') }.size() }
  .sum()
}
