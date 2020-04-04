package com.sda.workshops.email;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String companySuffix = "imone.lt";

    //Susikuriame konstruktoriu
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    //nustatyti departamenta
        this.department = setDepartment();

    //sugeneruoti slaptazodi
        this.password = generatePassword(8);

    //isspausdinti email
        //jonas.nainys@finansai.imone.lt
        String email = firstName.toLowerCase() + "."
                + lastName.toLowerCase() + "@"
                + department + "."
                + companySuffix;

        System.out.println("Sugeneruotas el. pasto adresas: " + email);
        System.out.println("Sugeneruotas random slaptazodis: " + password);

    }

    private String generatePassword(int ilgis) {
        //simboliai, kuriuos naudosime passwordo generavimui
        String simboliuEilute = "abcdefghijklmnopqrstuvwxyz123456789";
        //simboliu masyvas, kuris reprezentuos slaptazodi
        char[] password = new char[ilgis];

        for(int i = 0; i < ilgis; i++) {
            //pvz. 3
            int randomNumber = (int) (Math.random() * simboliuEilute.length());
            password[i] = simboliuEilute.charAt(randomNumber);
            //********
            //p*******
            //p9******
        }

        String convertedPassword = new String(password);

        return convertedPassword;

    }

    //surenkame info apie departamenta
    private String setDepartment() {
        System.out.println("************************");
        System.out.println("Pasirinkite departamenta");
        System.out.println("1. Pardavimu.");
        System.out.println("2. Finansu");
        System.out.println("3. Skolu");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();

        if(departmentChoice == 1) {
            return "pardavimai";
        } else if(departmentChoice == 2) {
            return "finansai";
        } else if(departmentChoice == 3) {
            return "skolos";
        } else {
            return "";
        }

    }


}
