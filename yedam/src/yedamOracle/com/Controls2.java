package yedamOracle.com;

public class Controls2 {

	public static void main(String[] args) {

		int num = 1;
		
		while (num < 10) 
		
		{
			System.out.println("num is " + num);
			num++;
		}
			
			num = 10;
		
		do 
		{	
			System.out.println("number is " +num);
			num++;
		}
		
		while (num <= 5);
		
		
			num =1;
		do
		{
			System.out.println("2 * " + num + " = " + (2 * num));
			num++;
		}
		
		while (num <= 9);
			
		
			num = 1 ;
			
		do {
			System.out.println(num);
			num++;
		}
		while (num <= 10);
		
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = " +i);
			
		}
		
		
		
		for ( int i = 1; i <= 10; i++) {
			System.out.println("5 * " + i+ " = " + i*5);
	}
		
		
	
		
		
		
		for ( int a = 0; a <= 10; a++) {
			
			for (int b = 0; b <= 5; b++) {
			
				System.out.print("a, b => " + a + ", " + b+"\t");
			}
			
			System.out.println("5 * " + a+ " = " + a*5);
	}
		
		System.out.println();
		
		for (int a = 1; a <= 2; a++) {
			System.out.println("2 * " + a + " = " + a*2);
			
			for (int b = 1; b <= 4; b++)
				System.out.println("4 * " + b + " = " + b*4);
			
				for (int c = 1; c <= 6; c++)
					System.out.println("6 * " + c + " = " + c*6);				
				
					for (int d = 1; d <= 8; d++)
						System.out.println("8 * " + d + " = " + d*8);
						
		}
			
			
		
		
		
		System.out.println();
		
		for (int a = 2; a < 10; a++) {
			for (int b = 1; b < 10; b++)
				System.out.println(a + " x " + b + " = " + a*b);
				
		}
		
		
		System.out.println();
		
		
		for (int a = 2; a <=8; a+=2) {
			
			for(int b = 1; b <= a; b++) {
				
				System.out.println(a + " x " + b + " = " + a*b);
			}
		}
		
		System.out.println();
		
		for (int a = 1; a < 10; a+=2) {
			for (int b =1; b <= a; b++) {
				System.out.println(a + " x " + b + " = " + a*b);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
