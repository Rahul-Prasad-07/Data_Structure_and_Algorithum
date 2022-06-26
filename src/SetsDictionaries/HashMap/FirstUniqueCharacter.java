package SetsDictionaries.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here
        Map<Character, Integer> h = new LinkedHashMap<Character, Integer>();
        Boolean flag = false;
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (h.containsKey(ch) == false ){
                h.put(ch, 1);
            } else {
                h.put(ch, h.get(ch) + 1);
            }
        }

        for (Character ch : h.keySet()) {
            if (h.get(ch) == 1) {
                System.out.println(ch);
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(-1);
    }
}
