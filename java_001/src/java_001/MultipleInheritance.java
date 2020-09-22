package java_001;


class Companies{
	void compname()
	{
		System.out.println("company name is Oracle");
	}
}
class State extends Companies
{
	void stateName()
	{
		System.out.println("state name is Karnataka");
	}
}
class Emploies extends State
{
	void employeeName()
	{
		System.out.println("empoyee name is Ritu");
	}
}
class Manager extends Companies
{
	void managerName()
	{
		System.out.println("Manager is X");
	}
}

public class MultipleInheritance {
	
	public static void main(String [] args )
	{
		Emploies e=new Emploies();
		e.compname();
		e.employeeName();
		e.stateName();
		Manager m=new Manager();
		m.compname();
		m.managerName();
		
		
	}

}
