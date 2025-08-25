package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        Object[] stack = new Object[s.length()];    //스택
        int top = -1;

        char[] arr = s.toCharArray();   //괄호

        for(char c : arr) {
            //push
            if(c == '(' || c == '[') stack[++top] = c;
            //pop
            else {
                if(top == -1) return 0; //스택이 비엇을 경우
                int result = 0;
                while(top>=0 && stack[top] instanceof Integer) {
                    int n = (Integer) stack[top--];
                    result += n;
                }
                if (top < 0 || !(stack[top] instanceof Character)) return 0;
                char open = (Character) stack[top];

                if (c == ')' && open != '(') return 0;
                if (c == ']' && open != '[') return 0;

                int base = (open == '(') ? 2 : 3;
                stack[top] = (result == 0) ? base : base * result;
            }
        }
        int ans = 0;
        while(top >= 0){
            if(stack[top] instanceof Character) return 0;
            else {
                ans+=(Integer)stack[top--];
            }
        }
        return ans;
    }
}
