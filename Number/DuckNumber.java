package Number;
import java.util.*;
public class DuckNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int r, num;
        num = n;
        boolean flag = false;

        while(num > 0){
            r = num % 10;
            if( r == 0){
                flag = true;
            }
            num = num /10;
        }
        if(flag){
            System.out.println("Duck Number");
        }
        else
        System.out.println("Not Duct Number");


    }
}