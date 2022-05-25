package Sorting;

import java.util.Scanner;

public class Graded3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        // Write your code here
        int temp1=0;
        int temp2=0;


        for(int i=0; i < array1.length-1;i++)
            if (array1[i] > array1[i+1]){
                temp1=array1[i];
                temp2=array1[i+2];
            }


        int temp3 = -1;
        for(int j=0; j<array2.length-1;j++)
            if(array2[j] > temp1 && array2[j] < temp2)
                if(array2[j]>temp3)
                    temp3 = array2[j];

        if(temp3 == -1)
            System.out.println("Not Possible\n");
        else
            System.out.println(temp3);

    }
}

