package com.init.MWC22.Accions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.init.MWC22.Model.Developer;

public class ReadJson {
	/**
	 * This method read json and insert in the BBDD
	 * 
	 * @param file
	 * @return int
	 */
	public static int AddJsonDeveloper(String file) {
		int count = 0;
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			InputStream inputStream = new FileInputStream(new File(file));
			
			TypeReference<List<Developer>> typeReference = new TypeReference<List<Developer>>() {
			};
			
			List<Developer> developers = mapper.readValue(inputStream, typeReference);
			
			SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Developer.class).buildSessionFactory();

			Session miSesion = miFactory.openSession();

			try {

				for (Developer developer : developers) {

					miSesion.beginTransaction();

					miSesion.save(developer);

					miSesion.getTransaction().commit();

					count++;
				}
				miSesion.close();

			} finally {
				if (count>0) {
					System.out.println(count + " Records inserted");
				}else {
					System.out.println(count + " No data inserted");
				}
				
				miFactory.close();
			}
			return count;
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			return count;
		} catch (JsonParseException e) {
			
			e.printStackTrace();
			return count;
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
			return count;
		} catch (IOException e) {
			
			e.printStackTrace();
			return count;
		}
	}
}
