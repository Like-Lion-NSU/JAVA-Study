//package 경훈;
//
////class Book {
////    String title;
////    int price;
////    public Book() {}
////    public void showPrice() {
////        System.out.println(title + "의 가격은 " + price + "원 입니다");
////    }
////}
////public class Education {
////    public static void main(String[] args) {
////        Book[] b = new Book[3];
////        for (int i = 0; i < b.length; i++) {
////            b[i] = new Book();
////        }
////        b[0].title = "국어책";
////        b[0].price = 3000;
////
////        b[1].title = "영어책";
////        b[1].price = 4000;
////
////        b[2].title = "수학책";
////        b[2].price = 5000;
////
////        for (int i=0; i<b.length; i++) {
////            b[i].showPrice();
////        }
////    }
////}
//
////import java.util.ArrayList;
////
////class Book {
////
////    String title;
////    int price;
////
////    public Book(String title, int price) {
////        this.title=title;
////        this.price=price;
////    }
////    public void showPrice() {
////        System.out.println(title + "의 가격은 " + price + "원 입니다");
////    }
////}
////public class Ex {
////    public static void main(String[] args) {
////        ArrayList<Book> library = new ArrayList<>();
////        library.add(new Book("국어책", 3000));
////        library.add(new Book("영어책", 4000));
////        library.add(new Book("수학책", 5000));
////        for (int i=0; i<library.size(); i++) {
////            library.get(i).showPrice();
////        }
////    }
////}
//
////import java.util.ArrayList;
////import java.util.List;
////
////public class Ex {
////    public static void main(String[] args) {
////        List<String> list = new ArrayList();
////
////        list.add("Hello World");
////        list.add("LikeLion");
////        list.remove(0);
////
////        for(String value:list){
////            System.out.println(value);
////        }
////        for(int i = 0; i<list.size(); i++){
////            System.out.println(list.get(i));
////        }
////        System.out.println(list.contains("Hello World"));
////    }
////}
//
////import java.util.HashMap;
////import java.util.Map;
////
////public class Ex {
////    public static void main(String[] args) {
////        Map<String, String> map = new HashMap<>();
////        map.put("김씨", "어부");
////        map.put("이씨", "광부");
////        map.put("박씨", "농부");
////        map.put("김씨", "무직");
////
////        for(String key:map.keySet()){
////            System.out.println(key+": "+ map.get(key));
////        }
////    }
////}
//
////import java.util.Scanner;
////import java.util.HashMap;
////import java.util.Map;
////
////public class Education {
////    public static void main(String[] args) {
////        System.out.println("단어를 입력하세요");
////        Scanner m=new Scanner(System.in);
////        String word=m.nextLine();
////
////        Map<String, String> map = new HashMap<>();
////        map.put("cat","고양이");
////        map.put("dog","강아지");
////        map.put("house","집");
////        map.put("run","달리다");
////
////        for(String key:map.keySet()){
////            if(map.containsKey(word)) {
////                System.out.println("map.get(a)");
////            } else {
////                System.out.println("존재하지 않는 단어입니다.");
////                System.exit(0);
////        }
////    }
////}
//
////class Box {
////    private Object data;
////
////    public void set(Object data) {this.data = data;}
////
////    public Object get() {return data;}
////}
////
////public class Generic {
////    public static void main(String[] args) {
////        Box b = new Box();
////        b.set("Hello World! ");
////        String s = (String)b.get();
////        System.out.println(s);
////
////        b.set(10);
////        Integer i = (Integer)b.get();
////        System.out.println(i);
////    }
////}
//
////
//
//class Container<K,V>{
//    private K key;
//    private V value;
//
//    public K getKey(){
//        return key;
//    }
//    public V getValue(){
//        return value;
//    }
//
//    public void set(K key, V value){
//        this.key = key;
//        this.value = value;
//    }
//}
//
//public class ContainerEx {
//    public static void main(String[] args) {
//        Container<String, String> container1 = new Container<>();
//        container1.set("김하나", "학생");
//        String name = container1.getKey();
//        String job = container1.getValue();
//
//        Container<String, Integer> container2 = new Container<>();
//        container2.set("나이", 22);
//        String age = container2.getKey();
//        int intAge = container2.getValue();
//
//        System.out.println(container1.getKey()+":"+container1.getValue());
//        System.out.println(container2.getKey()+":"+container2.getValue());
//    }
//}
