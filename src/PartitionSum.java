import java.util.Scanner;

public class PartitionSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int s = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int minLength = n + 1; // 최소 길이 초기값을 n+1로 설정
        int left = 0, sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right]; // 오른쪽 포인터 확장

            // 현재 부분합이 S 이상인 동안 최소 길이를 갱신하고 왼쪽 포인터 이동
            while (sum >= s) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        // 결과 출력: 유효한 부분합이 없으면 0 출력
        System.out.println(minLength == n + 1 ? 0 : minLength);

        input.close();

    }
}
