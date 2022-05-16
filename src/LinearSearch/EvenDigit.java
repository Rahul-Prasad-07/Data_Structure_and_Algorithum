package LinearSearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;

public class EvenDigit {


         public static void main(String[] args) {
            // Scanner Input = new Scanner(System.in);
             // int n = Input.nextInt();
            // int [] Array = new int[n];
             //for (int i=0; i<n; i++) {
             //    Array[i] = Input.nextInt();
            // }
            int[] nums = {12,345,2,6,7896,10,6,2};
            System.out.println(findNumbers(nums));

            //System.out.println(digits2(-345678));
        }
        static int findNumbers(int[] nums) {
            int count = 0;
            for(int num : nums) {
                if (even(num)) {
                    count++;
                }
            }
            return count;
        }

        // function to check whether a number contains even digits or not
        static boolean even(int num) {
            int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
            return numberOfDigits % 2 == 0;
        }

        static int digits2(int num) {
            if (num < 0) {
                num = num * -1;
            }
            return (int)(Math.log10(num)) + 1;
        }

        // count number of digits in a number
        static int digits(int num) {

            if (num < 0) {
                num = num * -1;
            }

            if (num == 0) {
                return 1;
            }

            int count = 0;
            while (num > 0) {
                count++;
                num = num / 10; // num /= 10
            }

            return count;
        }


    }

