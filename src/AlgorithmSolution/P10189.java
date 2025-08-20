package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10189 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int ans = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        do {
            int sum = 0;
            for(int i=0; i<arr.length-1; i++) {
                sum += Math.abs(arr[i] - arr[i+1]);
            }
            ans = Math.max(ans, sum);
        } while(nextPermutation(arr));

        System.out.println(ans);
    }

    public static boolean nextPermutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i < 0) return false;
        int j = a.length - 1;
        while (a[i] >= a[j]) j--;
        swap(a, i, j);
        for (int l = i + 1, r = a.length - 1; l < r; l++, r--) swap(a, l, r);
        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
