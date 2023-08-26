package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ14425 {
    static int result = 0;

    static void binarySearch(String[] arr, String x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle].compareTo(x) < 0) {
                left = middle + 1;
            } else if (arr[middle].compareTo(x) > 0) {
                right = middle - 1;
            } else {
                result += 1;
                return;
            }
        }
    }

    public static void main(String[] args) {

//        System.out.println("A".compareTo("A")); //0
//        System.out.println("B".compareTo("A")); //1
//        System.out.println("A".compareTo("B")); // -1

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] arr1 = new String[N];
        String[] arr2 = new String[M];

        for (int i = 0; i < N; i++) {
            arr1[i] = sc.next();
        }

        for (int i = 0; i < M; i++) {
            arr2[i] = sc.next();
        }

        Arrays.sort(arr1);

        for (int i = 0; i < M; i++) {
            binarySearch(arr1, arr2[i]);
        }
        System.out.println(result);
    }
}

