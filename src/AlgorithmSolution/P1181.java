package AlgorithmSolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class P1181 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<String>((a, b) -> {
            if(a.length() == b.length()) return a.compareTo(b);
            else return a.length()-b.length();
        });

        for(int i=0; i<N; i++) set.add(br.readLine());

        for(String s : set) sb.append(s).append("\n");

        System.out.println(sb);
    }
}
