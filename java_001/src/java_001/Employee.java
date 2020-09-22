package java_001;


 class Region extends Company{
	static String state="BLORE";
	void getstateName()
	{
		System.out.println("state");
	}
}
 
public class Employee  extends Region
{
	String empname="Ritu";
	void getName() {
		System.out.println(empname);
	}
	
	public static void main (String [] args) {
		Company c=new Company();
		Employee e=new Employee();
		e.getName();
		System.out.println(state);
	}

}
