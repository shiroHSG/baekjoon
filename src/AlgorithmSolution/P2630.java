package AlgorithmSolution;

import java.io.*;
import java.util.StringTokenizer;

public class P2630 {
    static byte[][] arr;

    static int w = 0;  //white = 0
    static int b = 0;  //blue = 1
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        arr = new byte[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j < N; j++) {
                arr[i][j] = Byte.parseByte(st.nextToken());
            }
        }

        checkSq(0, 0, N);

        // 출력
//        for(byte[] n : arr) {
//            for(byte m : n) System.out.print(m + " ");
//            System.out.println();
//        }

        System.out.println(w);
        System.out.println(b);
    }

    public static void checkSq(int is, int js, int n) {
        if(n<1) return;
        int count = 0;
        for(int i=is; i<is+n; i++) {
            for(int j=js; j<js+n; j++) {
                count += arr[i][j];
            }
        }
        if(count == 0) w++;
        else if(count == n*n) b++;
        else {
            n/=2;
            checkSq(is, js,n);
            checkSq(is, js+n,n);
            checkSq(is+n, js,n);
            checkSq(is+n, js+n,n);
        }
    }
}
