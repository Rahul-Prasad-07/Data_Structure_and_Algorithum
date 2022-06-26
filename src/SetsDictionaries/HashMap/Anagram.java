package SetsDictionaries.HashMap;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key = null;
        String value = null;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        boolean flag = false;
        List<String> l = new ArrayList<String>();
        for (String s: map.keySet()){
            if (check(s, map.get(s))){
                l.add(s);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("false");
        } else {
            Collections.sort(l);
            for (String s: l){
                System.out.println(s + " : "+ map.get(s));
            }
        }

    }

    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
        if (ch1.length == ch2.length) {
            arrange(ch1);
            arrange(ch2);
            for (int i = 0; i<ch1.length; i++){
                if (ch1[i] != ch2[i])
                    return false;
            }
            return true;
        } else {
            return false;
        }

    }

    private static void arrange(char[] ch) {
        char temp;
        for (int i=0; i< ch.length-1; i++){
            for (int j =0; j<ch.length-1-i; j++){
                if (ch[j] > ch[j+1]){
                    temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
    }


}
