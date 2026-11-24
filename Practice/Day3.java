//public class Day3{
//
//   private int marks;
//
//   int getMarks(){
//       return marks;
//   }
//
//   void setMarks(int marks){
//       if(marks < 0 || marks > 100){
//           System.out.println("Invalid marks");
//           return;
//       }
//    this.marks = marks;
//   }
//
//    public static void main(String[] args) {
//    }
//
//}
//
// class Teacher{
//    public static void main(String[] args) {
//        Day3 s = new Day3();
//        s.setMarks(10);
//        System.out.println(s.getMarks());
//    }
//
//}

//public class Day3 {
//
//    private int marks;
//
//    int getMarks() {
//        return marks;
//    }
//
//    void setMarks(int marks) {
//        if (marks < 0 || marks > 100) {
//            System.out.println("Invalid marks");
//            return;
//        }
//        this.marks = marks;
//    }
//}
//
//class Teacher {
//    public static void main(String[] args) {
//        Day3 s = new Day3();
//
//        s.setMarks(10);
//        System.out.println(s.getMarks());
//    }
//}

public class Day3{

    public static void main(String[] args) {
        Employee e = new Employee("Sumant", 150000000);

        e.name = "Sam Sharma";
        e.intro();
        e.setSalary(1600000);
        System.out.println(e.getSalary());
    }
}

class Person{
    protected String name;
    Person(String name){
        this.name = name;
    }
    void intro(){
        System.out.println("I am " + name);
    }
}

class Employee extends Person{
    private double salary;
    Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }
    void setSalary(double salary){
        this.salary = salary;

    }

    double getSalary(){
        return  salary;
    }
}