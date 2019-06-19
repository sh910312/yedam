package AAAA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		//Map<String, Person> mab1 = new HashMap<String, Person>();
		
		map.put("홍길동", 50);
		map.put("김길동", 60);
		map.put("이길동", 60);
		map.put("홍길동", 60);
		
		
		System.out.println("총 Entry 수 : " + map.size()); // 중복값 제외
		System.out.println("홍길동의 점수 : " + map.get("이길동")); // 홍길동
		Set<String> set = map.keySet(); // set 선언
		System.out.println(set); // 중복값 뺀 나머지

		Iterator<String> itr = set.iterator(); // Iterator 반복자

		while (itr.hasNext()) {
			String key = itr.next();
			map.get(key);

			System.out.println("key값 : " + key + "\t→→→   " + map.get(key));
			// System.out.println(itr.next());

		}

	}

}

/*
 * package AAAA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class Person {
	
	String ssno;
	String name;

	Person(String ssno, String name){
		this.ssno = ssno;
		this.name = name;
	}
}

public class HashMapEx {

	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>();

		Map<String, Person> map1 = new HashMap<String, Person>();
		
		map1.put("111", new Person("111", "김"));
		map1.put("222", new Person("222", "수"));
		map1.put("333", new Person("333", "호"));
		
		
		System.out.println("총 Entry 수 : " + map1.size()); // 중복값 제외
		System.out.println("홍길동의 점수 : " + map1.get("김")); // 홍길동
		Set<String> set = map1.keySet(); // set 선언
		System.out.println(set); // 중복값 뺀 나머지

		Iterator<String> itr = set.iterator(); // Iterator 반복자

		while (itr.hasNext()) {
			String key = itr.next();
			map1.get(key);

			System.out.println("key값 : " + key + "\t→→→   " + map1.get(key));
			// System.out.println(itr.next());

		}

	}

}
*/
