package TEST;

import AAAA.CarEEx;

class Product<T, M> {

	T kind;
	M model;

	void setKind(T kind) {
		this.kind = kind;
	}

	T getKind() {
		return kind;
	}

	void setModel(M model) {
		this.model = model;
	}

	M getModel() {
		return model;
	}

}


class Car {
	
	
}

public class MultiGeneric {

	public static void main(String[] args) {
		Product<Integer, String> p1 = new Product<Integer, String>();
		p1.setKind(10);
		p1.setModel("model");
		Integer i1 = p1.getKind();
		String s1 = p1.getModel();
		System.out.println(i1 + "," + s1);

		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("BMW");
		Car i2 = p2.getKind();
		String s2 = p2.getModel();
		System.out.println(i2 + "," + s2);

	}

}
