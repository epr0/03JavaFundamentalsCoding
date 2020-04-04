package com.sda.projects.email;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailApplication {

	private static List<Email> emails = loadDabase();
	private static final String MY_FILE_LOCATION = "/Users/epro/Downloads/Courses SDA/FundamentalCoding03/java-fundamentals-coding/src/main/java/com/sda/projects/email/database.txt";

	public static void main(String[] args) throws IOException {
		initiateApplication(emails);
	}

	private static void initiateApplication(List<Email> emails) throws IOException {

		int decision = 5;

		while (decision != 0) {

			System.out.println(
					"Galimi veiksmai\n1.Prideti nauja vartotoja.\n2.Perziureti vartotoju sarasa.\n0.Baigti darba.");
			Scanner scanner = new Scanner(System.in);
			decision = scanner.nextInt();
			if (decision == 2) {
				int i = 1;
				for(Email email : emails) {
					System.out.println(i++ +". " + email.showInfo());
				}
			} else if (decision == 1) {
				System.out.println("Iveskite varda: ");
				String firstName = scanner.next();
				System.out.println("Iveskite pavarde: ");
				String lastName = scanner.next();

				Email email = new Email(firstName, lastName);
				writeDataToFile(email);
				System.out.println("Vartotojas sekmingai pridetas!");
				System.out.println("************************************");

			}
		}
	}

	private static List<Email> loadDabase() {
		List<Email> emailList = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_FILE_LOCATION))) {
			String line = bufferedReader.readLine();

			while (line != null) {
				emailList.add(mapDataToModel(line));
				line = bufferedReader.readLine();
			}

		} catch (IOException e) {
			System.out.println("Įvyko klaida nuskaitant failą!");
		}
		return emailList;
	}

	private static Email mapDataToModel(String lineData) {
		String[] splitedData = lineData.split(",");
		return new Email(splitedData[0], splitedData[1], splitedData[2], splitedData[3], splitedData[4], true);
	}

	private static void writeDataToFile(Email data) throws IOException {
		FileWriter fileWriter = new FileWriter(MY_FILE_LOCATION, true); //Set true for append mode
		PrintWriter printWriter = new PrintWriter(fileWriter);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(data.getFirstName()+","+data.getLastName()+","+data.getEmail()+","+data.getPassword()+","+data.getDepartment());
		printWriter.println(stringBuffer.toString());  //New line
		printWriter.close();
	}
}
