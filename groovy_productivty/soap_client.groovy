@Grab('com.github.groovy-wslite:groovy-wslite:1.1.2')
import wslite.soap.*
import static groovyx.gpars.GParsPool.withPool

def requestSoap(Date date) {
  url = "http://currencyconverter.kowabunga.net/converter.asmx?WSDL"
  client = new SOAPClient(url)
  action = "http://tempuri.org/GetConversionAmount"

  response = client.send(SOAPAction: action) {
    body {
      GetConversionAmount(xmlns: "http://tempuri.org/") {
        CurrencyFrom "USD"
        CurrencyTo "MXN"
        RateDate date.format("yyyy-MM-dd'T'HH:mm:ss'Z'", TimeZone.getTimeZone("UTC"))
        Amount 1
      }
    }
  }
  response.GetConversionAmountResponse
}

today = new Date()

withPool {
  (today-60..today-20).collectParallel { d ->
  //rates = (today-60..today-10).collect { d ->
    println "${d.format('dd-MM-yyyy')} : " + requestSoap(d)
  }
}
