package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1654 {
    static int K, N;
    static long arr[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());   //가지고 있는 랜선의 개수
        N = Integer.parseInt(st.nextToken());   //필요한 랜선의 개수

        arr = new long[K];
        for(int i=0; i<K; i++) arr[i] = Long.parseLong(br.readLine());

        long min = 1;
        long max = 0;

        for(int i=0; i<K; i++) max = Math.max(max, arr[i]);

        long ans = 0;

        while(min <= max) {
            long mid = min+(max-min)/2;
            if(check(mid)) {
                ans = mid;
                min = mid+1;
            }
            else {
                max = mid-1;
            }
        }

        System.out.println(ans);
    }
    public static boolean check(long m) {
        int count = 0;
        for(int i=0; i<K; i++) {
            long l = arr[i];
            count += arr[i] / m;
            if(count >= N) return true;
        }
        return false;
    }
}
