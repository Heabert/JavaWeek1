package Chapter3;

import java.util.Scanner;

public class bodyMassIndex {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter you weight in pounds");
		int weight=input.nextInt();
		
		System.out.println("Enter your height");
		int height=input.nextInt();

		final double HGTMET =0.305;
		final double LBSTOKGS =  1 * 0.453592;
		final double BMI = 18.5;
		
		if(BMI < 18.5)
		{System.out.println("Underweight");
		}
		else if (BMI >= 18.5 && BMI < 16) {
            System.out.print("Normal");
		
		
		
	}

}
}

