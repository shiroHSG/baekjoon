package AlgorithmSolution;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        if(str.trim().isEmpty()) {
            System.out.println(0);
        }
        else {
        //trim() 앞뒤 공백제거, split() 구분자를 기준으로 str을 나눔
        //\\s+ 공백 줄바꿈 탭 등을 하나의 구분자로 봄
        String[] words = str.trim().split("\\s+");
        System.out.println(words.length);
        }
        input.close();
    }
}
