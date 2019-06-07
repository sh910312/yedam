package yedamOracle.com;

public class Rec {
	
	double height;
	double width;
		
	Rec () {// 생성자는클래스 이름과 똑같아야함
		}
	
	Rec(double a, double b) { 
		height = a; // double a,b의 초기값 
		width = b; // 
	}
		
	void getArea() {
		System.out.println("넓이는 " + height*width/2);
	}
	
	double getArea(double a) {
		return a*a/2;
	}
	double getArea(double a, double b) {
		return a*b/2;
	}
	
}
