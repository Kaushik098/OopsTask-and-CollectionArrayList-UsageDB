package CalculateMarks;

import java.util.*;

public class StudentA  extends Marks{

	Scanner sc = new Scanner (System.in);

	public float getPercentage() {
		System.out.println("Enter the Student A Marks Details:");
		int A_mark1 = sc.nextInt();
		int A_mark2 = sc.nextInt();
		int A_mark3 = sc.nextInt();
		float sum = A_mark1+ A_mark2+ A_mark3;
		float percentage = (sum/300)*(100);
        return percentage;
	}
}
