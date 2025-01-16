package AlgorithmSolution;

import java.util.Scanner;

public class P4344 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(new File("test.txt"));
        Scanner input = new Scanner(System.in);  
        int c = input.nextInt();
        double[] ratio = new double[c];

        for(int i=0; i<c; i++) {
            int sum = 0;
            int n = input.nextInt();
            int[] scoreArr = new int[n];
            for(int j=0; j<scoreArr.length; j++) {
                scoreArr[j] = input.nextInt();
                sum+=scoreArr[j];
            }
            int count =0;
            for(int j=0; j<scoreArr.length; j++) {
                double avg = (double)sum/scoreArr.length;
                if(scoreArr[j]>avg) {
                    count++;
                }
            }
            ratio[i] = ((double)count/scoreArr.length)*100;
        }

        for(int i=0; i<c; i++) {
            System.out.println(ratio[i]+"%");
        }

        input.close();
    }
}
