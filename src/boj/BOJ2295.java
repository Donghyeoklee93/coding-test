//package boj;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BOJ2295 {
//
//    //Binary search method
//    static boolean isExist(int[] arr, int target) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left <= right) {
//            int middle = (left + right) / 2;
//            if (arr[middle] < target) {
//                left = middle + 1;
//            } else if (arr[middle] > target) {
//                right = middle - 1;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    public static void main(String[] args) {
////        System.out.println(Integer.MAX_VALUE); // 2,147,483,647
//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//        // 1 2 3 => 11/12/13/22/23/33
//        // {A, B, C, D, F   // 2 3 5 10 18
//        // A + B + C = D    // 3 + 5 + 10 = 18
//        // A + B = D - C    // 3 + 5 = 18 - 10
//        // 1) A + B --> sumArray[]
//        int[] sumArray = new int[N * (N + 1) / 2];
//        int sumArrayIndex = 0;
//        for (int i = 0; i < N; i++) {
//            for (int j = i; j < N; j++) {
//                sumArray[sumArrayIndex++] = arr[i] + arr[j];
//            }
//        }
//
//        // 1) D - C --> sumArray[]
//        Arrays.sort(sumArray);
//        int ans = Integer.MIN_VALUE;
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                int target = arr[i] - arr[j];
//                //Binary Search
//                if (isExist(sumArray, target)) {
//                    ans = Math.max(ans, arr[i]);
//                }
//            }
//        }
//        System.out.println(ans);
//    }
//}
