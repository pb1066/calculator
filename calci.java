package calci;

public class calci {
	public static void main(String[] args) { 
		double c;
		c=division(1,0);
		System.out.println(c);
	}
	public static double add(double a , double b) {
		return a+b;	
	}
	public static double multiplication(double a , double b) {
		return a*b;	
	}
	public static double division(double a , double b) {
		if(b==0) {
			throw new IllegalArgumentException("Can't divide with Zero");
		}
		else {
		return a/b;	
	
		}
	}
}

