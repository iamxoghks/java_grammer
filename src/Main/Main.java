package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("트리 높이 입력: ");
        int h = Integer.parseInt(br.readLine());

        for (int i = 1; i <= h; i++) {
            int spaces = h - i;
            int width = 2 * i - 1;

            repeat(' ', spaces);

            for (int j = 1; j <= width; j++) {
                if (i == 1 && j == (width + 1) / 2) System.out.print("★");
                else if ((i + j) % 7 == 0) System.out.print("o");
                else if ((i * j) % 11 == 0) System.out.print("+");
                else System.out.print("*");
            }
            System.out.println();
        }

        for (int t = 0; t < 2; t++) {
            repeat(' ', h - 1);
            System.out.println("|");
        }
    }

    static void repeat ( char ch, int count){
        for (int i = 0; i < count; i++) System.out.print(ch);
    }

}
