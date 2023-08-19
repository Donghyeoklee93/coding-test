package boj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BOJ1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> people = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < K; j++) {
                people.add(people.poll());
            }
            result[i] = people.poll();
        }

//        System.out.println(Arrays.stream(result)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining(", "))
//        );

        System.out.println("<" + Arrays.stream(result)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + ">");


    }
}
