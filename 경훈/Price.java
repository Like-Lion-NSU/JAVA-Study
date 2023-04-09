package 경훈;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("금액을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int money1 = money / 50000;
        int money2 = (money % 50000) / 10000;
        int money3 = (money % 10000) / 1000;
        int money4 = (money % 1000) / 100;
        int money5 = (money % 100) / 50;
        int money6 = (money % 50) / 10;
        int money7 = (money % 10) / 1;

        System.out.println("오만원권 : "+money1+"장\n"+"만원권 : "+money2 +"장\n"+"천원권 : "+money3+"장\n"+"백원권 : "+money4+"장\n"+"오십원권 : "+money5+"장\n"+"십원권 : "+ money6+"장\n"+"일원권 : "+money7+"장\n");
    }
}
