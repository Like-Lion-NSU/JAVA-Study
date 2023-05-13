import java.util.Scanner;
public class Assignment01 {

    public static void main(String[] args) {
        int oman=0, man=0, cheon=0 , baeg=0 , osib=0 , sib=0 , il=0; // 각 금액의 개수를 출력하기 위해 변수를 생성
        Scanner sc = new Scanner(System.in);
        int money = 0; // 입력받을 변수 money를 0으로 초기화
        System.out.println("금액을 입력하시오>>");  // 입력받을 금액 출력
        money = sc.nextInt(); // 입력받은 정수를 money에 대입
        while(money != 0) { // while문 조건은 money가 0이 아닐 동안 반복
            if (money/50000>=1) {   // if문 money를 50000으로 나누고 몫이 1보다 크면 oman변수 1 증가시켜주고 money에서 50000을 빼고 다시 money에 대입
                oman++;
                money = money-50000;
            } else if (money/10000>=1) {     // else if문 money를 10000으로 나누고 몫이 1보다 크면 man변수 1 증가시켜주고 money에서 10000을 빼고 다시 money에 대입
                man++;
                money = money-10000;
            } else if (money/1000>=1) {  // else if문 money를 1000으로 나누고 몫이 1보다 크면 cheon변수 1 증가시켜주고 money에서 1000을 빼고 다시 money에 대입
                cheon++;
                money = money-1000;
            } else if (money/100 >=1) {  // else if문 money를 100으로 나누고 몫이 1보다 크면 baeg변수 1 증가시켜주고 money에서 100을 빼고 다시 money에 대입
                baeg++;
                money = money-100;
            } else if (money/50>=1) {   //  else if문 money를 50으로 나누고 몫이 1보다 크면 osib변수 1 증가시켜주고 money에서 50을 빼고 다시 money에 대입
                osib++;
                money = money-50;
            } else if (money/10>=1) {    // else if문 money를 10으로 나누고 몫이 1보다 크면 sib변수 1 증가시켜주고 money에서 10을 빼고 다시 money에 대입
                sib++;
                money = money-10;
            } else if (money/1>=1) {     // else if문 money를 1으로 나누고 몫이 1보다 크면 il변수 1 증가시켜주고 money에서 1을 빼고 다시 money에 대입
                il++;
                money = money-1;
            } else {
                System.out.println("잘못된 금액을 입력하셨습니다."); // 정수가 아닌 실수나 문자가 입력될 시 오류 문구 출력
            }
        }
        System.out.println("오만원권"+oman+"장");    //출력문
        System.out.println("만원권"+man+"장");
        System.out.println("천원권"+cheon+"장");
        System.out.println("백원"+baeg+"개");
        System.out.println("오십원"+osib+"개");
        System.out.println("십원"+sib+"개");
        System.out.println("일원"+il+"개");
    }
}
