package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ15828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> router = new LinkedList<>();

        while (true) {
            int number = sc.nextInt();

            if (number > 0 && router.size() < N) {
                router.offer(number);
            } else if (number == 0) {
                router.poll();
            } else if (number == -1) {
                break;
            }
        }
//        System.out.println(router);
        if (router.size() == 0) {
            System.out.println("empty");
        }
        while (!router.isEmpty()) {
            System.out.print(router.poll() + " ");
        }
    }
}
