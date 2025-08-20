package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] countArr = new int[10001];

        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            countArr[num]++;
        }

        for(int i=0; i<countArr.length; i++) {
            while(countArr[i]-->0) {
                System.out.println(i);
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
