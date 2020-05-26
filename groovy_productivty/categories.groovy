import groovy.time.TimeCategory

class FormatUtil {
  static toFormat(numero){
    if(numero.size() == 10) "${numero[0..2]} - ${numero[3..5]} - ${numero[6..9]}"
  }
}

use(FormatUtil){
  println "1234567890".toFormat()
  println new StringBuffer("0987654321").toFormat()
}

use(TimeCategory){
  println 1.minute.from.now
  println 10.hours.ago
  def today = new Date()
  println today - 3.months
}
