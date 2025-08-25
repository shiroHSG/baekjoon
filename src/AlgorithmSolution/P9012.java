package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String s = br.readLine();
            char[] p = s.toCharArray();

            if(isVPS(p)) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isVPS(char[] p) {
        char[] stack = new char[p.length];
        int top = -1;
        for(char c : p) {
            if(c == '(') stack[++top] = c;
            else {
                if(top == -1) return false;
                top--;
            }
        }
        if(top==-1) return true;
        else return false;
    }
}
