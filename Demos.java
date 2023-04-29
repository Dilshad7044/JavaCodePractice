package Array;
import java.util.*;
public class Demos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Array Element");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        } 
         PrintArray(arr,n);
        }

        static void PrintArray(int arr[],int n){
           // int n1 = arr.length();
            System.out.println("Printed Array");
            for(int i = 0; i<n;i++){
                System.out.println(arr[i]);
            }
        }
    }
