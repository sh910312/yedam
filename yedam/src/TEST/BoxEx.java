package TEST;
/*
class Pairx<L, R> {
	private L left;
	private R right;
	
	public void set (L l, R r) {
		left = l;
		right = r;
	}
	public String toString() {
		
		return left +":" + right; 
	}
	
}
*/

class Pair <S, H> {
	
	private S su;
	private H ho;

	public void set(S s, H h) {

		su = s;
		ho = h;

	}

	public String toString() {
		return su+":"+ho;
	}

}


public class BoxEx {
	
	public static void main(String[] agrs) {

		Pair<String, String> pair = new Pair<>();
		pair.set("String", "String");
				
		
		Pair<String, Integer> pair2 = new Pair<>();
		pair2.set("String", 3333);		
		
		//Pair<Pair<String, String>, Pairx<String, Integer>> ppair = new Pair<>();
		//ppair.set(pair, pair2);
		
		System.out.println(pair);
		System.out.println(pair2);
		

	
}
}