/* Problem description:
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* 
*  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

package Problem5

object Problem5 {
def main(args: Array[String]){
  var trigger: Boolean = true
  var number: Int = 1
  var count: Int = 0
  while(trigger){
    for(i <- 1 to 20){
      
      if(number % i == 0){
        count += 1
      }
    }
    
     if(count == 20){
       println("Answer: "+ number)
        trigger = false
      }else{
        count = 0
        number += 1
      }
     }
  }
}