class Human{
    protected String name;
    protected int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    protected void output(){
        System.out.print("이름 : "+ name +"\n" + "나이 : " + age + "\n" );
    }
}

class Student extends Human{
    String school ;

    Student(String name, int age, String school){
        super(name ,age);
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    protected void output(){
        super.output();
        System.out.println("학교 : " + school);
    }
}

class Worker extends Human{
    String job;
    Worker(String name, int age, String job){
        super(name,age);
        this.name = name;
        this.age = age;
        this.job = job;
    }
    @Override
    protected void output(){
        super.output();
        System.out.println("직업 : " + job );
    }
}

public class HumanDemo {
    public static void main(String[] args) {
        Student student = new Student("서송현",20,"남서울대");
        Worker worker = new Worker("아이유", 39 ,"가수");

        student.output();
        worker.output();
    }
}
