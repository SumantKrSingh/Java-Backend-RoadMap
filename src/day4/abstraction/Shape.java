package day4.abstraction;

public abstract class Shape {

    public abstract double area();

    public void describe(){
        System.out.println("Area is " + area());
    }
}
