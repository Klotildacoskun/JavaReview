package iQJava;
class parent {
	static void m1() {
		System.out.println("parent m1");
	}
}
public class IQ_24StaticMethod extends parent{
	static void m1() {
		System.out.println("child m1");
	}

	public static void main(String[] args) {
		parent p= new IQ_24StaticMethod();
		p.m1();
	}

}
