package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestInput {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String line = input.readLine();
        int n = Integer.parseInt(line);

        System.out.println(n);
    }


}