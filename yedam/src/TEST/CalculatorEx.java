package TEST;

public class CalculatorEx {

	public static void main(String[] args) {
		/*
		 * double result1 = Calculator.minus(30, 20); // 정적메소드(static)
		 * System.out.println("- 결과값 : " + result1);
		 * 
		 * result1 = Calculator.plus(30, 20); System.out.println("+ 결과값 : " + result1);
		 * 
		 * result1 = Calculator.gg(3, 3, 7); System.out.println("* 결과값 : " + result1);
		 * 
		 * result1 = Calculator.nn(20, 20); System.out.println("/ 결과값 : " + result1);
		 * 
		 * result1 = Calculator.execute(14, 28, "/"); System.out.println(" 결과값 : " +
		 * result1);
		 * 
		 * System.out.println(Calculator.PI);
		 */
		int sum = getArgs(1, 2, 3, 4, 5); // 합
		int hor = getAArgs(1, 2, 3, 4, 5); // 홀수
		int jja = getAAArgs(1, 2, 3, 4, 5); // 짝수

		//인스턴스는 각각 만들어야할경우에 사용하면 좋다 // 각 각 다른 값이 적용될때 학교 = 반1, 반2 이런식)
		//static는 반대
		
		System.out.println("합 : " + sum);
		System.out.println("홀수: " + hor);
		System.out.println("짝수: " + jja);
	}

	static int getArgs(int... values) {
		int sum = 0; // 합 초기값
		for (int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}

	static int getAArgs(int... values) {
		int hor = 0; // 홀수 초기값
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 1) { // 홀수
				hor = hor + values[i];  
			}
		}
		return hor;
	}

	static int getAAArgs(int... values) {
		int jja = 0; // 짝수 초기값
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) { // 짝수
				jja = jja + values[i];
			}
		}
		return jja;
	}
}
/*
 * if (i % 2 == 0)<<짝수 {  j += i; } else (i % 2 == 1)<<홀수 { h += i; }
 */
