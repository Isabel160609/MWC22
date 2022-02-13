package com.init.MWC22.Accions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.init.MWC22.Model.Developer;
import com.init.MWC22.Utils.Teclado;

public class Developers {

	/**
	 * This method return all the developers from BBDD
	 * 
	 * @param
	 * @return List<Developer>
	 */
	@SuppressWarnings("unchecked")
	public static List<Developer> getAllDevelopers() {

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer.class)
				.buildSessionFactory();

		Session miSesion = miFactory.openSession();

		List<Developer> listDeveloper = new ArrayList<Developer>();
		try {
			// start session

			miSesion.beginTransaction();

			// consult developers

			String query = "FROM Developer";

			listDeveloper = miSesion.createQuery(query).getResultList();

			// comit
			miSesion.getTransaction().commit();

			// close session
			miSesion.close();

			return listDeveloper;

		} finally {

			// close factory
			miFactory.close();
		}
	}

	/**
	 * This method return all the developers from BBDD filter by category
	 * 
	 * @param String
	 * @return List<Developer>
	 */
	public static List<Developer> getDevelopersByCategory(String type) {

		List<Developer> developers = getAllDevelopers();

		List<Developer> newLIstDevelopers = developers.stream()
				.filter(x -> x.getCategory().getDisplayName().equals(type)).collect(Collectors.toList());

		return newLIstDevelopers;
	}

	/**
	 * This method return all the developers from BBDD filter by date
	 * 
	 * @param String
	 * @return List<Developer>
	 */
	public static List<Developer> getDevelopersByDates(String type) {

		List<Developer> developers = getAllDevelopers();

		List<Developer> newLIstDevelopers = developers.stream().filter(x -> x.getDate().getDisplayName().equals(type))
				.collect(Collectors.toList());

		return newLIstDevelopers;
	}

	/**
	 * This method return all the developers from BBDD filter by name
	 * 
	 * @param String
	 * @return List<Developer>
	 */
	public static List<Developer> getDevelopersByName(String name) {

		List<Developer> developers = getAllDevelopers();

		List<Developer> newLIstDevelopers = developers.stream().filter(x -> x.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());

		return newLIstDevelopers;
	}

	/**
	 * This method returns the type of filter you have chosen
	 * 
	 * @param int
	 * @return int
	 */
	public static int getFilterList(int type) {

		switch (type) {
		case 1:
			List<Developer> listDeveloper = Developers.getAllDevelopers();
			if (!listDeveloper.isEmpty()) {

				listDeveloper.forEach(x -> System.out.println(x));

			} else {
				System.out.println("The list is empty, there aren't developers");
			}
			break;
		case 2:
			String type2 = CreateDeveloper.findCategory(Teclado.leerIntEnum(
					"Please insert the developer category(1 for Front,2 for Back, 3 for Mobile,4 for Data): "));
			List<Developer> listDeveloperCategory = Developers.getDevelopersByCategory(type2);
			if (!listDeveloperCategory.isEmpty()) {

				listDeveloperCategory.forEach(x -> System.out.println(x));

			} else {
				System.out.println("There aren't developers for this category");
			}
			break;
		case 3:
			String type3 = CreateDeveloper.findDate(Teclado.leerIntEnum(
					"What date,do you want to filter?\n1 for Feb 28, 2021 \n2 for Mar 1, 2021 \n3 for Mar 2, 2021 \n4 for Mar 3, 2021\n"));
			List<Developer> listDeveloperDate = Developers.getDevelopersByDates(type3);
			if (!listDeveloperDate.isEmpty()) {

				listDeveloperDate.forEach(x -> System.out.println(x));

			} else {
				System.out.println("There aren't developers for this date");
			}
			break;
		case 4:
			String name = Teclado.leerString("please inser the name ");
			List<Developer> listDeveloperName = Developers.getDevelopersByName(name);
			if (!listDeveloperName.isEmpty()) {

				listDeveloperName.forEach(x -> System.out.println(x));

			} else {
				System.out.println("We can't find this developer name");
			}
			break;
		case 0:

			break;
		}
		return type;
	}
}
