package org.thbs;

public interface Bank {
    double getBalance(long accid);
    double withdraw(long accid ,double amount);
    double deposit(long accid,double amount);
}
