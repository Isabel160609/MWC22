package com.init.MWC22.Utils.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.init.MWC22.Utils.Teclado;

class TecladoTest {

	@Test
	@Order(1)
	void leerString_test() {
		String expected = "hello";
		String response = Teclado.leerString("Write hello: ");
		assertEquals(expected, response);
		assertEquals(expected.getClass(), response.getClass());
	}

	@Test
	@Order(2)
	void leerEmail_test() {

		String response = Teclado.leerEmail("Please insert email: ");

		assertEquals(true, response.matches(
				"(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"));
		assertEquals(String.class, response.getClass());
	}

	@Test
	@Order(3)
	void leerTelephone_test() {

		String response = Teclado.leerTelephone("Please insert telephone: ");

		assertEquals(true, response.matches("^[0-9,-]+$"));
		assertEquals(String.class, response.getClass());

	}

	@Test
	@Order(4)
	void leerIntEnum_test() {

		int response = Teclado.leerIntEnum("Please insert a number from 1 to 4: ");
		assertEquals(true, response >= 1);
		assertEquals(true, response <= 4);

	}

	@Test
	@Order(5)
	void leerIntEnum_testMenu() {

		int response = Teclado.leerIntMenu("Please insert a number from 0 to 4: ");
		assertEquals(true, response >= 0);
		assertEquals(true, response <= 4);

	}
}
