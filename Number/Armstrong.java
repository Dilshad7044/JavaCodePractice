/*  Armstrong Number is a positive number if it is equal to the sum of cubes of its digits
 is called Armstrong number and if its sum is not equal to the number then its not a 
 Armstrong number. Armstrong Number Program is very popular in java,
 c language, python etc. Examples: 153 is Armstrong, (1*1*1)+(5*5*5)+(3*3*3) = 153*/

package Number;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        int r,q;
        q=a;
        int sum = 0;
        while(q>0){
            r = q%10;
            sum = sum + (r*r*r);
            q = q/10;
        }
        if(sum == a){
            System.out.println("Armstrong "+sum);
        }
        else{
            System.out.println("Not Armstrong: "+sum);
        }
           

    }
}
