package java_001;

class Animal{
	void sound()
	{
		System.out.println("animals make sound");
	}
}
class Dog extends Animal{
	void sound()
	{
		System.out.println("dogs bark");
	}
}
public class Methodoverriding extends Animal{
	public static void main (String [] args)
	{
		Dog d=new Dog();
		d.sound();
	}
	

}
