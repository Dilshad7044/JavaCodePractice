

package Number;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(isPrime(num)?"Prime Number":"Not Prime Number");
    }
    static boolean isPrime(int num){
        for(int i = 2; i < num ; i++){
             if(num % i == 0 ){
             if(num == i)
             {
              return true;
             }
             else{
                return false;
             }
            }
        }
        return true;
    }
}
