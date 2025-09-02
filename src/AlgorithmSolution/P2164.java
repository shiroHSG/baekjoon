package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<N; i++) {
            dq.addLast(i+1);
        }

        while(dq.size() > 1) {
            dq.removeFirst();
            int t = dq.removeFirst();
            dq.addLast(t);
        }
        System.out.println(dq.peekFirst());
    }
}
