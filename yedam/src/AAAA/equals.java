package AAAA;


class Point {

	int xPos;
	int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.xPos == ((Point) obj).xPos && this.yPos == ((Point) obj).yPos)
			return true;
		else
			return false;

	}

}

class Rectangle {

	private Point upperLeft; // 좌측 상단 좌표
	private Point lowerRight; // 우측 하단 좌표

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this.upperLeft.xPos == ((Rectangle) obj).upperLeft.xPos && this.lowerRight.yPos == ((Rectangle) obj).lowerRight.yPos && this.upperLeft.xPos == ((Rectangle) obj).upperLeft.yPos)
			return true;
		else
			return false;

	}

}

public class equals {

	public static void main(String[] agrs) {

		Point xx = new Point(10, 20);
		Point xxx = new Point(10, 30);
		Point yy = new Point(10, 20);

		Rectangle up = new Rectangle(10, 20, 30, 40);
		Rectangle uup = new Rectangle(20, 30, 40, 50);
		Rectangle lower = new Rectangle(10, 20, 20, 40);

		if (xx.equals(xxx)) // xx랑 xxx 비교
			System.out.println("xx, yy 동일");
		else
			System.out.println("xx, yy 다름");

		if (xx.equals(yy)) // xx랑 yy랑 비교
			System.out.println("xx, yy 동일");
		else
			System.out.println("xx, yy 다름");

		if (up.equals(uup)) // up랑 uup 비교
			System.out.println("upperLeft, lowerRight 동일");
		else
			System.out.println("upperLeft, lowerRight 다름");

		if (up.equals(lower)) // up 이랑 lower 비교
			System.out.println("upperLeft, lowerRight 동일");
		else
			System.out.println("upperLeft, lowerRight 다름");

	}

}