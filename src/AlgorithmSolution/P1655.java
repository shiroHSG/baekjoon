package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((a, b) -> b - a);

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(br.readLine());
            maxPq.add(n);

            if(maxPq.size()-minPq.size()>1) {
                minPq.add(maxPq.poll());
            }

            if(!maxPq.isEmpty() && !minPq.isEmpty() && (maxPq.peek() > minPq.peek())) {
                minPq.add(maxPq.poll());
                maxPq.add(minPq.poll());
            }
            sb.append(maxPq.peek()).append("\n");
        }
        System.out.print(sb);
    }
}
