public class BankAccount {
    private double balance;

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount");
            return;
        }
        this.balance += amount;
        System.out.println("Deposit succesfully: " + amount);
    }

    void withDraw(double amount){
        if(amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdraw succesfully: " + amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    double getBalance(){
        return balance;

    }

    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.deposit(1000.00);
        b.withDraw(500);
        System.out.println( b.getBalance());

    }
}
