package com.init.MWC22.Model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.init.MWC22.Model.Category;

class CategoryTest {

	@Test
	void getCategoryFromCode_test() {
		Category expected = Category.Back;
		Category response = Category.getCategoryFromCode("Back");
		assertEquals(expected, response);
	}

}
