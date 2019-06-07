package yedamOracle.com;

public class NewJavaProgram {
	
	public static void main(String[] args) {
	
		int result, result2, num1, num2, num3;
		
			num1 = 10;
			num2 = 20;
			num3 = 0;
						
			result = num1 + (num2 * 3) + (30 / num1) - 10 ; 
			result2 = num1 % num2 ;
		
		
				System.out.println(result);
				System.out.println(result2);
				System.out.println(num3++); // num4 값이 0 이다.
				System.out.println(num3); // num4 값이 이전에 ++로  1이 들어가 있는 상태라서 1로 출력된다.
				System.out.println(++num3); // num4 앞에 ++ 을 붙이면 1 된 상태로 추가된다 그래서 출력값이 2이다
				
			result += 20;
		
				System.out.println(result);
		
		boolean bool1, bool2, bool3 ;
		
			bool1 = (1 > num1);
			bool2 = (1 < num1) && (10 < num2); // A 와 B 둘 모두 true 이면 결과는 true (AND연산)
			bool3 = (1 < num1) || (10 < num2); // A 와 B 둘중 하나라도 true 이면 true (OR연산)
			bool1 = !bool1; // 결과가 A가 true 면 false 반대로 A가 false 면 true (NOT연산)
		
		
				System.out.println(bool1);
				System.out.println(bool2);
				System.out.println(bool3);
				System.out.println(bool1);
		
		if (!bool1)
			System.out.println("result value true");
		
		else
			System.out.println("result value true");
		
		
		// bit operation (& | ^ ~ )
		
		
		int a = 3, b = 2;
		
		result = a & b;
		result2 = a | b;
		
		System.out.println(a + "&" + b + "=" + result );
		System.out.println(a + "&" + b + "=" + result2 );		
		
		
		
		
		
		
		
		
		
		
		}
	}