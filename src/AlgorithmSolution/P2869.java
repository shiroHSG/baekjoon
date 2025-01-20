package AlgorithmSolution;

import java.util.Scanner;

public class P2869 {
    public static void main(String[] args) {
        int a;
        int b;
        int v;
        int h=0;
        int day=1;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        v = input.nextInt();

        while(true) {
            h += a;
            if(h>=v)
                break;
            h -=b;
            day++;
        }

        System.out.println(day);

        input.close();
    }
}
