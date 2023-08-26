package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1920 {


    static boolean binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] > x) {
                right = middle - 1;
            } else if (arr[middle] < x) {
                left = middle + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];

        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        for (int i = 0; i < M; i++) {
            if (binarySearch(arr1, arr2[i]) == true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
