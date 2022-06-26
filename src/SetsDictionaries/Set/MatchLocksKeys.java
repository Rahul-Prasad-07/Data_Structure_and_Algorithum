package SetsDictionaries.Set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MatchLocksKeys {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }

        //write your code here
        Map<Integer, Character> map = new HashMap<Integer,Character>();

        for (int i = 0; i < locks.length; i++) {
            if (map.containsValue(locks[i])) {
                System.out.println("Not Possible");
            } else {
                map.put(i, locks[i]);
            }
        }

        for (int i = 0; i< keys.length; i++) {
            if (map.containsValue(keys[i])) {
                locks[i] = keys[i];
            } else {
                System.out.println("Not possible");
                return;
            }
        }

        System.out.println(map);

        for (int i = 0; i< map.size(); i++) {
            System.out.println(keys[i] + " " + locks[i]);
        }

    }
}
