package Programs.Day2;

public class Factorial {
	
public static void main(String[] args) {
		
		System.out.println(factorial(5));
		
	}
	
	static int factorial(int n) {
		int f=n;
		while(n>1) {
			f = f*(n-1);
			n--;
		}
		return f;
	}
	


}
