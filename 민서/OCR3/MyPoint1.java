package OCR3;
class MyPoint {
    int p,q;

    MyPoint(int p, int q){
        this.p=p;
        this.q=q;
    }


    @Override
    public String toString() {
        return "Point("+ p + ","+q+ ")";
    }

    @Override
    public boolean equals(Object obj) {
        MyPoint m = (MyPoint) obj;
        if(this.p == m.p && this.q == m.q){
            return true;
        }else{
            return false;
        }
    }
}

public class MyPoint1 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3,50);
        MyPoint q = new MyPoint(4,50);

        System.out.println(p);

        if(p.equals(q))
            System.out.println("같은 점");
        else
            System.out.println("다른 점");
    }
}
