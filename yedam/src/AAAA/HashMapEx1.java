package AAAA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class SSSS {

	String ssno;
	String name;

	SSSS(String ssno, String name) {
		this.ssno = ssno;
		this.name = name;
	}

	public String getSsno() {
		return ssno;
	}

	public void setSsno(String ssno) {
		this.ssno = ssno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		SSSS ss = (SSSS) obj;
		boolean b1 = this.name.equals(ss.name);						
		boolean b2 = this.ssno == ss.ssno;						
		return b1 && b2;
	}

	@Override
	public int hashCode() {

		return name.hashCode()+ssno.hashCode();
	}

}

public class HashMapEx1 {

	public static void main(String[] args) {

		Map<SSSS, String> map = new HashMap<SSSS, String>();

		map.put(new SSSS("111", "김"), "hello");
		map.put(new SSSS("111", "김"), "nice");
		map.put(new SSSS("333", "호"), "good");

		Set<SSSS> set = map.keySet();
//		System.out.println(map.get(set));

		Iterator<SSSS> itr = set.iterator();

		while (itr.hasNext()) {
			SSSS key = itr.next();

			System.out.println(map.get(key));

		}

	}

}
