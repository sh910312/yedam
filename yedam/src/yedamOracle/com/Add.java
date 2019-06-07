package yedamOracle.com;

	import java.util.Random;
	import java.util.Scanner;


	public class Add {
		public final int GAWI = 1;
		public final int BAWI = 2;
		public final int BO = 3;
		public final int EXIT = 9;

		// 가위 바위 보 종료를 파이널 변수로 선언
		 
		private int user;
		private int computer;
		
		// 사용자, 컴퓨터의 입력값을 받을 변수선언
		
		private int except;
		private int win;
		private int draw;
		private int lose;
				
		public Add() {
			System.out.println("김수호");
			
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
									
			except = 0;
			win = 0;
			draw = 0;
			lose = 0;
									
			while(true){  
				System.out.print("값을 입력하시오. 가위(1), 바위(2), 보(3), 종료(9):");
				user = sc.nextInt();
				computer = rand.nextInt(3)+1;
								
				if(user > 0 && user < 4){  
					switch(user) {
					case GAWI: // 입력값이 1일때 가위
						if(computer == 1) {
							System.out.println("user : 가위 / 컴퓨터 : 가위");
							System.out.println("비겼습니다.");
							draw++; // 비김횟수 증가
						}else if(computer == 2) {
							System.out.println("user : 가위 / 컴퓨터 : 바위");
							System.out.println("패배하였습니다.");
							lose++; // 패배횟수 증가
						}else if(computer == 3) {
							System.out.println("user : 가위 / 컴퓨터 : 보");
							System.out.println("이겼습니다.");
							win++;  // 승리횟수 증가
						}
						break;
					case BAWI: // 입력값이 2일때(바위)
						if(computer == 1) { 
							System.out.println("user : 바위 / 컴퓨터 : 가위");
							System.out.println("이겼습니다.");
							win++;
						}else if(computer == 2) {
							System.out.println("user : 바위 / 컴퓨터 : 바위");
							System.out.println("비겼습니다.");
							draw++;
						}else if(computer == 3) {
							System.out.println("user : 바위 / 컴퓨터 : 보");
							System.out.println("패배하였습니다.");
							lose++;
						}
						break;
					case BO:  // 입력값이 3일때(보)
						if(computer == 1) {
							System.out.println("user : 보 / 컴퓨터 : 가위");
							System.out.println("패배하였습니다.");
							lose++;
						}else if(computer == 2) {
							System.out.println("user : 보 / 컴퓨터 : 바위");
							System.out.println("이겼습니다.");
							win++;
						}else if(computer == 3) {
							System.out.println("user : 보 / 컴퓨터 : 보");
							System.out.println("비겼습니다.");
							draw++;
						}
						break;
					default : // 입력값을 범위가 존재하지 않을떄
						System.out.println("Exception!!!");
						except++;
						break;
					}
				}else if(user == 9){ // 게임종료 입력시
					System.out.println("종료! -- 게임결과출력 --");
					break;
				}
				else{
					System.out.println("입력값이 잘못되었습니다. 다시 입력하세요.");
					except++;
				}
			}	
			System.out.println("승:" + win); 
			System.out.println("패:" + lose);
			System.out.println("비김:" + draw);
			System.out.println("오입력:" + except);
		}
		
		public static void main(String [] args) {
			Add adc = new Add();
		}
	}