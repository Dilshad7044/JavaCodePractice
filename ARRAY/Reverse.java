package Array;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = Sc.nextInt();
        System.out.println("Enter Array Element: ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println("Before Reverse: ");
        PrintArray(arr);
        System.out.println("After Reverse: ");
        int[] ans = ReverseArray(arr);
        PrintArray(ans);
    }
    static void PrintArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static int[] ReverseArray(int arr[]){
        int n = arr.length;
            int[] ans = new int[n];
            int j = 0;
            for(int i = n-1; i>=0;i--){
                ans[j++] = arr[i];
            }
            return ans;
    }
    
}
