/* Problem description:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package Problem1

object Problem1 {
  
	val r1 = 0 until 1000
	def divides(i:Int) = if (i % 3 == 0 || i % 5 == 0) true else false
	val r2 = r1.filter(x => divides(x))
	val sum:Int = r2.sum
	
	def main(args: Array[String]){
           println("Answer: "+sum)
	}
}