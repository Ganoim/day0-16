package day02;

import java.util.Scanner;

public class Ex05_Question {

	public static void main(String[] args) {
		
		//커피가격
		int coffeePrice = 3000;
		
		/* 
		 내가 가지고 있는 돈을 입력 받아서
		 커피를 구매 했을 때 남은 잔액 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int money, coffeePrice1;
		System.out.print("내가가진 돈: ");
		money = scan.nextInt();
		
		System.out.print("커피 가격: ");
		coffeePrice1 = scan.nextInt();
		
		
		System.out.println("잔액은 " + (money - coffeePrice1) +"원 입니다");
		
		
		
		
		
	}

}
