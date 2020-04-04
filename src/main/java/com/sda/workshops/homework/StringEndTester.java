package com.sda.workshops.homework;

import java.util.Scanner;

public class StringEndTester {
    //Test if string ends with a given string
    public static void main(String[] args) {
        String eiluteKuriaTikrinam = "Labas, mano vardas DariUs";
        String eilutesPabaiga = "arius";
        //Gauname ilgosios eilutes pabaigos dali.
        //Nustatyti jos dalies ilgiui atemame eilutes dalies ilgi is ilgosios eilutes ilgio
        String endOfLongString = eiluteKuriaTikrinam.substring(eiluteKuriaTikrinam.length() - eilutesPabaiga.length());

        if(compareStrings(endOfLongString, eilutesPabaiga)){
            //isvestis jeigu sutampa
            System.out.printf("Eilutes %s pabaiga sutampa su eilute %s ", eiluteKuriaTikrinam, eilutesPabaiga);
            System.out.println();
            System.out.println("Eilutes " + eiluteKuriaTikrinam + " pabaiga sutampa su eilute " + eilutesPabaiga);
        } else {
            //isvestis jeigu nesutampta
            System.out.printf("Eilutes \"%s\" pabaiga NESUTAMPA su eilute \"%s \"", eiluteKuriaTikrinam, eilutesPabaiga);
        }
    }

    private static boolean compareStrings(String endOfLongString, String eilutesPabaiga) {
        if(endOfLongString.equals(eilutesPabaiga)) {
            return true;
        } else {
            return false;
        }
    }


}
