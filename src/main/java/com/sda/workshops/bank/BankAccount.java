package com.sda.workshops.bank;

import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    public BankAccount(String customerName, String customerId) {
        System.out.println("Ivoking BankAccount class constructor");
        this.customerName = customerName;
        this.customerId = customerId;
    }
    //metodas skirtas prideti pinigu i saskaita
    public void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        } else {
            System.out.println("Negalima ivesti neigiamos sumos!");
        }
    }

    //istraukti pinigams is saskaitos
    public void withdraw(int amount) {
        balance = balance - amount;
        previousTransaction = -amount;
    }

    public void showPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Ivesta pinigu " + previousTransaction);
        } else if(previousTransaction < 0) {
            System.out.println("Isimta pinigu " + previousTransaction);
        } else {
            System.out.println("Jokiu veiksmu nerasta.");
        }
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        char pasirinkimas = '0';

        System.out.println("Sveiki, " + customerName + "!");
        System.out.println("Jusu vartotojo ID yra: " + customerId);
        System.out.println();
        System.out.println("a - Saskaitos likutis");
        System.out.println("b - Inesti pinigu");
        System.out.println("c - Pasiimti pinigu");
        System.out.println("d - Paskutine atlikta operacija");
        System.out.println("e - Iseit");

        do {
            System.out.println("===========================");
            System.out.println("Pasirinkite norima operacija:");
            System.out.println("===========================");
            pasirinkimas = scanner.next().charAt(0);
            System.out.println();
            System.out.println();

            switch (pasirinkimas) {
                case 'a' :
                    System.out.println("---------------------");
                    System.out.println("Saskaitos likutis = " + balance);
                    System.out.println("---------------------");
                    System.out.println();
                    break;

                case 'b' :
                    System.out.println("---------------------");
                    System.out.println("Iveskite suma, kuria norite ivesti:");
                    System.out.println("---------------------");
                    int amountToAdd = scanner.nextInt();
                    deposit(amountToAdd);
                    System.out.println();
                    break;

                case 'c' :
                    System.out.println("---------------------");
                    System.out.println("Iveskite suma, kuria norite isimti:");
                    System.out.println("---------------------");
                    int amountToWithdraw = scanner.nextInt();
                    withdraw(amountToWithdraw);
                    System.out.println();
                    break;

                case 'd' :
                    System.out.println("---------------------");
                    System.out.println("Jusu paskutine atlikta operacija:");
                    showPreviousTransaction();
                    System.out.println("---------------------");
                    break;

                case 'e':
                    System.out.println("*******************************BYE");
                    break;

                default:
                    System.out.println("Neteisingai pasirinktas operacijos numeris. Bandykite dar karta.");
                    break;

            }


        } while (pasirinkimas != 'e');


    }





}
