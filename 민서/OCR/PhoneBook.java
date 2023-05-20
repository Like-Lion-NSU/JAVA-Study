package OCR;
import java.util.Scanner;

class Phone{
    Scanner sc = new Scanner(System.in);
    String name;
    String tel;
    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
}

class PhoneBook1{
    Scanner sc = new Scanner(System.in);
    String name, tel;
    public PhoneBook1() {

    }

void input(){
    System.out.print("인원수 >>");
    int num = sc.nextInt();
    Phone[] a = new Phone[num];
    for (int i = 0; i < a.length; i++) {
        System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
        String name = sc.next();
        String tel = sc.next();
        a[i] = new Phone(name, tel);
    }
    System.out.println("저장되었습니다.");

    while(true) {
        int i = 0;
        for(i =0; i<a.length; i++) {
            search();
            if (this.name.equals(a[i].name)) {
                System.out.println(name + "의 번호는" + a[i].tel + "입니다.");
                i=1;
                break;
            }else {
                i =0;
                break;
            }
        }  if (this.name.equals("그만")) {
            System.exit(0);
        } else if(i==0)  {
            System.out.println(this.name + "은 없습니다.");

        }
    }
}
    void search(){

        System.out.print("검색할이름>>");
        name = sc.next();

    }



}

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook1 p = new PhoneBook1();
        p.input();
    }
}
