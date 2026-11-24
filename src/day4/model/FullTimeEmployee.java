package day4.model;

public class FullTimeEmployee extends Employee{

    double monthlySalary;

    public FullTimeEmployee(double monthlySalary, String name, int id){
        super(id, name);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public double calculateSalary(){
        return  monthlySalary;
    }
}
