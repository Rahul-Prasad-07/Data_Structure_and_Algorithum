package Sorting;

import java.util.Scanner;


public class NumberOfSwap {

    static int totalBubbleSortSwaps(int[] array, int m) {
        int swaps = 0;
        boolean isDone;
        for (int k = 0; k < (array.length - 1); k++) {
            isDone = true;
            for (int j = 0; j < array.length - k - 1; j++) {
                if (array[j] > array[j + 1]) {   // <----- changed to > from   <
                    isDone=false;

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    if (m > 0) {
                        swaps++;    // <---- update swap count
                    }

                }
            }

            if (isDone) {
                break;
            }
            m--;              //<---- decrement m
        }


        return swaps;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(array, m));
    }
}





