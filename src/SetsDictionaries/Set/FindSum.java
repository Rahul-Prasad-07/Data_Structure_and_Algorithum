package SetsDictionaries.Set;
import java.util.HashSet;
import java.util.Scanner;

public class FindSum {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();

        //write your code here
        HashSet<Integer> hashSet = new HashSet<>();
        boolean isTrue = false;
        for (int a: array) {
            int difference = targetSum - a;
            if (hashSet.contains(difference)) {
                isTrue = true;
            } else {
                hashSet.add(a);
            }
        }

        System.out.println(isTrue);
    }
}
