package 경훈;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class User {
    public static void main(String[] args) {
        List<Name> name1 = new ArrayList<>(Arrays.asList
                (new Name("James", 10, 3000),
                        new Name("Alice", 20, 4000),
                        new Name("Thomas", 15, 3000)));

        List<String> a =
                name1.stream()
                .map(Name::output)
                .collect(Collectors.toList());
        System.out.println("[user name]");
        System.out.println(a+"\n");

        int ab = name1.stream()
                .mapToInt(Name::output1)
                .sum();
        System.out.println("[user power 합계]\n" + ab + "\n");

        List<String> b =
                name1.stream()
                .filter(user -> user.output2()>=15)
                .map(Name::output )
                        .map(String::toUpperCase)
                .sorted()

                .collect(Collectors.toList());
        System.out.println("[user level 15 이상");
        System.out.println(b);
    }
}

class Name{
    String name;
    int level;
    int power;

    Name(String name, int level, int power){
        this.name = name;
        this.level = level;
        this.power = power;
    }
     String output(){
       return this.name;
    }
    int output1(){
        return this.power;
    }
    int output2(){
        return this.level;
    }
}
