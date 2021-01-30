package methodPackage;
import java.util.Scanner;

public class Methods {
	//Can't use System.out.println without method
	//Can have variables without method (global variables)
	//Can have Scanner object without method
	//int a, b;
	//Scope matters
	
	//Creates input(object)
	Scanner input = new Scanner(System.in);
	
	
	public void prompt() {
		float a, b;
		System.out.println("Enter first number: ");
		a = input.nextFloat();
		System.out.println("Enter second number");
		b = input.nextFloat();
		method0(a, b);
	}
	
	public void method0(float a, float b) {
		System.out.println("Result of a + b = " + sum(a, b));
		System.out.println("Result of a - b = " + subtract(a, b));
		System.out.println("Result of a * b = " + multiplication(a, b));
		System.out.println("Result of a / b = " + division(a, b));
		System.out.println("Result of a % b = " + modulus(a, b));
	}
	
	//private can't be used in different classes or files
	//but can be used by methods inside the class
	private float sum(float a, float b) {
		return a + b;
	}
	private float subtract(float a, float b) {
		return a - b;
	}
	private float multiplication(float a, float b) {
		return a * b;
	}
	private float division(float a, float b) {
		return a / b;
	}
	private int modulus(float a, float b) {
		//this is similar or the same as reinterpret_cast<int> for C++
		return (int) (a % b);
	}
}

//Can't create two classes in the same file
/*public class Methods0 {
	
}*/
