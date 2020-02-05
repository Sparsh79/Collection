def reverse[A](list: List[A]): List[A] = {
  def reversed(rev: List[A], rem: List[A]): List[A] = rem match {
    case Nil => rev
    case head :: tail => reversed(head :: rev, tail)
  }
  reversed(Nil, list)
}
reverse(List(6,4,7,5,2))
