/*
Write a program to count the elements in an array which are greater than 35.

Input Format:
First line contains n, the size of an array.

Next line contains n-spaced integers representing array arr.

Output Format:
Print the number of the elements present in the array which are greater than 35.

Example 1
Input
5
12 67 89 16 23

Output
2

*/

package Array;
import java.util.Scanner;
public class ArrayProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Araay size: ");
        int n =sc.nextInt();
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Array Element");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findArray(arr,k);

    }
    static void findArray(int arr[], int k){
        int x = arr.length;
        int count=0;
        for(int i =0; i<x; i++){
            if(k < arr[i]){
                count++;
        }
           }
           System.out.print("Total number above of k : "+count);

}
}
