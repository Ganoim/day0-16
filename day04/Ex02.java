package day04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1]아메리카노(2000)" + "[2]바닐라라떼(3500)");
		System.out.print("메뉴선택>>");
		int selectMenu = scan.nextInt(); // selectMenu == 1이면 "아메리카노 선택" 츨력 2면 "바닐라라떼 선택" 출력
		
		switch(selectMenu) {
		case 1:
			System.out.println("아메리카노 선택");
			break;
		case 2:
			System.out.println("바닐라라떼 선택");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
		}
		
		
		 System.out.println();
		 int num1 =10;
		 if(num1 == 10) {
			 int num2 = 20;
			 System.out.println("if num2 : " + num2);
			 
		 } else {
			 int num2 = 20;
			 System.out.println("else num2 : " + num2);
			 
		 }
		 /*
		 int num4 = 40    // 이런식으로 미러 변수를 선언하고 각 case마다 새로 변수를 초기화해서 쓸 수도 있다
				 switch(num3) {
				 case 10:
					 num4 = 40;
					 System.out.println("case num4 : " + num4);
					 break;
				default:
					num4 = 50;
					 System.out.println("default num4 : " + num4);
					 break;
				 }
		 */
		 
		 
		 
		 
		 
		 int num3 = 10;
		 switch(num3) {
		 case 10:
			 int num4 = 40;
			 System.out.println("case num4 : " + num4);
			 break;
		default:
			//int num4 = 40;
			 break;
		 }
		
		
		
		
		
		
		
		
		

	}

}
