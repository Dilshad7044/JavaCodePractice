package Array;
import java.util.*;
public class ReverseSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Element");
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse");
        PrintArray(arr);
        System.out.println("After Reverse");
        ReverseArray(arr);
        PrintArray(arr);
    }
    static void PrintArray(int[] arr){
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void ReverseArray(int[] arr){
        int j = arr.length-1, i= 0; 
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
