package SetsDictionaries.HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class FindSymmetricPairs {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        boolean flag = false;
        for (int i=0; i<arr.length; i++) {
            int first1 = arr[i][0];
            int second1 = arr[i][1];

            Integer data = hashMap.get(second1);

            if (data != null && data == first1) {
                System.out.println(second1 + " " + first1);
                flag = true;
            } else {
                hashMap.put(first1, second1);
            }
        }
        if (!flag)
            System.out.println("No Symmetric pair");
    }
}
