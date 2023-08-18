package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11659_2 {
    static Scanner sc = new Scanner(System.in);
    static int N; // Number of elements
    static int M; // Number of times to calculate the sum

    static int[] numArray, prefixSum;
    static int numFrom, numTo;

    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();

        numArray = new int[N + 1];
        prefixSum = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            numArray[i] = sc.nextInt();
            prefixSum[i] = prefixSum[i - 1] + numArray[i];
        }

        //check
//        System.out.println(Arrays.toString(numArray)); //[0, 5, 4, 3, 2, 1]
//        System.out.println(Arrays.toString(prefixSum)); //[0, 5, 9, 12, 14, 15]
    }

    static int pro(int numFrom, int numTo) {
        return prefixSum[numTo] - prefixSum[numFrom - 1];
    }

    public static void main(String[] args) {
        input();

        for (int i = 0; i < M; i++) {
            numFrom = sc.nextInt();
            numTo = sc.nextInt();
            System.out.println(pro(numFrom, numTo));
        }
    }
}
