package com.sda.workshops.homework;

public class StringSymbolCounter {
    public static void main(String[] args) {
        String stringToCount = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";

        //apsibrezti kintamuosius
        int raidziuSkaicius = 0;
        int tarpeliuSkaicius = 0;
        int skaiciuSkaicius = 0;
        int kituSimboliuSkaicius = 0;

        //ciklo pagalba perbegti per eilute
        for(int i = 0; i<stringToCount.length(); i++) {
            //ieskome raidziu
            if(stringToCount.substring(i,i+1).matches("[a-zA-Z]")) {
                raidziuSkaicius++;
            } else if(stringToCount.substring(i,i+1).matches(" ")) {
                tarpeliuSkaicius++;
            } else if(stringToCount.substring(i,i+1).matches("[0-9]")) {
                skaiciuSkaicius++;
            } else {
                kituSimboliuSkaicius++;
            }

        }

        //patikrinti ar toks/tokie simboliai egzistuoja eiluteje
        //susumuoti simbolius

        //rezutalta isvesti i ekrana
        System.out.println("Raidziu skaicius: " + raidziuSkaicius);
        System.out.println("Tarpeliu skaicius: " + tarpeliuSkaicius);
        System.out.println("Skaiciu skaicius: " + skaiciuSkaicius);
        System.out.println("Kitu simboliu skaicius: " + kituSimboliuSkaicius);

    }
}
