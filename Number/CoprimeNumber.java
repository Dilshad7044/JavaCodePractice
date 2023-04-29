package Number;
import java.util.*;
public class CoprimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int co = isPrime(x, y);
        if(co == 1)
        System.out.println("Its CoPrime Number:");
        else
        System.out.println("Its not coprime number");
    }
    static int isPrime(int x, int y ){
        if(x==0)
        return y;
        if(y==0)
        return x;
        if(x==y)
        return x;
        if(x>y)
         return isPrime(x-y,y);
         else
         return isPrime(x,y-x);
    }
}
