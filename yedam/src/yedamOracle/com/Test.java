package yedamOracle.com;

public class Test {

	public static void main(String[] args) {
		// 100이하의 2와 7의 배수를 구하라 p127
		int d = 1;
		while (d < 100) {
			if (d % 2 == 0 && d % 7 == 0) {
				System.out.println(d);
			}
			d++;
		}
		System.out.println();

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 7 == 0)
				System.out.println(i);
			sum = sum + 1;
		}
		System.out.println();
		
		// 다이아몬드 구하기

		for (int a = 0; a <=5; a++) {
			for (int b = 4; b > a; b--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a * 2 + 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print(" ");
			}
			for (int c = 7; c >= a * 2 + 1; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 1~10까지 합 구하기
		int i = 1;
		int b = 0;
		while (i <= 10) {
			b += i;
			i++;
		}
		System.out.println(b);
	

		
	}
		
}
