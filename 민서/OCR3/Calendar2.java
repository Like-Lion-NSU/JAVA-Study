package OCR3;
import java.util.Calendar;
import java.util.Scanner;

class Time{


    Calendar now = Calendar.getInstance();
    Scanner sc = new Scanner(System.in);
    private String name, enter;
    private int sec1,sec2;

    public int a,b;


    Time(String name){
        this.name = name;
    }
    public int enter(){
        enter = sc.nextLine();
        now = Calendar.getInstance();
        System.out.println("현재 초 시간 =" + now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);

    }
public int game(){
    System.out.println(name + "시작 <Enter>키>>");
    sec1=enter();
    System.out.println("10초 후 <ENTER>키 >> ");
    sec2=enter();
    if(sec1>sec2){
        return (60-sec1) +sec2;
    }else{
        return sec2-sec1;
    }




}


}
public class Calendar2 {
    public static void main(String[] args)  {
        Time t = new Time("황기태");
        Time t1 = new Time("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int result = t.game();
        int result1 = t1.game();


        if(Math.abs(result -10 )< Math.abs(result1 -10)){
            System.out.println("황기태 승"+(result-10)+","+(result1-10));
        }
        else{
            System.out.println("이재문 승"+(result-10)+","+(result1-10));
        }
    }
}
