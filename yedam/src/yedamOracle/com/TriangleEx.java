package yedamOracle.com;

public class TriangleEx {

	public static void main(String[] args) {
		
		Triangle tr = new Triangle(4,5);
		System.out.println(tr.getArea());
		System.out.println(tr.getArea(5));
		double result = tr.getArea(8,4);
		System.out.println(result);
		

				
	}

	
}
