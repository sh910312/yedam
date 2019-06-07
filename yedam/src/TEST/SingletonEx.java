package TEST;

public class SingletonEx {

	public static void main(String[] args) {
		
	
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);
		
		sing1.setNum(30);
		System.out.println(sing1.getNum());
		System.out.println(sing2.getNum());
		
		
		args = new String[] {"str1","str2","str3"};
		System.out.println(num1 == num2);
		

	}

}
