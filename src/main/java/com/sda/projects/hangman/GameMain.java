package com.sda.projects.hangman;

import java.io.IOException;
import java.util.Scanner;

public class GameMain {
    public static int bandymai = 5;
    public static void main(String[] args) throws IOException {
        System.out.println("____________");
        System.out.println("      |     ");
        System.out.println("      O     ");
        System.out.println("     /|\\    ");
        System.out.println("     /\\    ");

        String zodis = "labas";
        String hiddenZodis = "*****";
        char[] globalCharArray = hiddenZodis.toCharArray();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sveiki atvyke i zaidima KARTUVES!");
        System.out.println();
        System.out.println("Atspekite zodi - jus turite 5 sansus suklysti. Speliokite po viena raide!");
        System.out.println("Spek raide: ");

        do {
            char raide = scanner.next().charAt(0);
            if(zodis.indexOf(raide) != -1) {
                System.out.println("Atspejai raide! Teisinga raide buvo [" + raide + "] Spek toliau!");
                for(int i = 0; i < zodis.toCharArray().length; i++){
                    if(zodis.toCharArray()[i] == raide) {
                        globalCharArray[i] = raide;
                    }

                }
               
                //Jeigu nebera neatspetu simboliu
                if(!new String(globalCharArray).contains("*")) {
                	System.out.print("Sveikiname! Atspejai zodi >>> [" + new String(globalCharArray) + "] <<<");
                } else {
                	 System.out.println("Zodis, kuris turi atspeti, atrodo taip: " + new String(globalCharArray));
                }
            } else {
                invokePrinting();

                System.out.println("Neaspejai! Bandyk dar karta! Liko badymu: " + bandymai);
                System.out.println("Zodis, kuris turi atspeti: " + new String(globalCharArray) );
            }
        } while (bandymai > 0);
    }

    private static void invokePrinting() throws IOException {
        if(bandymai == 5) {
            firstMistake();
            bandymai--;
        } else if (bandymai == 4) {
            secondMistake();
            bandymai--;
        } else if (bandymai == 3) {
            thirdMistake();
            bandymai--;
        } else if (bandymai == 2) {
            fourthMistake();
            bandymai--;
        }

    }

    private static void firstMistake() throws IOException {
        System.out.println("KLAIDA!");
        System.out.println("____________");
        System.out.println("      |     ");
        System.out.println("      O     ");
        System.out.println();
    }

    private static void secondMistake() throws IOException {
        System.out.println("____________");
        System.out.println("      |     ");
        System.out.println("      O     ");
        System.out.println("      |     ");
        System.out.println();
    }

    private static void thirdMistake() throws IOException {
        System.out.println("____________");
        System.out.println("      |     ");
        System.out.println("      O     ");
        System.out.println("     /|   ");
        System.out.println();
    }

    private static void fourthMistake() throws IOException {
        System.out.println("____________");
        System.out.println("      |     ");
        System.out.println("      O     ");
        System.out.println("     /|\\    ");
        System.out.println();
    }


}
