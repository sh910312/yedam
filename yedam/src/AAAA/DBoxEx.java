package AAAA;

class DBox<L, R> {

	private L left;
	private R right;

	public void set(L l, R r) {

		left = l;
		right = r;

	}

	public String toString() {
		return left + "&" + right;
	}

}

class DDBox<U, D> {
	private U up;
	private D down;

	public void set(U u, D d) {

		up = u;
		down = d;

	}

	public String toString() {
		return up + "& " + down;
	}

}

public class DBoxEx {

	public static void main(String[] args) {

		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple ", 25);
		
		DDBox<String, Integer> box2 = new DDBox<>();
		box2.set("Orange ", 33);
		
		
		DDBox<DBox<String, Integer>, DDBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);
		System.out.println(ddbox);


		
	}

}
