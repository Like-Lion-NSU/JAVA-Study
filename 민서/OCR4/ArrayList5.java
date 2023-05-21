package OCR4;
import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in);
    String name;
    String position;
    int hakbun;
    double hakavg;

    Student(String name, String position, int hakbun, double hakavg){
       this.name = name;
       this.position = position;
       this.hakbun = hakbun;
       this.hakavg = hakavg;

    }
    public String show(){
       return name +"\n" +position +"\n"+hakbun +"\n"+hakavg + "\n";
    }
}
public class ArrayList5 {
    public static void main(String[] args) {
    ArrayList<Student> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요");
        for(int i =0; i<4; i++){
            System.out.println(">>");
            String name = sc.next();
            String position = sc.next();
            int hakbun = sc.nextInt();
            double hakavg = sc.nextDouble();

            al.add(new Student(name,position,hakbun,hakavg));
        }
        for(int i=0; i<al.size(); i++){
            System.out.println("-----------------");
            System.out.println(al.get(i).show());
            System.out.println("-----------------");
        }
        while(true){
            System.out.print("학생 이름 >>");
            String name = sc.nextLine();
            if(name.equals("그만")){
                break;
            }
            for(int i = 0; i<al.size(); i++){

                if(al.get(i).name.equals(name)){
                    System.out.println(al.get(i).show());
                }
            }
        }
    }
}
