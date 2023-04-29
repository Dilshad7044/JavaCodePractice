package Number;
import java.util.*;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
       System.out.println(isAutomorphic(num)?"Automorphic":"Not Automorphic");
    }
    static boolean isAutomorphic(int num){
        int square = num * num;
        while (num > 0)   
         {   
            if (num % 10 != square % 10) 
            return false;
            num = num/10;   
            square = square/10;   

          }
        return true;   
}      
 }

