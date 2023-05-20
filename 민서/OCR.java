class TV{
    String name;
    int age;
    int inchi;
    TV(String name, int age, int inchi){
        this.name=name;
        this.age = age;
        this.inchi = inchi;
    }

    void show(){
        System.out.println(name + "에서 만든 " + age +"년형 " + inchi +"인치 TV");

    }
}
public class OCR {
    public static void main(String[] args) {
        TV myTV = new TV("LG",2017,32);
        myTV.show();
    }

}
