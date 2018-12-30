package CalculateMarks;

import java.util.*;

public class MarksTest {
       
	public static void main(String args[]){
		StudentA student_a = new StudentA();
		student_a.getPercentage();
        System.out.println("The percentage marks obtained by student A is :"+ student_a);

		StudentB student_b = new StudentB();
		student_b.getPercentage();
        System.out.println("The percentage marks obtained by student B is :"+ student_b);

	}
}
