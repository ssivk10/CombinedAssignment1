import java.util.Scanner;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int, long, string and a bool value");
		int x=sc.nextInt();
		long y=sc.nextLong();
		String s = sc.next();
		boolean c = sc.nextBoolean();
		Product p = new Product(x,y,s,c);
		System.out.println("The instance variables are: ");
		System.out.println(p.x+" "+p.y+" "+p.s+" "+p.c);
	}

}

class Product{
	int x;
	long y;
	String s;
	boolean c;
	Product(int x, long y, String s, boolean c)
	{
		this.x=x;
		this.y=y;
		this.s=s;
		this.c=c;
	}
}
