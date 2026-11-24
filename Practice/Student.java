//class  Student{
//
//    String name;
//    int age;
//    int marks;
//
//    static  int count = 0;
//   final static int PASS_MARKS = 40;
//
//    boolean isPassed(){
//       return marks >= PASS_MARKS;
//   }
//
//    Student(String name, int age, int marks){
//        this.name = name;
//        this.age = age;
//        this.marks = marks;
//        count ++;
//    }
//
//    Student(String name){
//       this(name, 0, 0);
//    }
//
//    void show(){
//        System.out.println(String.format("My name is %s and I am %d years old and I score %d out of 100", name, age, marks));
//    }
//
//    public static void main(String[] args) {
//        Student s1 = new Student("Sumant", 22, 30);
//        Student s2 = new Student("Uttam", 22, 100);
//        Student s3 = new Student("Dhruv", 22, 100);
//        Student s4= new Student("Mohit");
//        System.out.println(s1.age);
//        System.out.println(s2.name);
//        System.out.println(s3.marks);
//        s1.show();
//        s2.show();
//        s3.show();
//        System.out.println(s1.count);
//        s1.isPassed();
//        System.out.println(s4.marks);
//
//    }
//}
//
//class Student{
//
//    private int marks;
//    private int age;
//
//    int getMarks(){
//        return marks;
//    }
//    void setMarks(int marks){
//        if(marks < 0 || marks > 100){
//            System.out.println("Invalid marks");
//            return;
//        }
//        this.marks = marks;
//    }
//
//    void setAge(int age){
//        if(age < 1){
//            System.out.println("Invalid age");
//            return;
//        }
//        this.age = age;
//    }
//
//    public static void main(String[] args) {
//
//        Student s1 = new Student();
//        s1.setMarks(100);
//        s1.setAge(15);
//        System.out.println(s1.getMarks());
//        System.out.println(s1.age);
//    }
//}

class Persons{

    String name;

    Persons(){

    }

   void intro(){
        System.out.println("Hi I am " + name );
    }
}

class Employee1 extends Persons{
    int salary;
    Employee1( int salary){
//        super(name);
        this.salary = salary;
    }

    @Override
    void intro() {
        super.intro();
        System.out.println("My name is " + name + " and my salary is " + salary);
    }

    public static void main(String[] args) {
        Employee1 s1 = new Employee1( 100000);
        System.out.println(s1.salary);
        s1.name = "Sumant";
        s1.intro();
    }
}
//
//class Manager extends  Employee1{
//    int teamSize;
//
//    Manager(int teamSize, String name, int salary){
//        super(name,salary);
//        this.teamSize = teamSize;
//    }
//    void intro(){
//        System.out.println("My name is " + name + " and i am manager with teamsize " + teamSize + " and salary is " + salary);
//    }
//
//    public static void main(String[] args) {
//        Manager m = new Manager(50, "Sam", 100000);
//        m.intro();
//    }
//}