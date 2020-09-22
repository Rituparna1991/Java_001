package java_001;

public class ThisMtd {
 void m()
 {
	 System.out.println("m");
 }
 void n() {
	 this.m();
	 System.out.println("m in n");
 }
 
 
 public static void main(String [] args)
 {
	 ThisMtd t= new ThisMtd();
	 t.n();
 }
}
