package SetsDictionaries.HashMap;

import java.util.*;

public class TheAirline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();

        }

        printDuplicates(arr, n);


    }
    private static void printDuplicates(int[] arr, int n) {
    Map<Integer,Integer> map = new HashMap<>();
    int count = 0;
    boolean dup = false;
        for(int i = 0; i < n; i++){
        if(map.containsKey(arr[i])){
            count = map.get(arr[i]);
            map.put(arr[i], count + 1);
        }
        else{
            map.put(arr[i], 1);
        }
    }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            // if frequency is more than 1
            // print the element
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+ " ");
                dup = true;
            }
        }
        if(!dup){
            System.out.println("-1");
        }
    }

}
