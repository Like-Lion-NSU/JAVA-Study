package OCR2;

import java.awt.*;

class Point {
    int x;
    private int y;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Point(int x, int y) {this.x = x; this.y = y;}

    protected void move(int x, int y) {this.x=x; this.y=y;}
}

class ColorPoint extends Point{
    String color;
    void setXY(int x, int y){
        super.move(x,y);
    }

    ColorPoint(int x, int y, String color){
        super(x,y);
        this.color =color;
    }
    ColorPoint(int x, int y){
        super(x,y);
    }
    ColorPoint(){
        super(0,0);
        this.color="BLACK";
    }
    void setColor(String color){
        this.color =color;
    }
    public String toString(){
        return color+"색의"+"("+getX()+","+getY()+")의 점";
    }
}
class Point3D extends Point {
    private int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void moveUp() {
        ++z;
    }

    void moveDown() {
        --z;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")의 점";
    }

    void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;

    }
}

class PositivePoint extends Point{

    public PositivePoint(int x, int y) {
        super(x, y);
    }
    public PositivePoint(){
        super(0,0);
    }

    public String toString() {
        if(getX()<0 && getY()<0){
            super.move(0,0);
        }
        return "(" + getX() + "," + getY()  + ")의 점";
    }
    public void move(int x, int y){
        if(x >0 && y>0){
            super.move(x,y);
        }
    }
}
public class Point5678 {
    public static void main(String[] args) {
    ColorPoint cp = new ColorPoint(5,5,"YELLOW");

    cp.setXY(10,20);
    cp.setColor("RED");
    String str = cp.toString();
        System.out.println(str + "입니다.");

        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp1 = new ColorPoint(10,10);
        cp1.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp1.toString()+"입니다.");

        Point3D p = new Point3D(1,2,3);
        System.out.println(p.toString()+"입니다");

        p.moveUp();
        System.out.println(p.toString() + "입니다.");

        p.moveDown();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");

        p.move(100,200,300);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint();
        p2.move(10,10);
        System.out.println(p2.toString()+"입니다.");

        p2.move(-5,5);
        System.out.println(p2.toString()+"입니다.");

        PositivePoint p3 = new PositivePoint(-10, -10);
        System.out.println(p3.toString() + "입니다.");


    }
}
