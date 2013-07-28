/* Problem description:
* The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143 ?
* 
*  Mano kompas neisveza tokio skaiciaus :D ilgai skaiciuoja labai, bet su mazesniais skaiciais veikia teisingai
*/

package Problem3

object Problem3 {
  
    def NumberLargestFactor(n:Long) = {
    var x = n    
    var factors:List[Long] = List()
    var i:Long = 2
    
    if(x > 1){
      while(i != n){
        while(x % i == 0 && x/i > 1){
          factors = factors :+ i
          x/=i
        }
        i = i+1
      }
     factors = factors :+ x
    }

      println("Answer: " + factors.max)
    
  }
    
def main(args: Array[String]){

  NumberLargestFactor(600851475143L)
}
}