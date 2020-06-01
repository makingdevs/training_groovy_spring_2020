@Singleton
class ApiSystem {
  String apiURL = "https://api.untappd.com/v4/"
  String clientId = System.getenv("CLIENTID")
  String clientSecret = System.getenv("CLIENTSECRET")
  String permanentParams = "client_id=${clientId}&client_secret=${clientSecret}"

  def buildApiUrl(metodo, params = [:]){
    "${apiURL}${metodo}?${permanentParams}&${wrapParams(params)}"
  }

  private String wrapParams(Map params){
    params.collect {k, v -> "$k=$v" }.join("&")
  }

}
