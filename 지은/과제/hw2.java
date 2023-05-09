class Rectangle {
    int x,y,width,height;
    int sqaure(){
        return width*height;
    }
    void show(){
        System.out.printf("(%d, %d)에서 크기가 %d*%d인 사각형\n", x,y,width,height);
    }
    boolean contains(Rectangle a){
        return (x+width>a.x+a.width)&&(y+height>a.y+a.height);
    }
    Rectangle(){}
    Rectangle(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }
}

public class hw2 {
    public static void main(String args[]){
        Rectangle a = new Rectangle(2,2,8,7);
        Rectangle b = new Rectangle(5,5,6,6);
        Rectangle c = new Rectangle(1,1,10,10);

        a.show();
        System.out.println("b의 면적은" + b.sqaure());
        if(c.contains(a)) System.out.println("c는 a을 포함합니다.");
        if(c.contains(b)) System.out.println("c는 b을 포함합니다.");
    }

/*
(2,2)에서 크기가 8*7인 사각형
b의 면적은 36
c는 a를 포함합니다.
*/
}
