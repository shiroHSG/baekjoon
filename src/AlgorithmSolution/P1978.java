package AlgorithmSolution;

import java.util.Scanner;

public class P1978 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numArray = new int[n];

        for(int i=0; i<n; i++) {
            numArray[i] = input.nextInt();
        }

        int prime = 0;
        for(int i=0; i<n; i++) {
            boolean isPrime = true;
            if(numArray[i]<2)
                isPrime = false;
            for(int j=2; j<=Math.sqrt(numArray[i]); j++) {
                if(numArray[i]%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                prime++;
        }
        System.out.println(prime);
        input.close();
    }
}
