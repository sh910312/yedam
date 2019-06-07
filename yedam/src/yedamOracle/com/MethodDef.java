package yedamOracle.com;

public class MethodDef {

	public static void main(String[] args) {
		
		System.out.println("프로그램시작");
		
		
		hiEveryOne(20);
		hiEveryOne(40, 167.4);
		goodbye();
		int score = sumScore(50, 60, 70);
		double avg = avgScore(50, 65);
		System.out.println("Score:" + avg);
		goodbye();
		System.out.println("프로그램종료");
		
		

	}

	
	public static double avgScore(int a, int b) {
		
		return ((double)a + (double)b) / 2;
				
	}
	
	
	public static int sumScore(int m, int e, int k) {
		
		return(m+e+k);
				
	}

	
	public static void hiEveryOne(int age) {
		
		System.out.println("Hello, erryone");
		System.out.println("I am " + age + " old.");
		
		
	}
	public static void hiEveryOne(int age, double height) {
		
		System.out.println("Hello, erryone");
		System.out.println("I am " + age + " old.");
		System.out.println("I am " + height + " com. ");
		
	}
	
	public static void goodbye() {
		
		System.out.println("Bye");
		
	}
	
	
}
