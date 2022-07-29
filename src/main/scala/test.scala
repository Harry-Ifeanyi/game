object test{
  case class Jambites(name: String, score: Int)

  def highestJambScore(candidates: List[Jambites]):Option[Jambites]  = {
    candidates.filter{_.score >= 300}
      .sortBy{-_.score}
      .headOption
  }

def lowestJambScore(candidates: List[Jambites]) :Option[Jambites] = {
  candidates.filter{_.score <= 200}
    .sortBy{+_.score}.headOption
}

  val ThisYearCandidate: List[Jambites] = List(
    Jambites("Precious", 300),
    Jambites("Mark", 290),
    Jambites("James", 310),
    Jambites("Harry", 361),
    Jambites("Helen", 360),
    Jambites("Collins", 286),
    Jambites("Bolu", 189),
    Jambites("Matthew", 177)
  )
}



object api extends App{
  import test._

  val result :Option[Jambites] = highestJambScore(ThisYearCandidate)
  val badResult :Option[Jambites] = lowestJambScore(ThisYearCandidate)
  println("The highest Jamb score this year is : " + result )
  println("The lowest Jamb score this year is : " + badResult )
}


