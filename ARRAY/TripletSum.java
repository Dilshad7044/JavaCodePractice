package Array;
import java.util.*;
public class TripletSum {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter an Array Size:  ");
        int n = sc.nextInt();
        System.out.println("Enter x number :");
        int x = sc.nextInt();
        System.out.println("Enter Array Element: ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        TripletSum ts = new TripletSum();
        ts.check(arr,x);
    }
    void check(int arr[],int x){
       int n =arr.length;
       int count= 0;
       int sum = 0;
       for(int i = 0; i<n;i++){
          sum=arr[i]+arr[i+1]+arr[i+2];
          if(sum==x){
            count++;
          }
       }
       System.out.println("total count : "+count);
    }
}
