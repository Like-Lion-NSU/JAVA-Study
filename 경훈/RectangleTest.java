package 경훈;

class Rectangle {
    int x;
    int y;
    int width;
    int height;

    Rectangle() { }

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    int square(){
        return width*height;
    }

    void show(){
        System.out.println("("+x+","+y+")"+"에서 크기가 "+width+","+height+"인 사각형");
    }

    boolean contains(Rectangle a) {
        int garo = this.x + this.width;
        int saero = this.y + this.height;
        int agaro = a.x + a.width;
        int asaero = a.y + a.height;

        if(agaro < garo && asaero < saero) {
            return true;
        } else {
            return false;
        }
    }
}
public class RectangleTest {
    public static void main(String args[]){
        Rectangle a = new Rectangle(2,2,8,7);
        Rectangle b = new Rectangle(5,5,6,6);
        Rectangle c = new Rectangle(1,1,10,10);

        a.show();
        System.out.println("b의 면적은" + b.square());
        if(c.contains(a)) System.out.println("c는 a을 포함합니다.");
        if(c.contains(b)) System.out.println("c는 b을 포함합니다.");
    }
}

