//class Student extends PublicTransport{  // 대중교통 클래스로부터 상속 받음
//    Student(){} // 기본 생성자
//    int money;  // public 정수형 money와 String형 name 변수 생성
//    String name;
//    Student(String name, int money){    // 매개변수가 있는 생성자 매개변수로 받은 값을 클래스 멤버변수로 선언한 변수에 대입
//        this.name = name;
//        this.money = money;
//    }
//    void showInfo(){    // student 클래스의 메서드 이름과 남은 돈 출력
//        System.out.println(name+"의 남은 돈은"+money+"입니다.");
//    }
//
//    //부모 클래스의 메서드를 가져와 오버라이딩하여 student 클래스의 money 변수에 각 대중교통의 요금을 뺀 값을 대입
//    void takeBus(String bus){this.money = this.money-busfee;}
//    void takeTaxi(String taxi){this.money = this.money-taxifee;}
//    void takeSubway(String subway){this.money = this.money-subwayfee;}
//}
//
//// 부모 클래스인 대중교통 클래스 멤버변수 부분은 protected로 지정하여 자식클래스에서 사용할 수 있게 지정
//class PublicTransport{
//    protected int busfee = 1500;
//    protected int taxifee = 4500;
//    protected int subwayfee = 1500; // 각각의 대중교통 요금 변수
//    protected int passenger;  // 승객
//    protected int number;   // 각 대중교통의 번호 변수
//    protected int suib;     //  대중교통의 수입
//
//
//
//    void takeBus(String bus){
//        System.out.println("버스요금은 1500원");
//    }
//    void takeTaxi(String taxi){
//        System.out.println("택시 요금은 4500원");
//    }
//    void takeSubway(String subway){
//        System.out.println("지하철 요금은 1500원");
//    }
//
//    void TransferShowInfo(){    //반환값이 없는 메서드
//        System.out.println(number+"승객은"+passenger+"이고, 수입은"+suib+"입니다.");
//    }
//}
//
//class Bus extends PublicTransport{  // 대중교통 클래스를 상속받은 버스 클래스
//    Bus(){} // 기본생성자
//
//    Bus(int number){    // 매개변수가 하나 있는 생성자
//        this.number = number;
//        suib = suib +1500;
//        passenger++;
//    }
//
//    void TransferShowInfo(){    // 부모클래스인 대중교통 클래스의 메서드를 오버라이딩하여 내용 재정의
//        System.out.println("버스"+number+"번의 승객은"+passenger+"명이고, 수입은"+suib+"입니다." );
//    }
//}
//
//class Taxi extends PublicTransport{ // 대중교통 클래스를 상속받은 택시 클래스
//    Taxi(){} // 기본생성자
//    Taxi(int number){   // 매개변수가 있는 생성자
//        this.number = number;
//        suib = suib + 4500;
//        passenger++;
//    }
//    void TransferShowInfo(){     // 부모클래스인 대중교통 클래스의 메서드를 오버라이딩하여 내용 재정의
//        System.out.println("택시"+number+"번의 승객은"+passenger+"명이고, 수입은"+suib+"입니다." );
//    }
//}
//
//class Subway extends PublicTransport{   // 대중교통 클래스를 상속받은 지하철 클래스
//    Subway(){}  // 기본 생성자
//    Subway(int number){     // 매개변수가 있는 생성자
//        this.number =number;
//        suib = suib +1500;
//        passenger++;
//    }
//    void TransferShowInfo(){     // 부모클래스인 대중교통 클래스의 메서드를 오버라이딩하여 내용 재정의
//        System.out.println("지하철"+number+"호선의 승객은"+passenger+"명이고, 수입은"+suib+"입니다." );
//    }
//}
//public class Assignment02 {
//
//    public static void main(String[] args) {
//        Student studentKim = new Student("kim",10000); //Student 클래스의 객체를 3개 생성
//        Student studentLee = new Student("Lee",45000);
//        Student studentPark = new Student("Park",5000);
//
//        Bus bus771 = new Bus(771);
//        studentKim.takeBus("bus771");
//        studentKim.showInfo();
//        bus771.TransferShowInfo();
//
//        Taxi taxi0406 = new Taxi(0406);
//        studentLee.takeTaxi("taxi0406");
//        studentLee.showInfo();
//        taxi0406.TransferShowInfo();
//
//        Subway subway1 = new Subway(1);
//        studentPark.takeSubway("subway1");
//        studentPark.showInfo();
//        subway1.TransferShowInfo();
//    }
//}
