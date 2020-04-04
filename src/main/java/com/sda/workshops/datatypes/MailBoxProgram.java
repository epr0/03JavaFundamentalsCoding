package com.sda.workshops.datatypes;

import java.util.Random;
import java.util.Scanner;

public class MailBoxProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name and last name:");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Choose department:" +
                "\n[1] Pardavimu, " +
                "\n[2] Bankroto, " +
                "\n[3] Marketingo ");
        String departmentNumber = scanner.nextLine();
        String departmentName = "";
        if (departmentNumber.equalsIgnoreCase("1")) {
            departmentName = "pardavimu";
            System.out.println(departmentName);
        } else if (departmentNumber.equalsIgnoreCase("2")) {
            departmentName = "bankroto";
        } else if (departmentNumber.equalsIgnoreCase("3")) {
            departmentName = "marketingo";
        } else {
            System.out.println("nepasirinktas nei vienas iš duotų variantų, įveskite savo");
            departmentName = scanner.nextLine();
        }
        System.out.println("e-mail adress: \n" + firstName + "." + lastName + "@" + departmentName + ".company.lt");
        Random random = new Random();
        StringBuilder passwordName = new StringBuilder();
        String alphabet = "aqwsedrf123456789!@#$%^&*";
        for (int i = 0; i < 7; i++) {
            // System.out.print(alphabet.charAt(random.nextInt(alphabet.length())));
            passwordName.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        //passwordName.toString();
        System.out.println("Generated random password:\n" + passwordName);
        System.out.println("Choose option:" +
                "\n[1] - Pakeisti vartotojo slaptazodi " +
                "\n[2] - Pakeisti vartotojo skyriu " +
                "\n[3] - Istrinti si vartotoja ir ivesti nauja. " +
                "\n[4] - Įrašyti ir Baigti");
        int nextOption = scanner.nextInt();
        System.out.println(nextOption);
        if (nextOption == 1) {
            System.out.println("įveskite naują slapatažodį: ");
            Scanner scanner4 = new Scanner(System.in);
            String newpasswordName = scanner4.nextLine();
            passwordName = new StringBuilder();
            passwordName = passwordName.append(newpasswordName);
            System.out.println(passwordName);
        } else if (nextOption == 2){
            System.out.println("įveskite naują skyrių: ");
            Scanner scanner2 = new Scanner(System.in);
            String newdepartmentName = scanner2.nextLine();
            departmentName = newdepartmentName;
            System.out.println(departmentName);
        } else if (nextOption == 3) {
            System.out.println("Enter first name and last name:");
            Scanner scanner3 = new Scanner(System.in);
            String newfirstName = scanner3.nextLine();
            String newlastName = scanner3.nextLine();
            firstName = newfirstName;
            lastName = newlastName;
            // } else if (nextOption == 4) {
        } else {
            System.out.println("įrašoma ir baigiama");}
        System.out.println("e-mail adress: \n" + firstName + "." + lastName + "@" + departmentName + ".company.lt");
    }
}