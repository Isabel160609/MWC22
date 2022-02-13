package com.init.MWC22.Accions.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.init.MWC22.Accions.CreateDeveloper;
import com.init.MWC22.Model.Category;
import com.init.MWC22.Model.Dates;
import com.init.MWC22.Model.Developer;

class CreateDeveloperTest {

	@Test
	void AddDeveloper_test() {
		Developer developer1 = new Developer(2, "Lester Sampson", "dui.cras@outlook.edu", Category.Back, "589-3079",
				Dates.day1);
		Developer developerResponse = CreateDeveloper.AddDeveloper(developer1);
		assertEquals(developer1, developerResponse);
	}

	@Test
	void findCategory_test() {
		String category1 = CreateDeveloper.findCategory(1);
		String category2 = CreateDeveloper.findCategory(2);
		String category3 = CreateDeveloper.findCategory(3);
		String category4 = CreateDeveloper.findCategory(4);

		assertEquals("Front", category1);
		assertEquals("Back", category2);
		assertEquals("Mobile", category3);
		assertEquals("Data", category4);
	}

	@Test
	void findDate_test() {
		String date1 = CreateDeveloper.findDate(1);
		String date2 = CreateDeveloper.findDate(2);
		String date3 = CreateDeveloper.findDate(3);
		String date4 = CreateDeveloper.findDate(4);

		assertEquals("Feb 28, 2021", date1);
		assertEquals("Mar 1, 2021", date2);
		assertEquals("Mar 2, 2021", date3);
		assertEquals("Mar 3, 2021", date4);
	}
}
