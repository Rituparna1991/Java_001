package java_001;

class UpcatingParent{
	
	void printname()
	{
		System.out.println("class name is UpcatingParent ");
	}

}

public class Upcasting extends UpcatingParent {
	void printname()
	{
		System.out.println("class name is Upcasting");
	}
	
	public static void main (String [] args)
	{
		UpcatingParent p=new Upcasting();
		p.printname();
	}

}
