package AlgorithmSolution;

import java.io.*;
import java.util.*;

public class P2261 {
    static int N;
    static int[][] arr; // 끝까지 x정렬만 유지

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x
            arr[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); // x축 정렬 유지
        System.out.println(dq(0, N - 1));
    }

    static int dq(int left, int right) {
        int n = right - left + 1;
        if (n <= 3) {
            long best = Long.MAX_VALUE;
            for (int i = left; i <= right; i++) {
                for (int j = i + 1; j <= right; j++) {
                    long dx = (long) arr[i][0] - arr[j][0];
                    long dy = (long) arr[i][1] - arr[j][1];
                    long d2 = dx * dx + dy * dy;
                    if (d2 < best) best = d2;
                }
            }
            return (int) best;
        }

        int mid = (left + right) >>> 1;
        int midX = arr[mid][0]; // arr는 x정렬 유지 중이라 x 중앙선 OK

        int leftMin = dq(left, mid);
        int rightMin = dq(mid + 1, right);
        long min = Math.min(leftMin, rightMin);

        // |x - midX|^2 < min 인 점만 모음
        List<int[]> strip = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            long dx = (long) arr[i][0] - midX;
            if (dx * dx < min) strip.add(arr[i]);
        }

        // strip만 y정렬
        strip.sort(Comparator.comparingInt(p -> p[1]));

        // 위→아래로 훑으면서 dy^2 >= min이면 브레이크
        for (int i = 0; i < strip.size(); i++) {
            for (int j = i + 1; j < strip.size(); j++) {
                long dy = (long) strip.get(j)[1] - strip.get(i)[1];
                if (dy * dy >= min) break;

                long dx = (long) strip.get(j)[0] - strip.get(i)[0];
                long d2 = dx * dx + dy * dy;
                if (d2 < min) min = d2;
            }
        }

        return (int) min;
    }
}
