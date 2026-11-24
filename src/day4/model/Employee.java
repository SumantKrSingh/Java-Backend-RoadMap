package day4.model;

public abstract class Employee {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

     public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

     public void showDetails(){
        System.out.println("My name is " + name + " and my employee id is " + id + " salary is " + calculateSalary());
    }

    public abstract double calculateSalary();
}
