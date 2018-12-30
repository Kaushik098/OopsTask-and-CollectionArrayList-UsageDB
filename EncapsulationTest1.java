package encapsulationConcept;

public class EncapsulationTest1 {

	public static void main(String args[]){
	    
		EncapsulationEx1 encap = new EncapsulationEx1();
		
		encap.setMark1(80);
		encap.setMark2(89);
		encap.setMark3(90);
		
		encap.setS_name1("Amir Khan");
		encap.setCh('A');
		
		
		int total = encap.getMark1()+ encap.getMark2() + encap.getMark3();
		System.out.println("Total :"+ total );
		System.out.println("Average :"+ (total/3));
	
		System.out.print( encap.getS_name1()+" total grade is:"+ encap.getCh());
		
	}
}
