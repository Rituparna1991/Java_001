package java_001;

public class ConstructorReuse {
	
	int id;
	String name;
	int sal;
	String place;
	
	ConstructorReuse(int i,String n,int j){
		id=i;
		name=n;
		sal=j;
	}
	ConstructorReuse(int i,String n,int j,String p)
	{
		this(i,n,j);
		place=p;
    }
	
	void display()
	{
		System.out.println(id+name+sal+place);
	}
	
  public static void main(String args[])
  {
	  ConstructorReuse c=new ConstructorReuse(10,"Ritu",100000,"ODS");
	  c.display();
  }

}
