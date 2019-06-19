package AAAA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	int ssno;
	String name;
	int age;

	Person(String name, int age, int ssno) {
		super();
		this.name = name;
		this.age = age;
		this.ssno = ssno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSsno() {
		return ssno;
	}

	public void setSsno(int ssno) {
		this.ssno = ssno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
//		return this.name.equals(person.name) && this.age == person.age;  1번 방법
		boolean b1 = this.name.equals(person.name);						// 2번 방법
		boolean b3 = this.ssno == person.ssno;						// 2번 방법
		boolean b2 = this.age == person.age;							// 2번 방법 
		return b1 && b2 && b3;											// 2번 방법
	}

	@Override
	public int hashCode() {
		
		return name.hashCode()+ssno+age;
		// name.hashcode + 22;
		// name.hashcode + 23;
	}

	
	
	
	
}

public class HashSetEx {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<Person>();
		set.add(new Person("김", 33,970911));
		set.add(new Person("강", 22,991777));
		set.add(new Person("강", 23,956407));
		set.add(new Person("최", 11,874107));
		
		Iterator<Person> itr = set.iterator(); // Iterator 반복자라는 것을 반환한다.
		
		while (itr.hasNext()) {
			Person p = itr.next();
			System.out.print("이름: "+p.getName()+"\t나이:"+p.getAge()+"\t 주민앞번호: "+p.getSsno()+ "\n");
		
		
		}

		
		
		
		
		
		
		
		
		
		
		/*
		 * Set<String> set = new HashSet<String>(); {
		 * 
		 * 
		 * set.add("1"); set.add("2"); set.add("3"); set.add("4"); set.add("5");
		 * 
		 * int size = set.size(); // size = 중복글씨 뺀 갯수 출력 (ex 1,1,2,3 햇을시 3으로 나옴)
		 * System.out.println(size); System.out.println(set); // set = set의 모든값 출력
		 * 
		 * Iterator<String> itr = set.iterator(); while (itr.hasNext()) { String str =
		 * itr.next(); System.out.println(str); }
		 * 
		 * }
		 */
	}

}
