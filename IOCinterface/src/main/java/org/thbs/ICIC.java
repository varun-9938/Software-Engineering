package org.thbs;

public class ICIC implements Bank{
    @Override
    public double getBalance(long accid) {
        System.out.println("ICIC:  Balance: ");
        return Math.random()*10000;
    }

    @Override
    public double withdraw(long accid, double amount) {
        System.out.println("ICIC:  Withdraw: ");
        return Math.random()*10000;
    }

    @Override
    public double deposit(long accid, double amount) {
        System.out.println("ICIC:  Deposit: ");
        return Math.random()*10000;
    }
}
