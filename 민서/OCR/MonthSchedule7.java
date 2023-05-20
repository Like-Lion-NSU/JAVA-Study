package OCR;
import java.util.Scanner;

class Day{
    private String work;
    public void set(String work) {this.work = work;}
    public void show(){
        if(work ==null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
class MonthSchedule {
    private Day d[];
    Scanner sc = new Scanner(System.in);
    private String work;
    private int date;
    public int day;

    MonthSchedule(int date){
        this.d = new Day[date];
        for(int i =0; i<d.length; i++){
            d[i] = new Day();

        }
    }
    void set(String work) {this.work=work;}
    String get() {return work;}
    void input(){
        System.out.println("날짜(1~30)?");
        day = sc.nextInt();
        System.out.print("할일(빈칸없이입력)?");
        work = sc.next();
       d[day].set(this.work);

    }
    void view(){
        System.out.println("날짜(1~30)?");
        day=sc.nextInt();
        System.out.println(day+"일의 할 일은 " +get());
        d[day].show();
    }

    void fnish(){
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
    void run(){

        while(true){

            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num = sc.nextInt();
            if(num ==1 ){
                input();
            }
            else if(num ==2){
                view();
            }
            else if(num == 3){
                fnish();
            }
        }
    }
    void show(){
        if(work ==null) System.out.println("없습니다");
        else System.out.println(work+"입니다");
    }
}

public class MonthSchedule7 {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);

        System.out.println("이번달 스케쥴 관리 프로그램");
        april.run();
    }
}
