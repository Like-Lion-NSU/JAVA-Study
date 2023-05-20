package OCR;
import java.util.Scanner;
class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    boolean circleArea(Circle r){
        if(this.radius*this.radius*3.14>r.radius*r.radius*3.14){
            return true;
        }else{
            return false;
        }

    }
    public String toString(){
        return ("("+x+","+y+")"+radius);

    }
}

public class Circletest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle []c = new Circle[3] ;
        for(int i = 0; i<c.length; i++){
            System.out.print("x,y,radius>>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle(x,y,radius);
    }
        for(int i = 0; i<c.length; i++){
            c[i].show();
            }

        if(c[0].circleArea(c[1]) && c[0].circleArea(c[2])){
            System.out.println("가장 면적이 큰 원은"+c[0].toString());
        }
        else if(c[1].circleArea(c[0]) && c[1].circleArea(c[2])){
            System.out.println("가장 면적이 큰 원은"+c[1].toString());
        } else{
            System.out.println("가장 면적이 큰 원은"+c[2].toString());
        }
    }
 }



