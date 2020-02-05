def compress(list :List[Int]) : List[Int] ={
  list match {
    case Nil => Nil
    case head :: Nil =>  list
    case head :: tail if (head == tail.head) => compress(tail)
    case head :: tail =>  head :: compress(tail)
    }
  }
compress(List(1,2,2,2,2))
