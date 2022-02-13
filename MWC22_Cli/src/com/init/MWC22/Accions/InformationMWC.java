package com.init.MWC22.Accions;

import com.init.MWC22.Model.Dates;

public class InformationMWC {

	/**
	 * This method print the information about the days for the MWC
	 * 
	 * no @param 
	 * @return String
	 */
	public static String getDaysMwc() {
		
		
		String days = "The days for the MWC will be: " 
				+ Dates.day1.getDisplayName() + ", "
				+ Dates.day2.getDisplayName() + ", " 
				+ Dates.day3.getDisplayName() + " and "
				+ Dates.day4.getDisplayName();
		
		return days;
	}
}
