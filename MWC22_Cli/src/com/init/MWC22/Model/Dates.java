package com.init.MWC22.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Dates {

	day1("Feb 28, 2021"),
	day2("Mar 1, 2021"),
	day3("Mar 2, 2021"),
	day4("Mar 3, 2021");

	private String displayName;

	Dates(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	/**
	 * This method get the Dates From the Code
	 * 
	 * @param value
	 * @return Dates
	 */
	@JsonCreator
	public static Dates getDatesFromCode(String value) {

		for (Dates dep : Dates.values()) {

			if (dep.getDisplayName().equals(value)) {

				return dep;
			}
		}

		return null;
	}
}
