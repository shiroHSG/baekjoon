package AlgorithmSolution;

import java.math.BigInteger;
import java.util.Scanner;

public class P1914 {
    static StringBuilder result = new StringBuilder();
    static int N;
                                    //시작, 임시, 목표
    public static void hanoi(int n, int start, int temp, int target) {
        if(n == 1) {
            result.append(start).append(" ").append(target).append("\n");
            return;
        }
        
        hanoi(n-1,start,target,temp);
        result.append(start).append(" ").append(target).append("\n");
        hanoi(n-1,temp,start,target);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N= input.nextInt();

        BigInteger count = BigInteger.valueOf(2).pow(N).subtract(BigInteger.ONE);
        System.out.println(count);

        if(N<20) {
            hanoi(N, 1, 2, 3);
            System.out.println(result);
        }

        


        input.close();
    }
}
