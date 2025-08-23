package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    A를 B번 곱한 수를 C로 나눈 나머지를 출력
 */
public class P1629 {
    static int A, B, C;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken()); // 곱해지는 수
        B = Integer.parseInt(st.nextToken()); // 몇 번 곱할지
        C = Integer.parseInt(st.nextToken()); // 나눌 수

        int r = modNum(B);
        System.out.println(r);
    }

    public static int modNum(int mod) {

    }
}
