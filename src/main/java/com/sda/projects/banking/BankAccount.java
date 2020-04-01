package com.sda.projects.banking;

import java.util.Scanner;

public class BankAccount {
    public int balance;
    public int previousTransaction;
    public String customerName;
    public String customerId;

    BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        } else {
            System.out.println("Negalima ivesti neigiamos sumos!");
        }
    }

    public void withdraw(int amount) {
        balance = balance - amount;
        previousTransaction = -amount;
    }

    public void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Ivesta pinigu " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Isimta pinigu " + Math.abs(previousTransaction));
        } else {
            System.out.println("Jokiu pervedimu nerasta!");
        }
    }

    public void showMenu(CreditCard creditCard) {

        boolean leistiPrisijungti = checkCard(creditCard);

        if(leistiPrisijungti) {
            char option = '\0';
            Scanner scanner = new Scanner(System.in);
            BankingApplication bankingApplication = new BankingApplication();
            System.out.println("Sveiki, " + customerName + "!");
            System.out.println("Your generated ID is " + customerId);
            System.out.println("\n");
            System.out.println("A. Saskaitos likutis");
            System.out.println("B. Prideti pinigu");
            System.out.println("C. Isimti pinigu");
            System.out.println("D. Paskutinis atlikas veiksmas");
            System.out.println("E. Iseiti");

            do {
                System.out.println("====================================================");
                System.out.println("Pasirinkite norima operacija: ");
                System.out.println("====================================================");
                option = scanner.next().charAt(0);
                System.out.println("\n");

                switch (option) {
                    case 'A':
                        System.out.println("----------------------------------------------------");
                        System.out.println("Likutis = " + balance);
                        System.out.println("----------------------------------------------------");
                        System.out.println("\n ");
                        break;

                    case 'B':
                        System.out.println("====================================================");
                        System.out.println("Iveskite suma, kuria norite prideti:");
                        System.out.println("====================================================");
                        int amountToAdd = scanner.nextInt();
                        deposit(amountToAdd);
                        System.out.println("\n ");
                        break;

                    case 'C':
                        System.out.println("====================================================");
                        System.out.println("Iveskite suma, kuria norite isimti:");
                        System.out.println("====================================================");
                        int amountToWithdraw = scanner.nextInt();
                        withdraw(amountToWithdraw);
                        System.out.println("\n ");
                        break;

                    case 'D':
                        System.out.println("====================================================");
                        System.out.println("Jusu paskutinis atliktas veiksmas:");
                        getPreviousTransaction();
                        System.out.println("====================================================");
                        System.out.println("\n ");
                        break;

                    case 'E':
                        System.out.println("----------------------------------------------------");
                        break;

                    default:
                        System.out.println("Neteisingai pasirinkta operacija! Pabandykite dar karta");
                        break;

                }
            } while (option != 'E');

            System.out.println("Aciu, kad naudojates musu paslaugomis!");
        } else {
            System.out.println("Nepavyko prisijungti prie sistemos.");
        }
    }

    private boolean checkCard(CreditCard creditCard) {
        System.out.println("Iveskite PIN: ");
        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();
        return pin == creditCard.cardPin ? true : false;
    }
}
