package day4.interfaces;

public class UpiPayment implements Payment{

    public void pay(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Paid " + amount + " via UPI");
    }
}
