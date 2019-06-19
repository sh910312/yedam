package SortedTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

class Person implements Comparable {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;

		// return this.age - ((Person) o).age; // 음수값: 오름차순, 양수값 : 내림차순
		// name 필드의 문자의 갯수로 정렬
		return this.name.length() - p.name.length();
	}

}

public class COmparableEx {

	public static void main(String[] args) {

		Person p1 = new Person("ㅁㅁaaa", 30);
		Person p2 = new Person("ㅁbbb", 20);
		Person p3 = new Person("ㅁㅁㅁㅁㅁccc", 10);

		TreeSet<Person> set = new TreeSet<>(); // TreeSet 정렬
		set.add(p1);
		set.add(p2);
		set.add(p3);

		for (Person p : set) {
			System.out.println(p.age + "-" + p.name);
		}

	}

}
