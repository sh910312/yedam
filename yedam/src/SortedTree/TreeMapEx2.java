package SortedTree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<>();

		scores.put(new Integer("87"), "홍길동");
		scores.put(new Integer("98"), "이동수");
		scores.put(new Integer("75"), "박길순");
		scores.put(new Integer("95"), "자바김");
		scores.put(new Integer("80"), "스프링");

		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.lastEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.lowerEntry(new Integer(85)); // ()아래 점수
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.higherEntry(new Integer(85)); // ()보다 높은 점수
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.floorEntry(new Integer(85)); // ()이거나 아래 점수
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.ceilingEntry(new Integer(85)); // ()이거나 위 점수
		System.out.println(entry.getKey() + " - " + entry.getValue());

		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry + " 남은객체 수 : "+scores.size()+")");
		}
		
		
	}

}
