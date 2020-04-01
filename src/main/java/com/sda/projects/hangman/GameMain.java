package com.sda.projects.hangman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameMain {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		//apsibreziame sarasa reikalingu kintamuju
		List<String> zodziuSarasas = new ArrayList<>(
				Arrays.asList("varna", "stalas", "dangus", "namas", "buratinas"));
		
		int bandymai = 5;
		int randomSkaicius = ThreadLocalRandom.current().nextInt(0, 5);
		String randomZodis = zodziuSarasas.get(randomSkaicius);
		int randomZodzioIlgis = randomZodis.length();
		//printerio klase, kuri spausdins pakaruokli
		HangManPrinter hangManPrinter = new HangManPrinter();
		
		//string buffer klase, skirta sukonstruoti eilute
		StringBuffer stringBuffer = new StringBuffer();
		// Sukonstruojame atitinkamo ilgio ****** eilute.
		for (int i = 0; i < randomZodzioIlgis; i++) {
			stringBuffer.append("*");
		}
		String pasleptasZodis = stringBuffer.toString();
		
		//paslepta zodi paverciame i simboliu masyva 
		char[] pasleptoZodzioSimboliuMasyvas = pasleptasZodis.toCharArray();
		//random zodi paverciame i simboliu masyva
		char[] randomZodzioSimboliuMasyvas = randomZodis.toCharArray();

		System.out.println("Sveiki atvyke i zaidima KARTUVES!");
		System.out.println();
		System.out.println("Atspekite zodi - jus turite 5 sansus suklysti. Speliokite po viena raide!");
		System.out.println();
		
		//sukame cikla tol, kol bus tenkinama salyga "bandymai > 0"
		do {
			System.out.println("Spekite raide: ");
			//nuskaitome vartotojo ivesta simboli
			char raide = scanner.next().charAt(0);
			
			//tikriname ar random zodyje egzistuoja ivestas simbolis
			if (randomZodis.indexOf(raide) != -1) {
				System.out.println("================================================================");
				System.out.println("Atspejai raide! Teisinga raide buvo [" + raide + "] Spek toliau!");
				//sukame cikla per visus random zodzio simbolius ir tikriname, kelintas simbolis buvo atspetas
				//tada esama "*" simboli pakeiciame atspeta raide. 
				//po pakeitimo paslepta eilute atrodys pvz. taip "**a*a*"
				for (int i = 0; i < randomZodzioSimboliuMasyvas.length; i++) {
					if (randomZodzioSimboliuMasyvas[i] == raide) {
						pasleptoZodzioSimboliuMasyvas[i] = raide;
					}
				}

				// Jeigu nebera neatspetu simboliu, isspausdiname teksta ir nutraukiame cikla.
				if (!new String(pasleptoZodzioSimboliuMasyvas).contains("*")) {
					System.out.println("Sveikiname! Atspejai zodi >>> [" + new String(pasleptoZodzioSimboliuMasyvas) + "] <<<");
					break;
				} else {
					System.out.println("Zodis, kuris turi atspeti, atrodo taip: " + new String(pasleptoZodzioSimboliuMasyvas));
					System.out.println("================================================================");
				}
			} else {
				//jei raides atspeti nepavyo, kvieciame HangManPrinter klases metoda, kuris isspausdina teksta
				bandymai = hangManPrinter.invokePrinting(bandymai);
				if (bandymai > 0) {
					System.out.println("Neaspejai! Bandyk dar karta! Liko badymu: " + bandymai);
					System.out.println("Zodis, kuris turi atspeti: " + new String(pasleptoZodzioSimboliuMasyvas));
				}

			}
		} while (bandymai > 0);

		System.out.println("Zaidimas Baigtas");
	}

}
