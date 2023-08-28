package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2295_3 {


    //Binary search method
    static boolean isSearched(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] < target) {
                left = middle + 1;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sumArray = new int[N * (N + 1) / 2];
        int sumArrayIndex = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sumArray[sumArrayIndex] = arr[i] + arr[j];
                sumArrayIndex++;
            }
        }

        Arrays.sort(sumArray);
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int target = arr[i] - arr[j];
                if (isSearched(sumArray, target)) {
                    result = Math.max(result, arr[i]);
                }
            }
        }
        System.out.println(result);
    }
}
