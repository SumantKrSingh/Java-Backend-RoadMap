package day4.model;

public class Intern extends Employee {
    double stipend;
    int months;

    public Intern(int months, double stipend, int id, String name){
        super(id, name);
        this.stipend = stipend;
        this.months = months;
    }

    @Override
    public double calculateSalary(){
        return stipend;
    }
}
