package com.sda.workshops.hangman;

import com.sda.projects.email.Email;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Sukurti sarasa zodziu, kuriuos naudosime zaidime
        List<String> zodziuSarasas = new ArrayList<>(
                Arrays.asList("buratinas", "dangus", "stiklas" , "ananasas" , "prezidentas"));
        //zodziuSarasas.add("zodis");
        //zodziuSarasas.add("zodis");

        int bandymuSkaicius = 5;
        int randomSkaicius = ThreadLocalRandom.current().nextInt(0,4);
        String randomZodis = zodziuSarasas.get(randomSkaicius);
        int randomZodzioIlgis = randomZodis.length();

        StringBuffer stringBuffer = new StringBuffer();
        //konstruojam atitinkamo ilgio ****** eilute
        for(int i=0; i<randomZodzioIlgis; i++) {
            stringBuffer.append("*");
        }

        String pasleptasZodis = stringBuffer.toString();

        //paslepta zodi paversime i simboliu masyva
        char[] pasleptoZodzioSimboliuMasyvas = pasleptasZodis.toCharArray();
        //random zodi paversime i simboliu masyva
        char[] randomZodzioSimboliuMasyvas = randomZodis.toCharArray();

        System.out.println("Sveiki atvyke i zaidima KARTUVES!");
        System.out.println("\n\n");
        System.out.println("Atspekite zodi. Jus turite 5 sansus suklysti. Speliokite po viena raide (mazaja)!");
        System.out.println();
        HangManPrinter hangManPrinter = new HangManPrinter();

        do {
            System.out.println("Spekite raide: ");
            char raide = scanner.next().charAt(0);

            if(randomZodis.indexOf(raide) != -1) {
                System.out.println("=====================================");
                System.out.println("Atspejote raide! Teisinga raide buvo [" + raide +"] Spekite toliau!");

                for(int i = 0; i<randomZodzioSimboliuMasyvas.length; i++) {
                   if(randomZodzioSimboliuMasyvas[i] == raide) {
                       pasleptoZodzioSimboliuMasyvas[i] = raide;
                       //*a**** [dangus]
                   }
                }

                //Jeigu visas zodis yra atspetas
                //*******
                //zodis
                if(!new String(pasleptoZodzioSimboliuMasyvas).contains("*")) {
                    //atspetas
                    System.out.println("Sveikiname! Jus atspejote zodi >>>> [" + new String(pasleptoZodzioSimboliuMasyvas) +"] <<<<");
                    break;
                } else {
                    System.out.println("Zodis, kuri turite atspeti atrodo taip: " + new String(pasleptoZodzioSimboliuMasyvas));
                    System.out.println("=====================================");
                }
            } else {
               //aprasysime logika su neatspetais simboliais
                bandymuSkaicius = hangManPrinter.invokePrinting(bandymuSkaicius);
                if(bandymuSkaicius > 0) {
                    System.out.println("Neatspejote! Bandykite dar karta! Liko bandymu: " + bandymuSkaicius);
                    System.out.println("Zodis, kuri turite atspeti: " + new String(pasleptoZodzioSimboliuMasyvas));
                }
            }

        } while (bandymuSkaicius > 0);

        System.out.println("Zaidimas Baigtas!");




    }
}
