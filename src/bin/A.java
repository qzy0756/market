package bin;

public class A implements B {
int k = 20;
public static void main(String args[]) {
int i;
B c1 = new A();
i = c1.k;
System.out.println("i=" + i);
}
}
interface B {
int k = 10;
}

class c{
	private void a(){};
	private void a(int a ){};
	static {
		System.out.println(222);
	}
}
