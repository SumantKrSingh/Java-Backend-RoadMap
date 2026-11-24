package day4.abstraction;

public class Rectangle extends  Shape{
    double height, width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double area(){
        return height * width;
    }
}
