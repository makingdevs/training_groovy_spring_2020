import groovy.xml.Namespace

url = "http://wsf.cdyne.com//WeatherWS/Weather.asmx?WSDL"
wsdl = new Namespace("http://schemas.xmlsoap.org/wsdl/","wsdl")
doc = new XmlParser().parse(url)
println doc[wsdl.portType][wsdl.operation].'@name'
