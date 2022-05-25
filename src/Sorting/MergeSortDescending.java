package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortDescending {
    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }


        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array

        //Complete this function
         static int[] mergeSort(int[] numbers, int first, int last)
        {
            if (last <= first)
                return numbers;
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);
            merge(numbers, first, mid, last);
            return numbers;
        }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......
    private static void merge(int[] array, int low, int mid, int high) {
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] > rightArray[rightIndex]) {
                    //(leftArray[leftIndex] > rightArray[rightIndex]) for decreasing order
                    //(leftArray[leftIndex] < rightArray[rightIndex]) increasing order
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }

}


