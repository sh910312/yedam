package yedamOracle.com;

class Friend{
	
	String name;
	String phone;
	
	Friend(String name){
		this.name = name;
		
	}
		
	String getName() {
		return name;
	}
	
	String getphone() {
		return phone;
	}
	void setphone(String phone) {
		this.phone = phone;
	}
	
}


public class ArraySample {
				
	
	public static void main(String[] args) {
		
		Friend fr1 = new Friend("호길동");
		Friend fr2 = new Friend("길동");
		Friend fr3 = new Friend("동");

		Friend[] frndAry = {fr1, fr2, fr3};
		for(int i = 0; i<frndAry.length; i++) {
			System.out.println(frndAry[i].getName()+" "+frndAry[i].getphone());
		}
				
		
		
		
		int[] ary = {1, 2, 3}; // int ary[] = {1,2,3}
		int[] arry = new int[5];
		System.out.println("ary의 배열크기: "+ary.length);
		
		for(int i=0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
		
		System.out.println("arry의 배열크기: "+arry.length);
		for (int i=0; i<arry.length; i++) {
			System.out.println(arry[i]);
		}
		// arry[0] = 10; arry[1] = 20;
		for (int i=0; i<arry.length; i++) {
			arry[i] = (i+1)*10;
		}
		System.out.println("값이 할당된 후..");
		for (int i=0; i<arry.length; i++) {
			System.out.println(arry[i]);
		}
		System.out.println("~~~~~~");
		
		int sum = 0;
		for (int i=0; i<arry.length; i++) {
			sum = sum + arry[i];
		}
		System.out.println("합계:"+sum);
		System.out.println("~~~~~~");
	
		int result = sum(arry);
	

		System.out.println(result);
}
	
	
	static int sum(int arry[]) {
		int sum = 0;
		for (int i=0; i<arry.length; i++) {
			sum = sum + arry[i];
		}
				
		
		return sum;
	

		
	}
}



