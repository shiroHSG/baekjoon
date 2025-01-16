package AlgorithmSolution;

import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<x)
             System.out.print(arr[i]+" ");
        }
        input.close();
    } 
}
