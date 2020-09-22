package java_001;

public class ThisCurrentConstructor {
	
 int sal;
 String name;
 ThisCurrentConstructor()
 {   this(19);
	 System.out.println(sal);
 }
 ThisCurrentConstructor(int sal){
	 //this.sal=sal;
	 System.out.println(sal);
	 }
 public static void main(String args [])
 {
	 ThisCurrentConstructor x=new ThisCurrentConstructor();
	 System.out.println("yuu");
	 
 }
}
