package org.thbs;



public class THclient {
    Bank bank;



    public THclient(Bank bank)
    {
        this.bank = bank;
    }



    public Bank getBank() {
        return bank;
    }



    public void setBank(Bank bank) {
        this.bank = bank;
    }



    public double getBalance(long accId)
    {
        System.out.println("In Torry Harris client : Get Balance");
        return bank.getBalance(accId);
    }



    public double withdraw(long accId,double amount)
    {
        System.out.println("In Torry Harris client : withdraw");
        return bank.withdraw(accId, amount);
    }



    public double deposit(long accId,double amount)
    {
        System.out.println("In Torry Harris client : deposit");
        return bank.deposit(accId, amount);
    }
}