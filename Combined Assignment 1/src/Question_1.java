import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double [] weight= new double[10];
		double sum=0;
		System.out.println("Enter weight: ");
		for(int i=0;i<10;i++)
		{
			weight[i]=c.nextDouble();
			sum+=weight[i];
		}
		System.out.println("The average weight is: "+sum/10);
	}

}
