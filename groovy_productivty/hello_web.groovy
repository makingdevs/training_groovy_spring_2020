html.html {
  head {
    title "Hello world in Groovlets"
  }
  body {
    h1 "Welcome to Groovlets in MakingDevs"
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
