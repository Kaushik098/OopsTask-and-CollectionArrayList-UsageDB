package encapsulationConcept;

import java.util.*;

public class PolymorphismOverloadingTest {
   
	public static void main(String args[]){
	    
		int a = 100;
		int b= 200;
		double d = 200.5;
		
		PolymorphismOverloadingMeth pom = new PolymorphismOverloadingMeth();
		System.out.println(pom.addition());
		System.out.println(pom.addition(a, b));
		System.out.println(pom.addition(a, d));
	}	
}
