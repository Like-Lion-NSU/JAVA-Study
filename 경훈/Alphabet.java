package 경훈;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println("소문자 알파벳 하나를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        int ib = 0;

        char[] alpha = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == input) {
                ib = i;
            }
        }
        for (int ic = ib; ic >= 0; ic--) {
            for(int id = 0; id <= ic; id++) {
                System.out.print(alpha[id]);
            }
            System.out.println();
        }
    }
}
