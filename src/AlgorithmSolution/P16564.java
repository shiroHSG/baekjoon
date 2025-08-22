package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16564 {
    static int N;   //캐릭터 수
    static long K;  //팀 목표 레벨
    static long[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Long.parseLong(st.nextToken());

        arr = new long[N];
        for(int i=0; i<N; i++) arr[i] = Long.parseLong(br.readLine());

        long min = arr[0];
        for(long m : arr) min = Math.min(m, min);
        long max = min+K;
        long ans = 0;

        while(min <= max) {
            long mid = min + (max-min)/2;

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
        long level = 0;

        for(int i=0; i<N; i++) {
            if(arr[i]<m) level += m-arr[i];
        }
        if(level<=K) return true;
        else return false;
    }
}
