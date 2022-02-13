package com.init.MWC22.Model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.init.MWC22.Model.Dates;

class DatesTest {

	@Test
	void getDatesFromCode_test() {
		Dates expected = Dates.day1;
		Dates response = Dates.getDatesFromCode("Feb 28, 2021");
		assertEquals(expected, response);
	}

}
