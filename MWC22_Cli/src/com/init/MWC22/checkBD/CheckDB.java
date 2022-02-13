package com.init.MWC22.checkBD;

import java.sql.DriverManager;

public class CheckDB {

	/**
	 * This method try to connect to BBDD to confirm correct connection
	 * 
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		

		String jdbcUrl = "jdbc:mysql://localhost:3306/mwc?useSSL=false";
		String usuario = "root";
		String contra = "";

		try {

			System.out.println("trying to connect to the database" + jdbcUrl);
			DriverManager.getConnection(jdbcUrl, usuario, contra);
			System.out.println("successful connection");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
