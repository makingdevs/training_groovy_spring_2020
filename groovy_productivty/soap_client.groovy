@Grab('com.github.groovy-wslite:groovy-wslite:1.1.2')
import wslite.soap.*

url = "http://currencyconverter.kowabunga.net/converter.asmx?WSDL"
client = new SOAPClient(url)
action = "http://tempuri.org/GetConversionAmount"

response = client.send(SOAPAction: action) {
  body {
    GetConversionAmount(xmlns: "http://tempuri.org/") {
      CurrencyFrom "USD"
      CurrencyTo "MXN"
      RateDate "2020-01-26T19:32:52Z"
      Amount 1
    }
  }
}

println response.httpResponse.statusCode
println response.GetConversionAmountResponse
