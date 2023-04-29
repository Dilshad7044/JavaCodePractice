package Array;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter " +n+ " Element: ");
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        findLargest(arr);
    }
    static void findLargest(int arr[]){
        int max=0;
        int min = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else{
                min=arr[i];
            }
        }
        System.out.println("Largest Element : "+max);
        System.out.println("Smallest Element : "+min);
    }
}
