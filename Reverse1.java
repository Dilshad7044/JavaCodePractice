package Array;
import java.io.*;
import java.util.*;
public class Reverse1 {

    public static void reverseArray(int arr[], int start, int end)
    {
        //Write code here
		int[] ans = new int[end];
            //int j = 0;
            for(int i = end; i>=0;i--){
                ans[start++] = arr[i];
            }	
		}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        
        reverseArray(arr1, 0, n-1);
        
        for (int i = 0; i < n; i++)
             System.out.print(arr1[i] + " ");       
        System.out.println('\n');
    }
}