package Array;
import java.util.*;
public class Largest2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Array Element ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Largest Element: "+getMax(arr,n));
        System.out.println("The Largest Element: "+getMin(arr,n));
    }

    static int getMax(int arr[], int n){
        int res = arr[0];
        for(int i = 1; i<n;i++)
        res = Math.max(res, arr[i]);
        return res;

    }

    static int getMin(int arr[],int n){
        int res = arr[0];
        for(int i = 0; i<n;i++)
        res = Math.min(res,arr[i]);
        return res;
    }
}
/*
     Time Complexity: O(n)
     Auxiliary Space: O(1), as no extra space is used
 */
