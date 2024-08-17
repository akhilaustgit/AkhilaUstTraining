package Programs.Day1;


public class Fabinocci {
	
	public static void main(String[] args) {
		
	int a1=0, a2=1;
	
	System.out.println(a1);
	System.out.println(a2);
	
	for(int i=2;i<=10;i++)
	{
		int a3=a1+a2;
		System.out.println(a3);
		a1=a2;
		a2=a3;
	}
	}
	
	


}
