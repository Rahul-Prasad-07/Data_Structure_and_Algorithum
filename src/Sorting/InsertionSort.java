package Sorting;

import java.util.Scanner;

public class InsertionSort {


        public static void insertSort(int[] arr){

            for( int i =1 ;i<arr.length;i++){
                int v = arr[i];
                int  j= i-1;

                while(j>=0 && v>arr[j]){
                    // For ascending order, change v > arr[j] to v < arr[j]
                    arr[j +1]=arr[j];
                    --j;
                }

                arr[j+1]=v;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            insertSort(arr);
            //System.out.println("Sorted array");
            for (int i = 0; i < arr.length; ++i) {
                System.out.print(arr[i]);
            }
        }
    }

