package day06;

import java.util.Scanner;

public class Ex05_while2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int sum = 0; //총 판매금액
		
		while(true) {
			int coffeePrice = 0;
			System.out.println("[1]아메리카노(2000)" + "[2]바닐라라떼(3500)");
			System.out.print("메뉴선택>>");
			int selectMenu = scan.nextInt();
			
			switch(selectMenu) {
			case 1: // 1번을 선택한 경우
				coffeePrice = 2000;
				break;
			case 2: // 2번을 선택한 경우
				coffeePrice = 3500;
				break;
			}
			System.out.print("돈을 넣어 주세여>>");
			int money = scan.nextInt();
			System.out.println("거스름돈 " + (money - coffeePrice)+"원");
			
			sum = sum + coffeePrice;
			
			// 커피 총 판매금액이 10000원 이상인경우 종료
			if( sum >= 10000) {
				System.out.println("목표수익 달성!");
				break;
			}
			System.out.println("while문 종료");
			
			
			
		}
		
		
		
		
		
		
		
	}

}
