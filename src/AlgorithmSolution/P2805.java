package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 나무 수
        long M = Integer.parseInt(st.nextToken());   // 필요한 길이

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int min = 0;
        int ans = 0;

        for(int m : arr) max = Math.max(max, m);

        while(min <= max) {
            int mid = min + (max-min)/2;
            long sum = 0L;

            for(int h : arr) {
                if(h>mid) sum += (h-mid);
            }

            if(sum >= M) {
                ans = mid;
                min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
