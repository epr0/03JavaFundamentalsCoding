package com.sda.workshops.hangman;

public class HangManPrinter {
    public int invokePrinting(int bandymuSkaicius) {
        if(bandymuSkaicius == 5) {
            spausdintiPirmaDali();
        } else if (bandymuSkaicius == 4) {
            spausdintiAntraDali();
        } else if (bandymuSkaicius == 3) {
            spausdintiTreciaDali();
        } else if (bandymuSkaicius == 2) {
            spausdintiKetvirtaDali();
        } else if (bandymuSkaicius == 1) {
            spausdintiPenktaDali();
        }

        bandymuSkaicius = bandymuSkaicius - 1;
        return bandymuSkaicius;
    }

    private void spausdintiPenktaDali() {
        System.out.println("KLAIDA!");
        System.out.println("__________");
        System.out.println("    |     ");
        System.out.println("    O     ");
        System.out.println("   /|\\   ");
        System.out.println("   / \\    ");
        System.out.println();
    }

    private void spausdintiKetvirtaDali() {
        System.out.println("KLAIDA!");
        System.out.println("__________");
        System.out.println("    |     ");
        System.out.println("    O     ");
        System.out.println("   /|\\     ");
        System.out.println();
    }

    private void spausdintiTreciaDali() {
        System.out.println("KLAIDA!");
        System.out.println("__________");
        System.out.println("    |     ");
        System.out.println("    O     ");
        System.out.println("   /|     ");
        System.out.println();
    }

    private void spausdintiAntraDali() {
        System.out.println("KLAIDA!");
        System.out.println("__________");
        System.out.println("    |     ");
        System.out.println("    O     ");
        System.out.println("    |     ");
        System.out.println();
    }

    private void spausdintiPirmaDali() {
        System.out.println("KLAIDA!");
        System.out.println("__________");
        System.out.println("    |     ");
        System.out.println("    O     ");
        System.out.println();
    }
}
