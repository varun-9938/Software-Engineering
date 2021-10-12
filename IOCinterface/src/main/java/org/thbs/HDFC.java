package org.thbs;

public class HDFC implements Bank{

    @Override
    public double getBalance(long accid) {
        System.out.println("HDFC : Balance : ");
        return Math.random()*10000;
    }

    @Override
    public double withdraw(long accid, double amount) {
        System.out.println("HDFC : Withdraw : ");
        return Math.random()*10000;
    }

    @Override
    public double deposit(long accid, double amount) {
        System.out.println("HDFC : Deposit : ");
        return Math.random()*10000;
    }
}
