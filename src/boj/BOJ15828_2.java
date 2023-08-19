package boj;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class BOJ15828_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> router = new LinkedBlockingQueue<>(N);

        while (true) {
            int number = sc.nextInt();

            if (number > 0) {
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
