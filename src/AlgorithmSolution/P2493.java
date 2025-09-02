package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2493 {
    static int[][] stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stack = new int[N][2];
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int top = -1;
        for(int i = 0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            while(top > -1 && n >= stack[top][1]) {
                top--;
            }
            if(top < 0) arr[i] = 0;
            else {
                arr[i] = stack[top][0];
            }

            top++;
            stack[top][0] = i+1;
            stack[top][1] = n;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb.toString());
    }
}
