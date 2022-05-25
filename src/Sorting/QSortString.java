package Sorting;

import java.util.Scanner;

public class QSortString {

        public static void quickSort(String array[], int left, int right) {
            if (left < right) {
                int position = partition(array, left, right);
                quickSort(array, left, position - 1);
                quickSort(array, position + 1, right);
            }

        }

        public static int partition(String array[], int left, int right) {
            String x = array[right];
            int i = left - 1;
            for (int j = left; j <= right - 1; j++) {
                if (array[j].length() <= x.length()) {
                    i++;
                    String tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            // swap
            String swap = array[i + 1];
            array[i + 1] = array[right];
            array[right] = swap;
            return i + 1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();

            String array[] = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.next();
            }

            // Sort in ascending order
            quickSort(array, 0, array.length - 1);

            for (String i : array) {
                System.out.println(i);
            }
        }
    }



