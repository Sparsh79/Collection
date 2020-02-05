def drop[A](n: Int, l: List[A]):List[A] = {
  def droped[A](c: Int, res: List[A], rem: List[A]):List[A] = (c, rem) match {

    case (_, Nil) => res
    case (1, _::tail) => droped(n, res, tail)
    case (_, h::tail) => droped(c -1, res:::List(h), tail)
  }
  droped(n, List(), l)
}
drop(2, List(1,2,1))
