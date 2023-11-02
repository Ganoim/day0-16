package day06;

import java.util.Scanner;

public class Ex05_while {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
	while(true) { //전체 코드중 반복이 되어야 하는 부분만 넣어야됨
		System.out.println("[1]아메리카노(2000)" + "[2]바닐라라떼(3500)");
		System.out.print("메뉴선택>>");
		int selectMenu = scan.nextInt();
		
		System.out.print("돈을 넣어 주세여>>");
		int money = scan.nextInt();
		
		if(selectMenu == 1) {
			money = money - 2000;
			System.out.println("거스름돈은" + money + "원입니다");
		}else if(selectMenu == 2) {
			System.out.println("거스름돈은" + (money - 3500) + "원입니다");
		}
		
		break;
	}
	System.out.println("END");
	
	
	int coffeePrice = 0;
	
	while(true) {
		System.out.println("[1]아메리카노(2000)" + "[2]바닐라라떼(3500)");
		System.out.print("메뉴선택>>");
		int selectMenu = scan.nextInt();
		
		System.out.print("돈을 넣어 주세여>>");
		int money = scan.nextInt();
		
		switch(selectMenu) {
		case 1: // 1번을 선택한 경우
			
			break;
		case 2: // 2번을 선택한 경우
			
			break;
		}
		
		
		
	}
	
	
	
		
		
		
		
		
		
		
		

	}

}
