package AAAA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // Arrays.asList("d", "d", "d"); 
		List<String> list2 = new LinkedList<>(); 

/*		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i <10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간:" + (endTime -startTime));
		
		startTime = System.nanoTime();
		for (int i = 0; i <10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간:" + (endTime -startTime));
		
*/	
		
		
		
		
/*
		for (String str : list) {
			System.out.println(str);
		}

		List<Integer> intlist = Arrays.asList(1,2,3,4,5);
		for (Integer in : intlist) {
			System.out.println(in);
		}
*/		
		

		list.add("java");
		list.add("JDSD");
		list.add("1111");


		System.out.println(list.get(2));
		System.out.println();

		}
	}


