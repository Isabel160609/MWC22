package com.init.MWC22.Accions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.init.MWC22.Model.Developer;

public class CreateDeveloper {

	/**
	 * This method add all the json developers
	 * 
	 * @param developer
	 * @return
	 * @return Void
	 */
	public static Developer AddDeveloper(Developer developer) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Developer.class)
				.buildSessionFactory();

		Session miSesion = miFactory.openSession();

		try {

			miSesion.beginTransaction();

			miSesion.save(developer);

			miSesion.getTransaction().commit();

			System.out.println("Record inserted successfully");

			System.out.println("Read register with id: " + developer.getId());

			Developer productoInsertado = miSesion.get(Developer.class, developer.getId());

			System.out.println("Register " + productoInsertado);

			System.out.println("finished");

			miSesion.close();

			return productoInsertado;

		} finally {

			miFactory.close();
		}
	}

	/**
	 * This method converts the number entered by keyboard into the value of enum
	 * for the class Category
	 * 
	 * @param value
	 * @return String
	 */
	public static String findCategory(int value) {
		String stringCategory = "";

		switch (value) {
		case 1:
			stringCategory = "Front";
			break;
		case 2:
			stringCategory = "Back";
			break;
		case 3:
			stringCategory = "Mobile";
			break;

		case 4:
			stringCategory = "Data";
			break;
		}
		return stringCategory;
	}

	/**
	 * This method converts the number entered by keyboard into the value of enum
	 * for the class Dates
	 * 
	 * @param value
	 * @return String
	 */
	public static String findDate(int value) {
		String stringDate = "";

		switch (value) {
		case 1:
			stringDate = "Feb 28, 2021";
			break;
		case 2:
			stringDate = "Mar 1, 2021";
			break;
		case 3:
			stringDate = "Mar 2, 2021";
			break;

		case 4:
			stringDate = "Mar 3, 2021";
			break;
		}
		return stringDate;
	}
}
