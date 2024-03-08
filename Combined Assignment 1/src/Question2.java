
public class Question2 {

	public static void main(String[] args) {
		int x=10;
		if(x<15)
		{
			int y=5;
			System.out.println("Inside block: x = "+x+" y = "+y);
		}
		System.out.println("Outside block: x = "+x+" y = "+y);
	}
	//Compiler throws the error:
	//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//y cannot be resolved to a variable

}
