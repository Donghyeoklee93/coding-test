package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int countOfNumber = Integer.parseInt(st.nextToken());
        int countOfQuestion = Integer.parseInt(st.nextToken());

        long[] number = new long[countOfNumber + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= countOfNumber; i++) {
            number[i] = number[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < countOfQuestion; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(number[j] - number[i - 1]);
        }
    }
}
