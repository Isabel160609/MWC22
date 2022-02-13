package com.init.MWC22.Accions.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.init.MWC22.Accions.ReadJson;

class ReadJsonTest {


	@Test
	public void test() {
		int expected = 4;
		int response = ReadJson.AddJsonDeveloper("test.json");
		assertEquals(expected, response);

	}

}
