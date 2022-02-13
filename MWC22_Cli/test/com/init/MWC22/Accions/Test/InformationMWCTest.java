package com.init.MWC22.Accions.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.init.MWC22.Accions.InformationMWC;

class InformationMWCTest {


	@Test
	public void getDaysMwc_test() {
		String expected = "The days for the MWC will be: Feb 28, 2021, Mar 1, 2021, Mar 2, 2021 and Mar 3, 2021";
		String response = InformationMWC.getDaysMwc();
		assertEquals(expected, response);
	}

}
