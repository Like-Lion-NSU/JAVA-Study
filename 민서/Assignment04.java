import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;



class SS{
    private String name;
    private int level;
    private int power;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }

    SS(String name, int level, int power){
        this.name =name;
        this.level = level;
        this.power = power;
    }

    int showPower(SS a, SS b){
       return this.power + a.power + b.power;
    }
}
public class Assignment04 {
    public static void main(String[] args) {
    List<SS> ss = new ArrayList<>(Arrays.asList(
      new SS ("James",10,3000),
            new SS("Alice",20,4000),
            new SS("Thomas",15,3500)
    ));



    List<String> aaa=
            ss.stream()
                    .map(SS::getName)
                    .collect(Collectors.toList());
       System.out.println(aaa);

     int powersum = ss.stream()
             .mapToInt(SS::getPower)
             .sum();
        System.out.println(powersum);

    List<String> name12 = ss.stream()
            .filter(user -> user.getLevel()>=15)
            .map(SS::getName)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("[user level 15 이상]");
        System.out.println(name12);
    }
}
