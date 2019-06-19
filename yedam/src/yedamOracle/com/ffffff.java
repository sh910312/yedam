package yedamOracle.com;

import java.util.Scanner;

public class ffffff {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" 첫번째 원하는 구구단을 입력 ");
		int a = sc.nextInt();
		System.out.println(" 두번째 원하는 구구단을 입력 ");
		int b = sc.nextInt();

		gugu(a, b);

	}

	public static void gugu(int a) {

		System.out.println(a + " * " + b + " = " + a * b + "    ");

	}

	public static void gugu(int a, int b) {

		gugu(a);

		gugu(b);

	}

}
