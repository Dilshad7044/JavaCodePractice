package Number;
import java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        factorial(num);
    }
    public static void factorial(int num){
        int fact =1;
        while(num>0){
            fact*=num;
            num--;
        }
        System.out.println(fact);
    }

    
}
