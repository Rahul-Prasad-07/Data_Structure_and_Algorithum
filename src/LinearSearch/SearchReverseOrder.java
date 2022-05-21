package LinearSearch;

import java.util.Scanner;

public class SearchReverseOrder {
     public static void main(String args[]){
         Scanner input = new Scanner(System.in);
         //Declare the array here
         int count = input.nextInt();
         int[] array = new int[count];



         for (int i = 0; i < count; i++) {
             array[i] = input.nextInt();
         }
         int key = input.nextInt();
         input.close();
         //write your code here
         int ans = Research(array,key);
         System.out.println(ans);

     }

     static int Research(int array[], int key){
         for (int i= array.length -1; i>0; i--) {
             if(array[i] == key) {
                 return array.length -1 -i;
             }
         }
         return -1;
     }


 }
