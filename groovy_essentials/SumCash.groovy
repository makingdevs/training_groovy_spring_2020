class Money{
  int amount
  String currency

  Money plus(Money other){
    if(null == other) return this
      if(other.currency != currency){
        throw new IllegalArgumentException("Invalid operation[$other.currency + $currency]")
      }
    return new Money(amount:amount + other.amount, currency:currency)
  }

 String toString(){
    "\$ $amount $currency"
  }
}

Money cuenta1 = new Money(amount:10,currency:"MNX")
Money cuenta2 = new Money(amount:40,currency:"MNX")
println cuenta1 + cuenta2
