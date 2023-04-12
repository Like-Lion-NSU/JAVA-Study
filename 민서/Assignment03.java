import java.util.*;
public class Assignment03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1; // 입력받은 이름을 저장할 변수들 선언
        String name2;
        String name3;
        String name4;
        String name5;
        System.out.println("본인 이름을 입력해주세요>>");
        name1 =sc.nextLine(); // 본인 이름 입력 받고 name1에 저장

        System.out.println("부원분들 이름을 입력해주세요>>"); // 부원분들 이름 입력받고 name2~5에 저장

        name2 =sc.nextLine();
        name3 =sc.nextLine();
        name4 =sc.nextLine();
        name5 =sc.nextLine();

        ArrayList<String> arrayList= new ArrayList<>(); //arrayList 인스턴스 생성
        arrayList.add(0,name1); // arrayList 에 0번지부터 4번지까지 name1~5를 추가한다.
        arrayList.add(1,name2);
        arrayList.add(2,name3);
        arrayList.add(3,name4);
        arrayList.add(4,name5);

        String a,b,c,d,e; // 각 문자열의 첫글자를 저장할 변수를 선언 하고 저장
        a = arrayList.get(0);
        b = arrayList.get(1);
        c = arrayList.get(2);
        d = arrayList.get(3);
        e = arrayList.get(4);
        int count = 0 ; // 성이 같은 사람을 출력하기 위해 count변수 생성

        String [] abc = {b,c,d,e};  // 이름의 첫 글자를 비교하기 위해 배열을 생성해서 차례대로 넣음
         for(int i =0; i<abc.length; i++){
             if(abc[i].charAt(0) == a.charAt(0)) {  //성이 같으면 같은사람의 이름을 출력하고 count 변수 증가
                 System.out.print(arrayList.get(i + 1) + "\t");
                 count++;
             }
         }
         // 성이 다 같지 않으면 없다고 출력
         if(abc[0].charAt(0) != a.charAt(0) && abc[1].charAt(0) != a.charAt(0) && abc[2].charAt(0) != a.charAt(0) && abc[3].charAt(0) != a.charAt(0) ){
            System.out.println("성이 같은 사람없습니다.");
        }
        System.out.println("본인 이름:" + arrayList.get(0));    // 본인 이름 출력
        System.out.println("성이 같은 사람은" + count + "명입니다.");  // count변수 통해 성이 같은 사람의 수를 출력

    }
}
