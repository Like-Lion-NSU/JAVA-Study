package OCR4;
import  java.util.*;
public class HashMap5 {
    public static void main(String[] args) {
        HashMap<String,Student> h = new HashMap<String,Student>();
        Scanner sc =new Scanner(System.in);
        System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
        for(int i = 0; i<4; i++){
            System.out.println(">>");
            String name = sc.next();
            String position = sc.next();
            int hakbun = sc.nextInt();
            double hakavg = sc.nextDouble();

            h.put(name,new Student(name,position,hakbun,hakavg));
        }
        for(String name : h.keySet()){
            System.out.println("-------------------");
            System.out.println(h.get(name).show());
            System.out.println("-------------------");
        }
        while(true){
            System.out.println("학생 이름>>");
            String name = sc.nextLine();
            if(name.equals("그만")){
                break;
            }
            for(String namee: h.keySet()){
               if(h.get(namee).name.equals(name)){
                   System.out.println(h.get(name).show());
               }
            }
        }

    }
}
