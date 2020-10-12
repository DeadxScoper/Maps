package org.horizoncolumbus.hs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map familyCars = new HashMap();
        familyCars.put("Aaron", "BMW x5");
        familyCars.put("Garcia", "Mercedes GLC");
        familyCars.put("Spencer", "Toyota Camry");
        System.out.println(familyCars);

        familyCars.replace("Spencer", "Lexus SUV");
        System.out.println(familyCars);

        familyCars.remove("Aaron");
        familyCars.put("Snape", "BMW x5");
        System.out.println(familyCars);
    }
}
