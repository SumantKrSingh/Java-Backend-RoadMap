package day4.interfaces;

public class Main {

   public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(6000);

        Payment[] options = {new UpiPayment(), new CardPayment() };

        for(Payment x : options){
           x.pay(0);
        }

   }


}
