import groovy.json.JsonSlurper

class BuscadorDeCervecerias {

  static metodoApi = "search/brewery"

  static findByPais(String pais) {
    def cerveceras = []
    def jsonSlurper = new JsonSlurper()
    def url = ApiSystem.instance.buildApiUrl(metodoApi, [q: pais])
    def connection = new URL(url)
    def queryResult = jsonSlurper.parseText(connection.text)
    cerveceras = queryResult.response.brewery.items.collect { b -> Cerveceria.createWithParams(b.brewery) }
    cerveceras
  }
}
