package AlgorithmSolution;

import java.util.Scanner;

public class P2869_2 {
    public static void main(String[] args) {
        int a;
        int b;
        int v;
        int day;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        v = input.nextInt();

        int dayUp = a-b;
        int exceptOneDayHeight = v-a;
        double ceilValue = Math.ceil((double)exceptOneDayHeight/dayUp);
        day = (int)ceilValue + 1;
        

        System.out.println(day);

        input.close();
    }
}
