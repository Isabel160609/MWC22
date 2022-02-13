package com.init.MWC22.Main;

import com.init.MWC22.Accions.CreateDeveloper;
import com.init.MWC22.Accions.Developers;
import com.init.MWC22.Accions.InformationMWC;
import com.init.MWC22.Accions.ReadJson;
import com.init.MWC22.Model.Category;
import com.init.MWC22.Model.Dates;
import com.init.MWC22.Model.Developer;
import com.init.MWC22.Utils.Teclado;

public class Main {

	public static void main(String[] args) {

		boolean exit = false;

		do {
			switch (menu()) {
			case 1:
				String file = "data.json";
				ReadJson.AddJsonDeveloper(file);
				break;
			case 2:
				String information = InformationMWC.getDaysMwc();
				System.out.println(information);
				break;
			case 3:

				boolean exit2 = false;
				do {

					int result = Developers.getFilterList(menu2());
					if (result == 0) {
						exit2 = true;
					}
				} while (!exit2);
				break;

			case 4:
				String name = Teclado.leerString("Please insert the developer name: ");
				String email = Teclado.leerEmail("Please insert the developer email: ");
				String telephone = Teclado.leerTelephone("Please insert the developer telephone: ");
				Category category = Category.getCategoryFromCode(CreateDeveloper.findCategory(Teclado.leerIntEnum(
						"Please insert the developer category(1 for Front,2 for Back, 3 for Mobile,4 for Data): ")));
				Dates dates = Dates.getDatesFromCode(CreateDeveloper.findDate(Teclado.leerIntEnum(
						"Please insert the developer date\n1 for Feb 28, 2021 \n2 for Mar 1, 2021 \n3 for Mar 2, 2021 \n4 for Mar 3, 2021\n")));
				Developer developer = new Developer(name, email, category, telephone, dates);
				Developer newDeveloper = CreateDeveloper.AddDeveloper(developer);
				System.out.println(newDeveloper);
				break;

			case 0:
				System.out.println("Thanks for use the app");
				exit = true;
				break;

			}
		} while (!exit);
	}

	/**
	 * This method is used to choose an option
	 * 
	 * @param
	 * @return int
	 */
	public static int menu() {

		int option;
		final int MIN = 0;
		final int MAX = 4;

		do {

			option = Teclado.leerIntMenu("\nMAIN MENU " 
										+ "\n1. Read json and insert in BBDD." 
										+ "\n2. MWC information."
										+ "\n3. Developers(you can print all the list or filter by categories, date or name)."
										+ "\n4. Add Developer." 
										+ "\n0. Exit.\n");
			if (option < MIN || option > MAX) {
				System.out.println("Please enter a valid option");
			}
		} while (option < MIN || option > MAX);
		return option;
	}

	/**
	 * This method is used to choose an option
	 * 
	 * @param
	 * @return int
	 */
	public static int menu2() {

		int option;
		final int MIN = 0;
		final int MAX = 4;

		do {

			option = Teclado.leerIntMenu("Please write:\r\n" 
										+ "1 to see full list\r\n" 
										+ "2 to filter by category\r\n"
										+ "3 to filter by dates\r\n" 
										+ "4 to filter by developer name\r\n" 
										+ "0 Exit to the list item:\r\n ");
			if (option < MIN || option > MAX) {
				System.out.println("Please enter a valid option");
			}
		} while (option < MIN || option > MAX);
		return option;
	}
}
