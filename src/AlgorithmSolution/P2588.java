package AlgorithmSolution;

import java.util.Scanner;

public class P2588 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();

        int mul = second*first;

        int s3 = second/100;
        int s2 = (second%100)/10;
        int s1 = second%10;


        System.out.println(s1*first);
        System.out.println(s2*first);
        System.out.println(s3*first);
        System.out.println(mul);

        input.close();
    }
}
