package SetsDictionaries.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {

        // creating a HashSet named "hashSet"
        Set<Integer> hashSet = new HashSet<Integer>();

        // adding elements to the hashSet
        hashSet.add(6);
        hashSet.add(6);

        // removing the element 6 from the hashset
        hashSet.remove(6);

        System.out.println(hashSet.contains(6));


        TreeSet tSet = new TreeSet();

        // adding elements to it
        tSet.add("4");
        tSet.add("2");
        tSet.add("7");
        tSet.add("5");
        tSet.add("9");

        // printing the TreeSet
        System.out.println(tSet);
    }
}
