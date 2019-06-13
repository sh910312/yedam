package TEST;


class Pairs<K, V> {

	private K key;
	private V value;

	public Pairs(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

class Utils {

	public static <K, V> boolean compare(Pairs<K, V> p1, Pairs<K, V> p2) {

		boolean b1 = p1.getKey().equals(p2.getKey());
		boolean b2 = p1.getValue().equals(p2.getValue());

		return b1 && b2;

	}
	public static <T extends Number> int compare (T t1, T t2) {
		
		double v1 = t1.doubleValue();		
		double v2 = t2.doubleValue();		
		
		return Double.compare(v1, v2); // v1, v2 비교 해서 작을때-1, 같을때 0, 클때1
	
	}
	
}

public class BoxM {
	public static void main(String[] args) {

		double result = Utils.compare(10.0, 10.0);
		System.out.println((int)result);
		
	
		
		
		
		
		
		
//		Pairs<Integer, String> p1 = new Pairs<Integer, String>(1, "aa");
//		Pairs<Integer, String> p2 = new Pairs<Integer, String>(1, "aa");
//
//		boolean result = Utils.compare(p1, p2);
//
//		if (result)
// 			System.out.println("동일객체");
//		else
// 			System.out.println("동일객체아님");

		
		
		
	}

}
