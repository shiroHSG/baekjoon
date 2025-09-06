package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P13334 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = Math.min(a, b);
            arr[i][1] = Math.max(a, b);
        }
        Arrays.sort(arr,(a, b) -> a[1] - b[1]);

        int d = Integer.parseInt(br.readLine());
        int ans = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++) {
            pq.add(arr[i][0]);

            int min = arr[i][1]-d;
            while(!pq.isEmpty() && pq.peek() < min) {
                pq.remove();
            }

            ans = Math.max(ans, pq.size());
        }

        System.out.println(ans);
    }
}
