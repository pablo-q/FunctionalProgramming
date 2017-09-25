package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if( c == 0 || c == r) 1
      else pascal( c-1, r-1 ) + pascal( c, r-1 )
  
  /**
   * Exercise 2
    *
   */
    def balance(chars: List[Char]): Boolean = {
      def findParenthesis( chars : List[Char], open: Int, close: Int ): Boolean =
        if(chars.head == '(' ){
          open+1
        }
        if(chars.head == ')' ){
          close+1
        }
        if(close>open) false
        if( chars.tail.isEmpty && close == open ) true
        if( !chars.tail.isEmpty ) findParenthesis(chars, open, close)

        findParenthesis( chars, 0, 0)
    }





  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
