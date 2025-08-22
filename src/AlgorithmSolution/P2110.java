package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2110 {
    static int N, C;
    static long arr[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new long[N];
        for(int i=0; i<N; i++) arr[i] = Long.parseLong(br.readLine());

        Arrays.sort(arr);

        long min = 1;
        long max = arr[N-1]- arr[0];
        long ans = 0;

        while(min<=max) {
            long mid = min + (max - min) /2;
            if(check(mid)) {
                min = mid + 1;
                ans = mid;
            }
            else {
                max = mid - 1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(long mid) {
        long place = arr[0];
        int count = 1;

        for(int i=1; i<N; i++) {
            if(arr[i]-place>=mid) {
                place = arr[i];
                count++;
            }
            if(count>=C) return true;
        }
        return false;
    }
}

