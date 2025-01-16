package AlgorithmSolution;

import java.util.Scanner;

public class P8958 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] ox = new String[n];
        int[] sum = new int[n];
        for(int i=0; i<n; i++) {
            ox[i] = input.next();
        }
        
        
        for(int i=0; i<n; i++) {
            int count = 1;
            for(int j=0; j<ox[i].length(); j++) {
                if(ox[i].charAt(j) == 'O') {
                    sum[i] += count++;
                }
                else {
                    count = 1;
                }
            }
            System.out.println(sum[i]);
        }

        input.close();
    }
}