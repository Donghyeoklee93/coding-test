package boj;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int lastValue = -1;
        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                lastValue = Integer.parseInt(cmd[1]);
                q.offer(lastValue);
            } else if (cmd[0].equals("pop")) {
                if (q.isEmpty())
                    bw.write("-1\n");
                else bw.write(q.poll() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(q.size() + "\n");

            } else if (cmd[0].equals("empty")) {
                if (q.isEmpty())
                    bw.write("1\n");
                else bw.write("0\n");

            } else if (cmd[0].equals("front")) {
                if (q.isEmpty())
                    bw.write("-1\n");
                else bw.write(q.peek() + "\n");
            } else if (cmd[0].equals("back")) {
                if (q.isEmpty())
                    bw.write("-1\n");
                else bw.write(lastValue + "\n");

            }
        }
        bw.flush();
    }
}
