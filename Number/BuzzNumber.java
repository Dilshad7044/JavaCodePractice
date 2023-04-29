/*A number is said to be Buzz Number if it ends with 7 or is divisible by 7. 
Example: 1007 is a Buzz Number.
 */
package Number;
import java.util.*;
public class BuzzNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number : ");
    int num  = sc.nextInt();
    System.out.println(isBuzz(num)? "Buzz Number": "Not Buzz NUmber");
  }  

  static boolean isBuzz(int num){
   if(num % 10 == 7 || num % 7 == 0 ) // because end with 7 or divisible by 7
       return true;

    return false;
    
  }
}
