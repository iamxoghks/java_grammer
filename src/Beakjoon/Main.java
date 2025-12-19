package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[n];

        NandM(sb, n, m);
        System.out.println(sb);

    }

    public static void NandM(StringBuilder sb, int n, int m) {
        if(m == 0) return;
        for(int i = 1; i < n; i++) {
            sb.append(i).append("\n");
            NandM(sb, n-1, m-1);
        }
    }
}
