import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		BmiDetails [] bmi = new BmiDetails[n];
		String name;
		float weight;
		float height;
		float bmiCalc;
		
		//System.out.println("Enter name and weight in kg and height in cm: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name: ");
			sc.nextLine();
			name=sc.nextLine();
			System.out.println("Enter weight in kg : ");
			weight=sc.nextFloat();
			System.out.println("Enter height in cm: ");
			height=sc.nextFloat();
			bmiCalc=(float)(weight/Math.pow(height,2))*10000;
			bmi[i]=new BmiDetails(name, weight, height, bmiCalc);
		}
		Arrays.sort(bmi);
		System.out.println("Name | BMI | Result");
		for(int i=0;i<n;i++)
		{
			System.out.println(bmi[i].name+"|"+bmi[i].bmi+"|"+bmi[i].result);
		}
	}

}

class BmiDetails implements Comparable <BmiDetails>{
	String name;
	float weight;
	float height;
	float bmi;
	String result;
	public BmiDetails(String name, float weight, float height, float bmi) {
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.bmi=bmi;
		if(bmi<18.5)
			this.result="Underweight";
		else if(this.bmi>=18.5 && this.bmi<=24.9)
			this.result="Healthy Weight";
		else if(this.bmi>=25.0 && this.bmi<=29.9)
			this.result="Overweight";
		else if(this.bmi>=30.0)
			this.result="Obese";
	}
	 @Override public int compareTo(BmiDetails o)
	{
		if(this.bmi<o.bmi)
			return 1;
		else if(this.bmi>o.bmi)
			return -1;
		else
			return 0;
	}
	 
}
