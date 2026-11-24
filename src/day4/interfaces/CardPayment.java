package day4.interfaces;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Paid " + amount + " via Master Card");
    }
}
