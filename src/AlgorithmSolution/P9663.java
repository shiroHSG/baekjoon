package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9663 {
    static int N;
    static int count;

    static boolean[] col;
    static boolean[] diag1;
    static boolean[] diag2;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        col = new boolean[N];
        diag1 = new boolean[2*N-1];
        diag2 = new boolean[2*N-1];

        dfs(0);

        System.out.println(count);
    }

    public static void dfs(int row) {
        if(row == N) {
             count++;
             return;
        }

        // 선택
        for(int c = 0; c<N; c++) {
            int d1 = row + c;
            int d2 = row - c + (N-1);

            if(col[c] || diag1[d1] || diag2[d2])
                continue;

            // 배치
            col[c] = diag1[d1] = diag2[d2] = true;

            // 다음 행
            dfs(row + 1);

            // 되돌리기
            col[c] = diag1[d1] = diag2[d2] = false;
        }
    }
}