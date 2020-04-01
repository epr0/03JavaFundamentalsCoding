package com.sda.projects.banking;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Edvinas", "1");
        CreditCard creditCard = new CreditCard("Edvinas Pro", 1234);
        bankAccount.showMenu(creditCard);
    }
}
