package OCR;


import java.util.Scanner;

class Day1 {
    private String work;
    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show() {
        if(work == null)
            System.out.println("없습니다.");
        else
            System.out.println(work + "입니다.");
    }

}

class Abc {
    Scanner sc = new Scanner(System.in);
    int num, day;
    String work;
    private Day1 aa[];
    int days;

    Abc(int days) {
        this.aa = new Day1[days];
        for (int i = 0; i < aa.length; i++) {
            aa[i] = new Day1();
        }
    }
        public void input() {
            System.out.println("날짜(1~30)?");
            day = sc.nextInt();
            System.out.print("할일(빈칸없이입력)?");
            work = sc.next();
            aa[day].set(this.work);
        }
        public void view() {
            day = sc.nextInt();
            System.out.println(day + "일의 할 일은 " + aa[day].get() + "입니다.");
        }
        public void finish() {
            System.exit(0);
            System.out.println("프로그램을 종료합니다.");
        }
        public void run() {
            while (true) {

                num = sc.nextInt();

                if (num == 1) {
                    input();
                }else if(num == 2){
                    view();
                }else if(num == 3){
                    finish();
                }
            }
        }
    }


public class Rudgnsdk {
    public static void main(String[] args) {
    Abc a = new Abc(30);
    a.run();
    }
}
