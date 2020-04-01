package com.sda.projects.email;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "imone.lt";

    //Sukurti konstruktoriu su keletu parametru
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email was created: " + this.firstName + " " + this.lastName);

        //iskvieciam metoda, kuris surinktu info apie departamenta
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //iskvieciam metoda, kuris sugeneruotu atsitiktini (random) slaptazodi
        this.password = generateRandomPassword(8);
        System.out.println("Generated password is: " + this.password);

        //sukombinuojame keleta komponentu, kad sugeneruotume el pasto dezute
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);

    }

    //Surinkti informacija apie departamenta
    private String setDepartment() {
        System.out.print("Enter the department\n 1 for Sales\n 2 for Accounting\n 3 for Development\n 0 for None\nEnter Department Code ");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if(departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Accounting";
        } else if (departmentChoice == 3) {
            return "Development";
        } else {
            return "";
        }
    }

    private String generateRandomPassword(int length) {
        String passwordSymbolSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int randomNumber =  (int) (Math.random() * passwordSymbolSet.length());
            password[i] = passwordSymbolSet.charAt(randomNumber);
            //System.out.println("random was: " + randomNumber);
        }

        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity  = capacity;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String showInfo(){
        return "Display name: " + firstName + " " + lastName +
                " Company email: " + email +
                " Mailbox capacity: " + mailboxCapacity + "mb.";
    }

}
