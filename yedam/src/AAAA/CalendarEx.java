package AAAA;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.get(Calendar.YEAR)); // 년도
		System.out.println((cal.get(Calendar.MONTH) + 1) + "월"); // 몇월
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 몇일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일 (월0 수요일4)

		cal.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //

		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH)); // 월의 마지막날 (28~30)

		// Calendarshow(2019,7);
		System.out.println("\n");
		
		System.out.println("\t  "+cal.get(Calendar.YEAR)+"년"+((cal.get(Calendar.MONTH) + 1) + "월"));
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%2d  ", i);
			if (i % 7 == 0)
				System.out.println();
		}

		System.out.println("\n");
		
	}
	

}
