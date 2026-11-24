package day4.app;

import day4.model.Employee;
import day4.model.FullTimeEmployee;
import day4.model.Intern;
public class Main {

    public static void main(String[] args) {
        Employee[] e1 = {new FullTimeEmployee(600000, "Rahul", 1), new FullTimeEmployee(900000, "Amit", 2), new Intern(3, 19000, 3, "Aniket")};
        for(Employee x : e1){
            x.showDetails();
            System.out.println("----------------------------------------");
        };
    }
}
