package TEST;

class Const {
	String name;
	String age;
	String str;

	Const(String name, String age, String str) {
		this.name = name;
		this.age = age;
		this.str = str;
	}
}

class Inum {
	private int num;
	private int age;
	private String str;

	public Inum(int num, int age, String str) {
		this.num = num;
		this.age = age;
		this.str = str;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.num == ((Inum) obj).num && this.age == ((Inum) obj).age && this.str == ((Inum) obj).str)
			return true;
		else
			return false;

	}
}

public class ObjectEx {
	public static void main(String[] args) {

		Inum num1 = new Inum(10, 40,"30");
		Inum num2 = new Inum(20, 20,"20");
		Inum num3 = new Inum(10, 50,"30");
		Inum num4 = new Inum(10, 20,"0");
		Inum num5 = new Inum(10, 40,"30");
		
		if (num1.equals(num1))
			System.out.println("num1, num1 동일");
		else
			System.out.println("num1, num1 다름");
		
		if (num1.equals(num2))
			System.out.println("num1, num2 동일");
		else
			System.out.println("num1, num2 다름");

		if (num1.equals(num3))
			System.out.println("num1, num3 동일");
		else
			System.out.println("num1, num3 다름");
		
		if (num1.equals(num4))
			System.out.println("num1, num4 동일");
		else
			System.out.println("num1, num4 다름");

		if (num1.equals(num5))
			System.out.println("num1, num5 동일");
		else
			System.out.println("num1, num5 다름");

	}

}
