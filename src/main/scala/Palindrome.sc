def isPalindrome[A](list: List[Int]): Boolean ={
  val length = list.length
  list match {
    case Nil => false
    case _ :: Nil  => true
    case _ =>
      for (i <- 0 until (length / 2) ) {
  if (list(i) != list(length - i - 1) )
  false
  }
      true
  }

}
isPalindrome(List(1,2))

