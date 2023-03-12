package br.edu.ifsp.dmoS5superbancoimobiliriodmo.Model;

public class CreditCard {

    int id;
    double balance;

    public CreditCard(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    void creditValue(double value){
        this.balance += value;
    }

    void debitValue(double value){
        this.balance -= value;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
