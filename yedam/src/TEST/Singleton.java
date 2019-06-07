package TEST;

public class Singleton {
	//static 객체 생성
	private static int num;
	private static Singleton singleton = new Singleton(); // private 는 이 클래스에서만 사용가능
	private Singleton() {
	}
	static Singleton getInstance() {
		return singleton;
	}
	void getNum(int a) {
		this.num = a;
	}
	int gteNum() {
		return num;
	}
}
