package TEST;


import com.yedam.hankook.*;
import com.yedam.hankook.ShowTire;
import com.yedam.kunho.WideTire;


class Wheel{
	void wheelSize() {
		System.out.println("휠사이즈");
	}
}

public class TrieEx {
	public static void main(String[] args) {
		
		Wheel wheel =new Wheel();
		
		ShowTire snowtire =new ShowTire();
		snowtire.showType();
		
		WideTire wideTire = new WideTire();
		wideTire.showInfo();
		
		com.yedam.hankook.Tire tire1 = new com.yedam.hankook.Tire();
		com.yedam.kunho.Tire tire2 = new com.yedam.kunho.Tire();
	
	
	}
}
