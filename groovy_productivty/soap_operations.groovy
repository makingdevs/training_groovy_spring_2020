import groovy.xml.Namespace

url = "http://currencyconverter.kowabunga.net/converter.asmx?WSDL"
wsdl = new Namespace("http://schemas.xmlsoap.org/wsdl/","wsdl")
doc = new XmlParser().parse(url)
println doc[wsdl.portType][wsdl.operation].'@name'
