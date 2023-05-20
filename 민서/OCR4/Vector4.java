package OCR4;
import java.util.*;
public class Vector4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner sc =new Scanner(System.in);

        int count =0;
        while(true){
            System.out.println("강수량 입력 (0입력시 종료) >>");
            int a =sc.nextInt();
            if(a==0) break;
            v.add(a);
            int sum =0;
           for(int i= 0; i<v.size(); i++){

               System.out.print(v.get(i)+" ");
               sum +=v.get(i);

           }
           count++;
            System.out.println();
            System.out.println("현재평균 "+sum/count);

        }
    }
}
