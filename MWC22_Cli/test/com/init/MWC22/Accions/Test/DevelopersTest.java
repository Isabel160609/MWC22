package com.init.MWC22.Accions.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.init.MWC22.Accions.Developers;

import com.init.MWC22.Model.Developer;

class DevelopersTest {


	@Test
	@Order(1)
	void getAllDevelopers_test() {

		List<Developer> developers = Developers.getAllDevelopers();
		assertEquals(true, !developers.isEmpty());
		assertEquals(true, developers.containsAll(developers));
	}

	@Test
	@Order(2)
	void getDevelopersByCategory_test() {
		List<Developer> developers = Developers.getDevelopersByCategory("Front");
		boolean equals = true;
		int i = 0;
		while (equals && i < developers.size()) {
			if (!developers.get(i).getCategory().getDisplayName().equalsIgnoreCase("Front")) {
				equals = false;
			}
			i++;
		}
		assertEquals(true, equals);

	}
	
	@Test
	@Order(3)
	void getDevelopersByDates_test() {
		List<Developer> developers = Developers.getDevelopersByDates("Mar 2, 2021");
		boolean equals = true;
		int i = 0;
		while (equals && i < developers.size()) {
			if (!developers.get(i).getDate().getDisplayName().equalsIgnoreCase("Mar 2, 2021")) {
				equals = false;
			}
			i++;
		}
		assertEquals(true, equals);

	}
	@Test
	@Order(4)
	void getDevelopersByName_test() {
		List<Developer> developers = Developers.getDevelopersByName("Harrison Edwards");

		assertEquals("Harrison Edwards", developers.get(0).getName());

	}
	
	@Test
	@Order(5)
	void getFilterList_test() {
		int filter1=Developers.getFilterList(1);
		int filter2=Developers.getFilterList(2);
		int filter3=Developers.getFilterList(3);
		int filter4=Developers.getFilterList(4);
		int filter0=Developers.getFilterList(0);
		assertEquals(1, filter1);
		assertEquals(2, filter2);
		assertEquals(3, filter3);
		assertEquals(4, filter4);
		assertEquals(0, filter0);

	}
}
