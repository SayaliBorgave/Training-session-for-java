package statementprj;

public class Functionex {

	public static void main(String[] args) {
		//function demo
		System.out.println("hello");
		add();

	}
	public static void add() {
		int a=1;
		int b=2;
		int total=a+b;
		System.out.println("Add"+total);
	}
	public void sub() {//non static
		int a=1;
		int b=2;
		int total=a+b;
		System.out.println("sub"+total);
	}

}
