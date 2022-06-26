package SetsDictionaries.Set;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayOfContiguousInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        //array to store the input elements
        int[] array = new int[n];

        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // Write your code here
        if (areElementsContiguous(array, array.length))
            System.out.println(true);
        else System.out.println(false);
    }

    static boolean areElementsContiguous(int arr[], int n)
    {
        // Sort the array
        Arrays.sort(arr);

        for (int i = 1; i < n; i++)
            if (arr[i] - arr[i-1] > 1)
                return false;

        return true;
    }
}
