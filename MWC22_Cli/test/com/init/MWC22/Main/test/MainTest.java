package com.init.MWC22.Main.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.init.MWC22.Main.Main;

class MainTest {



	@Test
	void menu_test() {
		int menu=Main.menu();
		assertEquals(true, menu<=4);
		assertEquals(true, menu>=0);
	}
	@Test
	void menu2_test() {
		int menu=Main.menu();
		assertEquals(true, menu<=4);
		assertEquals(true, menu>=0);
	}
}
