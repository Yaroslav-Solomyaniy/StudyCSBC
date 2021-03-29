package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }
    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new java.util.Date();
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return balance;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setId(int newId) {
        id = newId;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}
public class Main {

    public static void main(String[] args)
    {
    Account Person = new Account(1122,2000.0);
    Person.setAnnualInterestRate(18.5);
    Person.withdraw(250);
    Person.deposit(300);
    System.out.println(Person);
    printTimeStamp();

    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
