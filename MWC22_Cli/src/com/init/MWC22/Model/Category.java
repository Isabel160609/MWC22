package com.init.MWC22.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonSubTypes;
//import com.fasterxml.jackson.annotation.JsonSubTypes.Type;


@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Category {

	 Front("Front"),
	 Back("Back"),
	 Mobile("Mobile"),
	 Data("Data");

	private String displayName;

	Category(String displayName) {
	      this.displayName = displayName;
	  }

	  public String getDisplayName() {
	      return displayName;
	  }
	  
	  /**
		 * This method get the Category From the Code 
		 * 
		 * @param value
		 * @return Category
		 */
	    @JsonCreator
	    public static Category getCategoryFromCode(String value) {
	 
	        for (Category dep : Category.values()) {
	 
	            if (dep.getDisplayName().equals(value)) {
	 
	                return dep;
	            }
	        }
	 
	        return null;
	    }
}
