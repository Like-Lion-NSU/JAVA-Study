package OCR3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizer7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


       while(true){
           System.out.print(">>");
           String a = sc.nextLine();
           StringTokenizer st = new StringTokenizer(a);
            if(a.equals("그만")){
                System.out.println("종료합니다..");
                System.exit(0);
            }
           int count = st.countTokens();
           System.out.println("어절 개수는 " + count);
       }
    }
}
