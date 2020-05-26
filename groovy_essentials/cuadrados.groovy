def cuadrado(n,block){
  for(int i=1; i <= n ; i++){
    block(i)
  }
}

cuadrado(20, { if((it%2)==1) println "El cuadrado de $it es ${it*it}" })
cuadrado(20) { if((it%2)==1) println "El cuadrado de $it es ${it*it}"}
cuadrado(20) {myNumber -> if((myNumber%2)==1) println "El cuadrado de $myNumber es ${myNumber*myNumber}"}
