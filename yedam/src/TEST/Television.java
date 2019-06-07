package TEST;

public class Television {
	static String company ="Google";
	static String browser ="Chrome";
	static String info;
	static {
		//초기값이 복잡한 계산식을 필요로 할때
		info = company + "-" + browser;
	}
	
}
