package Array;

import java.util.Arrays;

public class Largest3 {
    public static void main(String[] args) {
        int[] arr = {10,41,2,56,84,13,4,6};

        //Implemented inbuilt function to sort array
        Arrays.sort(arr);

        // after sorting the value at 0th position will minimum and
        //nth position will be maximum
        System.out.println("Min: "+arr[0]+" Max: "+arr[arr.length-1]);
    }
}
/* Time complexity : O(n log(n))
   Auxiliary Space : O(n)
 */
