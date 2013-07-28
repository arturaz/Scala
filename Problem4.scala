/* Problem description:
* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
* 
* Find the largest palindrome made from the product of two 3-digit numbers.
*/

package Problem4

object Problem4 {
def IsPalindrome(s: String): Boolean = s.reverse.mkString == s

def main(args: Array[String]){
  val palindromes = for (a <- (100 until 1000); b <- (a until 1000);  val p = a*b if IsPalindrome(p.toString)) yield p
  println("Answer: "+palindromes.max)


}
}