package Zteste;

import java.util.HashMap; // import the HashMap class	

public class gwe {
	public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.get("England"));
	    
	    capitalCities.remove("England");
	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.size());

	    for (String i : capitalCities.keySet()) {
	        System.out.println(i);
	      }
	  }
	
	
	
	
}