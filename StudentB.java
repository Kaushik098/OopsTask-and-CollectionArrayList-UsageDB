package CalculateMarks;

import java.util.*;

public class StudentB extends Marks{

	Scanner sc  = new Scanner (System.in);
	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Student B Marks Details:");

		int B_mark1 = sc.nextInt();
		int B_mark2 = sc.nextInt();
		int B_mark3 = sc.nextInt();
		int B_mark4 = sc.nextInt();
		float sum = B_mark1+ B_mark2+ B_mark3;
		float percentage = (sum/400)*(100);
        return percentage;
	}

	

}
