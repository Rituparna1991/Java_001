package java_001;

public class Constructor {
	int id;
	String name;
	int age;
	
	Constructor(int i,String n)
	{
		id=i;
		name=n;
	}
	Constructor(int i,int j)
	{
		id=i;
		age=j;
	}
	Constructor(int i,int j,String n){
		id=i;
		age=j;
		name=n;
	}
	public void display()
	{
		System.out.println(id+"---"+name+"---"+age);
	}
	
	public static void main(String [] args) {
		Constructor c1=new Constructor(11,101,"Ritu");
		Constructor c2=new Constructor(12,201);
		c1.display();
		c2.display();
	
	}

}

