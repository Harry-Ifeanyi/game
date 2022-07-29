
object demo {
  case class Salesman(name: String, sales: BigDecimal)
    def topSales(salesmen: List[Salesman]): Option[Salesman] = {
      salesmen.filter {
        _.sales >= 10000
      }
        .sortBy {
          -_.sales
        }
        .headOption

  }


  val monday: List[Salesman] = List(
    Salesman("James", 7800),
    Salesman("Harry", 50000),
    Salesman("Joy", 40000),
    Salesman("Mike", 45000)
  )

}

object app extends App{
  import demo._
val mondayTop : Option[Salesman] = topSales(monday)
   print(mondayTop)

}


