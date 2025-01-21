package AlgorithmSolution;

import java.util.Scanner;

public class P10872 {

    public static int factorial(int n) {
        if(n<=1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int f = input.nextInt();

        System.out.println(factorial(f));

        input.close();
    }
}