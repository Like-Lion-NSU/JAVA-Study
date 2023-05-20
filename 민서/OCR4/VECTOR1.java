package OCR4;
import java.util.*;
public class VECTOR1 {
    public static void main(String[] args) {
        Vector<Integer> b = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("정수(-1이 입력될 때까지)>> ");
        while(true){

            int s = sc.nextInt();
            if(s>0) {
                b.add(s);
            }
            else{
                break;
            }

        }
        int tmp = b.get(0);
        for(int i =0; i<b.size(); i++){

            if(b.get(i)>tmp){
                tmp = b.get(i);
            }
        }
        
        System.out.println("가장 큰 수는 "+tmp);
    }
}
