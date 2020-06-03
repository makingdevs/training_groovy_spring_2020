if(!session) session = request.getSession(true)
if(!session.username) session.username = "MakingDevs"

html.html {
  head {
    title "Hello world in Groovlets"
  }
  body {
    h1 "Welcome to Groovlets in MakingDevs"
    ul {
      li "Method ${request.method}"
      li "URI ${request.requestURI}"
      li "Application ${context}"
      li "Params ${params}"
    }
    table(summaery: 'binding') {
      tbody {
        binding.variables.each { key, value ->
          tr {
            td key.toString()
            td(value ? value.toString() : 'n/a')
          }
        }
      }
    }
  }
}
