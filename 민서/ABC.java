import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

//class Board{
//    private String title;
//    private String content;
//    private int hit;
//
//    Board(String title, String content, int hit){
//        this.title=title;
//        this.content=content;
//        this.hit=hit;
//    }
//
//    public String getTitleAndContent(){
//        return this.title + ":" + this.content;
//    }
//    public int getHit(){return this.hit;}
//}
class People{
    String name = "사람";

    void whoami(){
        System.out.println("나는 사람이다.");
    }
}

class Student1 extends People{
    int number=7;
    void work(){
        super.whoami();
        System.out.println("나는 공부한다.");
    }
}
public class ABC {
    public static void main(String[] args) {
        Student1 s = new Student1();
        People p = new People();


        System.out.println(s instanceof People);
        System.out.println(s instanceof Student1);
        System.out.println(p instanceof Student1);

    }

        void downcast(People p){
        if(p instanceof  Student1){
            Student1 s =(Student1) p;
            System.out.println("ok, 하향 타입 변환"); // p의 실제 타입이 Student 타입이므로 강제 타입 변환 가능
        }
        }
}
//    public static void main(String[] args) {
//        try {
//            myException();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//        public static void myException() throws Exception {
//
//            thorw new Exception("myException에서 예외가 발생하였습니다.");
//        }
//    }



//        List<Board> boards = new ArrayList<>(Arrays.asList(
//                new Board("오늘의 날씨", "오늘은 맑습니다",30),
//                new Board("오늘의 노래", "뉴진스의 하입보이",40),
//                new Board("오늘의 게임", "리그오브레전드",100),
//                new Board("오늘의 운세", "금전운이 좋네요",20)
//        ));
//        List<String> top3 =
//                boards.stream()
//                                .sorted(Comparator.comparing(Board::getHit).reversed())
//                                        .limit(3)
//                        .map(Board::getTitleAndContent).toList()
//                        .stream().collect(Collectors.toList());
//
//        System.out.println(top3);



