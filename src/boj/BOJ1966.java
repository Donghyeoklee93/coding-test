package boj;

import java.util.*;

public class BOJ1966 {

    static class Print {
        int index;
        int priority;

        Print(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<Print> print = new LinkedList<>();
            Integer[] prioritySequence = new Integer[N];

            for (int i = 0; i < N; i++) {
                prioritySequence[i] = sc.nextInt();
                print.offer(new Print(i, prioritySequence[i]));
            }

            Arrays.sort(prioritySequence, Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                while (prioritySequence[i] != print.peek().priority) {
                    print.offer(print.poll());
                }

                if (print.peek().index == M) {
                    System.out.println(i + 1);
                    break;
                }
                print.poll();
            }
        }
    }
}
