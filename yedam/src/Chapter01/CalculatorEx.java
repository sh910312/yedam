package Chapter01;

import java.util.Scanner;

class Calculator {

	int a;
	int b;

	Calculator() {
	}

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

//	public int ss(int a, int b) {
//		return a + b;
//	}
//
//	public int mm(int a, int b) {
//		return a - b;
//	}
//
//	public int gg(int a, int b) {
//		return a * b;
//	}
//
//	public int nn(int a, int b) {
//		return a / b;
//	}

}

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.println("첫번째 값");
		a = sc.nextInt();
		System.out.println("두번째 값");
		b = sc.nextInt();

		System.out.println("두수의 -값: " + (a + b));
		System.out.println("두수의 -값: " + (a - b));
		System.out.println("두수의 *값: " + a * b);
		System.out.println("두수의 /값: " + a / b);

//		System.out.println(cal.ss(10, 2));
//		System.out.println(cal.mm(10, 2));
//		System.out.println(cal.gg(10, 2));
//		System.out.println(cal.nn(10, 2));

	}

}
