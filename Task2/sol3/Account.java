package Task2.sol3;

import javax.xml.transform.Source;

public class Account {
    int balance;

    public Account() {

    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("The deposited amount: " + amount);
        System.out.println("Updated balance: " + balance);

    }

    public void withdraw(int amount){
        if (amount<=balance) {
            balance -= amount;
            System.out.println("The withdrawal amount:" + amount);
            System.out.println("Updated balance: " + balance);
        }else
            System.out.println("Insufficient balance");
}

    public void balance (){
        System.out.print("Current balance:" + getBalance());
    }
}
