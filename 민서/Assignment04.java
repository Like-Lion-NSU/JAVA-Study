import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;



class SS{   // 클래스 생성
    private String name;
    private int level;
    private int power;

    //  private 변수들을 반환하기 위해 접근
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }

    SS(String name, int level, int power){      // 매개변수로 3개의 변수를 받는 생성자
        this.name =name;
        this.level = level;
        this.power = power;
    }

}
public class Assignment04 {
    public static void main(String[] args) {
    List<SS> ss = new ArrayList<>(Arrays.asList(    //List 인터페이스의 SS 클래스타입 ss라는 인스턴스를 만들어서 생성자 3개 만듬
      new SS ("James",10,3000),
            new SS("Alice",20,4000),
            new SS("Thomas",15,3500)
    ));

     List<String> aaa=
            ss.stream()
                    .map(SS::getName) //SS클래스 타입의 ss 인스턴스를 String 타입으로 바꾸어 getName메서드를 호출
        .collect(Collectors.toList()); //ss스트림의 모든 요소들을 컬렉션에 저장
        System.out.println("[user name]");
        System.out.println(aaa+"\n"); // aaa출력

        int powersum = ss.stream()
        .mapToInt(SS::getPower)    // ss스트림의 요소들을 SS클래스의 getPower메서드의 조건에 맞게 int형으로 변환
        .sum(); // getPower메서드로 반환받은 값을 다 더함
        System.out.println("[user power 합계]");
        System.out.println(powersum+"\n"); //powersum 출력


        List<String> name12 = ss.stream()
        .filter(p -> p.getLevel()>=15)  //getLevel로 반환받은 level변수의 값이 15보다 크거나 같은 값만 필터링함
        .map(SS::getName)  // ss스트림의 요소들을 SS클래스의 getName메서드의 조건에 맞게 String형으로 변환
        .sorted()// 스트림 요소를 정렬 기본으로 오름차순 정렬
        .collect(Collectors.toList());// 스트림의 모든 요소들을 컬렉션에 저장
        System.out.println("[user level 15 이상]");
        System.out.println(name12);
        }
        }
