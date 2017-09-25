object session {


  def balance(chars: List[Char]): Boolean =
    if (countClose(chars: List[Char], 0) == countOpen(chars: List[Char], 0)) true
    else false

  def countClose(chars: List[Char], close: Int): Int =
    if (!chars.tail.isEmpty) countClose(chars.tail, accParenthesis(chars.head, close, ')' ) )
    else accParenthesis(chars.head, close, ')' )

  def countOpen(chars: List[Char], open: Int): Int =
    if (!chars.tail.isEmpty) countOpen(chars.tail, accParenthesis(chars.head, open, '(' ) )
    else accParenthesis(chars.head, open, '(' )

  def accParenthesis(char: Char, acc: Int, openOrClose: Char): Int =
    if (char.equals(openOrClose)) addOne(acc)
    else acc

  def addOne(acc: Int): Int = acc + 1

  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  pascal(3, 5)

  balance("holam())(undo".toList)

}

