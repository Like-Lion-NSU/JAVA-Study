package 경훈;

import java.util.ArrayList;
import java.util.Scanner;

public class SameFirstName {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("부원 5명의 이름을 입력해주세요. >> ");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            names.add(name);
        }

        for (int i = 0; i < 5; i++) {
            String a = names.get(i);
            if (a.startsWith("송")) {
                System.out.println("["+a+"]");
                count++;
            }
        }
        System.out.println("나와 성이 같은 사람은 총 " + (count-1) + "명입니다.");
    }
}


