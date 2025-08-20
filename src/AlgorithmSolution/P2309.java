package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2309 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];

        for(int i = 0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0; i<9; i++) {
            for(int j=i+1; j<9; j++) {
                int k = 0;
                int sum = 0;
                while(k < 9) {
                    if(k!=i && k!=j)
                        sum += arr[k];
                    k++;
                }
                if(sum == 100) {
                    for(int l = 0; l<9; l++) {
                        if(l!=i && l!=j)
                            sb.append(arr[l]).append("\n");
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}
