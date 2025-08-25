package AlgorithmSolution;

import java.io.IOException;
import java.io.*;
import java.util.StringTokenizer;

public class P10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] stack = new int[N];
        int top = -1;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch(cmd) {
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    stack[++top] = n;
                    break;
                case "pop":
                    if(top == -1) sb.append(-1).append("\n");
                    else sb.append(stack[top--]).append("\n");
                    break;
                case "size":
                    sb.append(top+1).append("\n");
                    break;
                case "empty":
                    if(top == -1) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "top":
                    if(top == -1) sb.append(-1).append("\n");
                    else sb.append(stack[top]).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
