package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    A를 B번 곱한 수를 C로 나눈 나머지를 출력
 */
public class P1629 {
    static long C;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken()); // 곱해지는 수
        long B = Integer.parseInt(st.nextToken()); // 몇 번 곱할지
        C = Integer.parseInt(st.nextToken()); // 나눌 수

        long r = modNum(A, B);
        System.out.println(r);
    }

    /*
        a : 곱하는 수
        b : 곱해지는 횟수
     */
    public static long modNum(long a, long b) {
        a = a%C;
        long res = 1 % C;
        while(b>0) {
            if((b & 1) == 1)
                res = (res * a) % C;
            a = a*a % C;
            b = b >> 1;
        }
        return res;
    }
}
