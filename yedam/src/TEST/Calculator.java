package TEST;

public class Calculator {

	static double PI = 3.14; // static 필드
	String color; // 인스턴스 필드

	// 인스턴스 메소드↓↓
	void setColor(String color) {
		this.color = color;
	}

	// static 메소드↓↓
	static double plus(double x, double y) {
		return (int) x + (int) y;
	}

	static int minus(double x, double y) {
		return (int) x - (int) y;
	}

	static double gg(double x, double y, double i) {
		return (int)x * (int)y * (int)i;
	}

	static double nn(double x, double y) {
		return x / y;
	}

	static double execute(double x, double y, String z) {

		int i = 1;
		if (z == "+") {
			System.out.println(plus(x, y));
			return plus(x, y);
		} else if (z == "-") {
			System.out.println(minus(x, y));
			return minus(x, y);
		} else if (z == "*") {
			System.out.println(gg(x, y, i));
			return gg(x, y, i);
		} else if (z == "/") {
			System.out.println(nn(x, y));
			return nn(x, y);
		} else {

		}

		return 0;
	}
}
