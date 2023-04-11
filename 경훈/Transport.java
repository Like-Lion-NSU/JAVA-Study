package 경훈;

public class Transport {
    public static void main(String[] args) {
        Student studentKim = new Student("Kim", 10000);
        Student studentLee = new Student("Lee", 45000);
        Student studentPark = new Student("Park", 5000);

        Bus bus771 = new Bus(771);
        studentKim.takeBus(bus771);
        studentKim.showInfo();
        bus771.showInfo();

        Taxi taxi0406 = new Taxi(0406);
        studentLee.takeTaxi(taxi0406);
        studentLee.showInfo();
        taxi0406.showInfo();

        Subway subway1 = new Subway("1호선");
        studentPark.takeSubway(subway1);
        studentPark.showInfo();
        subway1.showInfo();
    }
}

class Student {
    String name;
    int money;

    Student() {}
    Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    void takeBus(Bus bus) {
        money -= 1500;
        bus.get(1500);
    }

    void takeTaxi(Taxi taxi) {
        money -= 4500;
        taxi.get(4500);
    }

    void takeSubway(Subway subway) {
        money -= 1500;
        subway.get(1500);
    }
    public void showInfo() {
        System.out.println(name + "의 남은 돈은 " + money + "원 입니다.");
    }
}

class Bus extends A{
    int deposit = 0;
    int passengerCount = 0;
    int busNumber;

    Bus() {}

    Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    void get(int money) {
        deposit += money;
        passengerCount++;
    }
    public void showInfo() {
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + deposit + "원 입니다.");
    }
}

class Taxi extends A{
    int deposit = 0;
    int passengerCount = 0;
    int taxiNumber;

    Taxi() {}

    Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
    void get(int money) {
        deposit += money;
        passengerCount++;
    }
    public void showInfo() {
        System.out.println("택시 " + taxiNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + deposit + "원 입니다.");
    }
}

class Subway extends A{
    int deposit = 0;
    int passengerCount = 0;
    String subwayNumber;

    Subway() {}

    Subway(String subwayNumber) {
        this.subwayNumber = subwayNumber;
    }
    void get(int money) {
        deposit += money;
        passengerCount++;
    }
    public void showInfo() {
        System.out.println("지하철 " + subwayNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + deposit +"원 입니다.");
    }
}

abstract class A {
    void showInfo() {}
    void get() {}
}



