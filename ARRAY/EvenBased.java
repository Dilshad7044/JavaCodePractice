package Array;
import java.util.*;
public class EvenBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size Array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println();
        for(int i =0; i<num; i++){
            arr[i]=sc.nextInt();
        }
        minDistance(arr);

    }

    static void minDistance(int arr[]){
        int n = arr.length;
        int even =0;
        int distance=0;
        int minDistance=-1;
        for(int i =0; i<n; i++){
            if(arr[i]%2==0){
                even = i; 
        }

        }
         
    }
}
