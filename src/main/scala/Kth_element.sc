def kth(list: List[Int] , n:Int): Int = {
  list match {
    case Nil => 0
    case first :: Nil => first
    case first :: rest => if (n <= 0) first
    else kth(rest,n-1)
  }
}
kth(List(2,3,4,5,7,8),3)
