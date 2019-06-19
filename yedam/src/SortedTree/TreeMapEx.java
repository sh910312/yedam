package SortedTree;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<>();

		scores.put(new Integer("87"), "홍길동");
		scores.put(new Integer("98"), "이동수");
		scores.put(new Integer("75"), "박길순");
		scores.put(new Integer("95"), "자바김");
		scores.put(new Integer("80"), "스프링");

		NavigableSet<Integer> nset = scores.descendingKeySet();
		System.out.println("[nset] = > " + nset);
		Iterator<Integer> itr = nset.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i + "-" + scores.get(i));
		}
		//decendingMap () NavigableSet 신규생성
		NavigableMap<Integer, String> navSet = scores.descendingMap();
		Set<Map.Entry<Integer, String>> navEntry = navSet.entrySet();
		for(Map.Entry<Integer, String> map : navEntry) {
			System.out.println(map.getKey()+ "-"+map.getValue());
		}
	}

}
