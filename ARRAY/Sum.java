package Array;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       // SumofArray(arr, n);
        Sum s = new Sum();
        s.SumofArray(arr);
    }
     void SumofArray(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum +=arr[i];
        }
          System.out.println("Sum Of Array: "+sum);  
    }
}
