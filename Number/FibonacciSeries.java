package Number;
import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        isFibonacci(num);
    }
    static void isFibonacci(int num){
        int n1=0,n2=1,n3=0;
        while(num>0)
        {
            System.out.println(n1);
            n3 =n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}