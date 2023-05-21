package OCR4;
import java.util.*;
public class HashMap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();

        System.out.println("나라 이름과 인구를 입력하세요.(예:Korea 5000");
        while (true) {
            System.out.print("나라 이름, 인구 >>");
            String s = sc.next();

            if(s.equals("그만")){
                break;
            }
            int i = sc.nextInt();
            nations.put(s,i);

        }
        while(true){
            System.out.println("인구검색>>");
            String k = sc.next();
            if (k.equals("그만")){
                break;
            }
            if(nations.get(k) == null){
                System.out.println(k+"나라는 없습니다");
            }
            else{
                System.out.println(k+"의 인구는"+nations.get(k));
            }
        }
    }
}
