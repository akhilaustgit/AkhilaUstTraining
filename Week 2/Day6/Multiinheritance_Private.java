package Programs.Day6;

class A1{
	private int i;

	A1(int i)
	{
		this.i/* data member*/ = i/*parameter*/;
		System.out.println("A(int i)");
	}
	
	public void show()
	{
		System.out.println("Value of A.i is:"+i);
	}
}

class B1 extends A1{
	private int j;
	
	public B1(int p,int j)
	{
		super(p); //shud be first statment in cosntructor
		this.j = j; 
		System.out.println("B(int i,int j)");
	}
	public void show()
	{
		super.show();
		System.out.println("Value of B.j is:"+j);
	}
}

class C1 extends B1{
	private int k;
	
	public C1(int i,int j,int k)
	{
		super(i,j);
		this.k = k;
		System.out.println("C(int i,int j,int k)");
	}
	
	public void show()
	{
		
		System.out.println("Value of C.k is:"+k);
		super.show();
	}
}

class D1 extends C1{
	private float m;
	public D1(int i,int j,int k, float m)
	{
		super(i,j,k);
		this.m = m;
		System.out.println("D(int i,int j,int k,float m)");
	}
	
	public void show()
	{
		
		System.out.println("Value of D.m is:"+m);
		super.show();
	}
}

public class Multiinheritance_Private {

	public static void main(String[] args) {
		D1 obj = new D1(10,20,30,12.4f);
		obj.show();
	}

}
