package boj;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ2346 {

    static class Balloon {
        int index;
        int number;

        Balloon(int index, int number) {
            this.index = index;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Deque<Balloon> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.add(new Balloon(i, sc.nextInt()));
        }

        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int index = queue.peek().index;
            result[i] = index + 1;
            int number = queue.poll().number;

            if (number > 0) {
                for (int k = 1; k < number; k++) {
                    queue.addLast(queue.pollFirst());
                }

            } else {
                for (int k = 0; k < -number; k++) {
                    queue.addFirst(queue.pollLast());
                }
            }
        }
        for (int z = 0; z < N; z++) {
            System.out.print(result[z] + " ");
        }
    }
}


