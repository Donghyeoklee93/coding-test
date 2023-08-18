package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ2164 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static ArrayList number;

    static void input() {
        N = sc.nextInt();
        number = new ArrayList();

        for (int i = 1; i <= N; i++) {
            number.add(i);
        }
    }

    static int pro() {
        while (number.size() > 1) {
            number.remove(0);
            number.add(number.remove(0));
        }
        return (int) number.get(0);
    }

    public static void main(String[] args) {
        input();
        System.out.println(pro());
    }

}
