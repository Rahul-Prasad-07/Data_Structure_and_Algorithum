package Sorting;

import java.util.Scanner;

public class QuickSortDescending {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = scanner.nextInt();
        }
        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

    public static void quickSort(int[] ar, int start, int end) {
        if (start < end) {
            int p = partition(ar, start, end);
            quickSort(ar, start, p );
            quickSort(ar, p + 1, end);
        }
    }

    public static int partition(int[] ar, int start, int end) {
        int pivot = ar[start];
        // for ascending int i = start;
        int i = start;
        // end to start for descending
        for (int j = start+1; j <= end; j++) {
            if (ar[j] > pivot) {
                i = i + 1; //i++
                int temp = ar[i];
                ar[i]= ar[j];
                ar[j]= temp;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[start];
        ar[start] = temp2;

        return i;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
        System.out.println();
    }
}
