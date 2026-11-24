package day4.polymorphism;

public class Main {

   public  static void main(String[] args) {

//        Animal a= new Dog();
//        a.sound();
//        Animal b = new Cat();
//        b.sound();
//        Animal c = new Animal();
//        c.sound();
//        Animal d = new Cow();
//        d.sound();

        Animal[] zoo = {new Dog(), new Cat(), new Animal(), new Cow()};
        for(Animal x : zoo){
            x.sound();
        }
    }
}
