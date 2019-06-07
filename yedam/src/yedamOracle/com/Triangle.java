package yedamOracle.com;

public class Triangle {
	//생성자는 클래스랑 똑같은 이름으로 써줘야함
	double height;
	double width;
	
	Triangle (){
	}
	
	Triangle(double a, double b){ //초기값
		height = a;
		width = b;
	}
		
	//메소드 오버로딩/오버라이딩
	double getArea() {
		
		if(height!=0 && width !=0)
			return height*width/2;
		else
			return 0.0;
	}
	double getArea(double a) {
		return a*a/2;
	}
	
	double getArea(double a, double b) {
		return a*b/2;
	}
		
}