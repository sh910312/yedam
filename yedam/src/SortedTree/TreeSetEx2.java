package SortedTree;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(80));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		System.out.println("[오름차순]");
		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("[내림차순]");
		Iterator<Integer> descIter = scores.descendingIterator();
		while (descIter.hasNext()) {
			System.out.println(descIter.next());
		}

		NavigableSet<Integer> nset = scores.descendingSet(); // descendingSet
		for (Integer i : nset) {
			System.out.println(i);
		}

		Iterator<Integer> nter = nset.iterator();
		while (nter.hasNext()) {
			System.out.println(nter.next());
		}

	}

}
