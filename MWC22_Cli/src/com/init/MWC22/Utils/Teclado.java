package com.init.MWC22.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Class to handle keyboard input*/
public class Teclado {

	private static final Scanner reading = new Scanner(System.in);

	/**
	 * This method is responsible for reading a keyboard String
	 * 
	 * @param message
	 * @return String
	 */
	public static String leerString(String message) {
		String text = "";
		boolean righ = false;

		do {
			System.out.print(message);
			try {
				text = reading.nextLine();
				righ = true;
			} catch (Exception ex) {
				System.out.println("Error in the introduction of the string.");
			}
		} while (!righ);
		return text;
	}

	/**
	 * This method is responsible for reading a keyboard Email
	 * 
	 * @param message
	 * @return String
	 */
	public static String leerEmail(String message) {
		String text = "";
		boolean righ = false;

		do {
			System.out.print(message);
			try {
				text = reading.nextLine();
				if (text.matches(
						"(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) {
					righ = true;
				} else {
					System.out.println("Error format email, please insert a  valid email.");
				}

			} catch (Exception ex) {
				System.out.println("Error format email, please insert a  valid email.");
			}
		} while (!righ);
		return text;
	}

	/**
	 * This method is responsible for reading a keyboard telephone
	 * 
	 * @param message
	 * @return String
	 */
	public static String leerTelephone(String message) {
		String text = "";
		boolean righ = false;

		do {
			System.out.print(message);
			try {
				text = reading.nextLine();
				if (!text.isEmpty() && text.matches("^[0-9,-]+$")) {
					righ = true;
				} else {
					System.out.println("Error in the introduction of the thelephone, can only have numbers and -.");
				}

			} catch (Exception ex) {
				System.out.println("Error in the introduction of the email.");
			}
		} while (!righ);
		return text;
	}

	/**
	 * This method is responsible for reading an integer from 1 to 4 from the
	 * keyboard
	 * 
	 * @param message
	 * @return int
	 */
	public static int leerIntEnum(String message) {
		int number = 0;
		boolean righ = false;

		do {
			System.out.print(message);
			try {
				number = reading.nextInt();
				if (number > 0 && number < 5) {
					righ = true;
				} else {
					System.out.println("Format error.");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Format error.");
			}
			reading.nextLine();
		} while (!righ);
		return number;
	}

	/**
	 * This method is responsible for reading an integer from 0 to 4 from the
	 * keyboard
	 * 
	 * @param message
	 * @return int
	 */
	public static int leerIntMenu(String message) {
		int number = 0;
		boolean righ = false;

		do {
			System.out.print(message);
			try {
				number = reading.nextInt();
				if (number >= 0 && number < 5) {
					righ = true;
				} else {
					System.out.println("Format error.");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Format error.");
			}
			reading.nextLine();
		} while (!righ);
		return number;
	}

}
