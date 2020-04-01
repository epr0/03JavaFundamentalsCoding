package com.sda.projects.email;

import java.util.Scanner;

public class EmailApplication {

    public static void main(String[] args) {
        Email[] emails = new Email[5];

        initiateApplication(emails);
        }

    private static void initiateApplication(Email[] emails) {
        System.out.println("Tolimesni veiksmai?\n1.Prideti nauja vartotoja.\n2.Istrinti paskutini vartotoja.\n0.Baigti darba.");
        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();

        while(decision != 0) {
            if (decision == 2) {
                System.out.println("El. pasto dezute " + emails[0].getEmail() + " buvo sekmingai istrinta");
                emails[0] = null;
            } else if (decision == 1) {
                System.out.println("Iveskite varda: ");
                String firstName = scanner.next();
                System.out.println("Iveskite pavarde: ");
                String lastName = scanner.next();

                Email secondEmail = new Email(firstName, lastName);

                for (int i = 0; i < emails.length; i++) {
                    if (emails[i] == null) {
                        emails[i] = secondEmail;
                    }
                }

                decision = 0;
            }
        }
    }
}
