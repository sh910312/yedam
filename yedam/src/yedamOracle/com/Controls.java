package yedamOracle.com;

public class Controls {

	public static void main(String[] args) {
		
		boolean bool = false;

		int num1 = 10, num2 = 20 ;
			
			bool = (num1 < num2 );
		
				System.out.println(bool);
					
			bool = (num1 > 0 && num1 < 10);
			
		
		if (bool)
			
				System.out.println("true");
		
		else
				System.out.println("false");
		
		// 처음 true인 경우에만 사용
		
		if (num1 > 0)
			
			System.out.println("0초과");
		
		else if (num1 > 5)
		
			System.out.println("5초과");
		
		else if (num1 > 10)
		
			System.out.println("10초과");
		
		else
		
			System.out.println("else");
		
		
		if (num1 > 0 ) 
		{
				
			if (num1 % 2 == 0)
			{
				System.out.println("2의배수");
			} 
			
			else 
			{
				System.out.println("2배수 아님");
			} 
			
		} 
			else
			{
				System.out.println("양수아님");
			}
		
	
	
	
	
	
	
	}
		
		
}
