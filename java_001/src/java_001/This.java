package java_001;

public class This {
	
	int roll;
	String name;
	float fee;
	
	This(int roll,String name,float fee)
	{
		this.roll=roll;
		this.name=name;
		this.fee=fee;
	}
	
	void display()
	{
		System.out.println(roll+"---"+name+"---"+fee);
	}
	
	 public static void main (String args [])
	 {
		This t=new This(10,"Ritu",100f);
		t.display();
	 }

}
