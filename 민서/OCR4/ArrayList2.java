package OCR4;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
   double sum = 0.0;
        for(int i =0; i<6; i++){
            String s = sc.nextLine();
            al.add(s);
            if(al.get(i).equals("A")){
                sum +=4.0;
            }else if(al.get(i).equals("B")){
                sum +=3.0;
            }else if(al.get(i).equals("C")){
                sum +=2.0;
            }else if(al.get(i).equals("D")){
                sum +=1.0;
            }else if(al.get(i).equals("F")){
                sum+=0.0;
            }

        }
        System.out.println(sum/6);
    }
}
