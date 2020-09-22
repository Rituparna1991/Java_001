package java_001;

class Add{
	int a,b,c,d;
	/*Add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Add(int a,int b,int c)
	{
		this(a,b);
		this.c=c;
	}*/
	int adder(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	int adder(int a,int b,int c)
	{
		System.out.println(a+b+c);
		return a+b+c;
	}
}
public class MethodOverloading {
	
	public static void main (String [] args)
	{
		Add a=new Add();
		a.adder(10,20);
	}

}
