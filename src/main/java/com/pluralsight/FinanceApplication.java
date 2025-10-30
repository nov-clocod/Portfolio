package com.pluralsight;

import com.pluralsight.classes.BankAccount;
import com.pluralsight.classes.House;
import com.pluralsight.classes.Jewelry;
import com.pluralsight.classes.Portfolio;
import com.pluralsight.interfaces.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);
        Valuable goldRing = new Jewelry("Golden Era", 1000, 1);
        Valuable house = new House("Living house", 300000, 2015, 1500, 4);

        account1.deposit(100);
        //account2.deposit(100);

        Portfolio myPortfolio = new Portfolio("Personal Portfolio", "Andy");

        myPortfolio.add(new BankAccount("Pam", "123", 12500));
        myPortfolio.add(new BankAccount("Gary", "456", 1500));
        myPortfolio.add(new Jewelry("Golden Era", 1000, 1));
        myPortfolio.add(new House("Living house", 300000, 2015, 1500, 4));
        System.out.println(myPortfolio.getValue());
        System.out.println(myPortfolio.getMostValuable());
        System.out.println(myPortfolio.getLeastValuable());
    }
}
