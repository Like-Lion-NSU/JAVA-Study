package OCR2;
class TV{
    private int size;
    public TV(int size){ this.size = size;}
    protected int getSize() {return size;}

}
class ColorTV extends TV{
    private int color;
    ColorTV(int size, int color){
        super(size);
        this.color =color;
    }
    void printProperty(){
        System.out.println(getSize()+"인치"+color +"컬러");
    }
    int getcolor(){
       return color;
    }
}

class IPTV extends ColorTV{
    private String ip;

    IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }
    void printProperty(){
        System.out.println("나의 IPTV는" + ip + "" +getSize() +"인치" +getcolor()+"컬러");
    }
}
public class TV12 {
    public static void main(String[] args) {
        ColorTV myTV =new ColorTV(32,1024);
        myTV.printProperty();

        IPTV iptv = new IPTV("192.1.1.2",32,2048);

        iptv.printProperty();
    }
}
