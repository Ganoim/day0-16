package day07;

import java.util.Scanner;

public class Ex03_Balance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myBalance = 0; // 내 계좌의 잔액
		boolean run  = true; // while문 실행을 위한 변수
		while(run) {
			System.out.println("[1]입금 [2]출금 [3]잔고 [4]종료");
			System.out.println("메뉴선택>>");
			int sclectMeun = scan.nextInt(); // 메뉴선택입력
			if(sclectMeun == 1) { //1번메뉴
				System.out.println("[입금]");
				System.out.println("입금할 금액>>");
				int deposit = scan.nextInt();
				myBalance += deposit;   // myBalance = myBalance + deposit
				
			}else if(sclectMeun == 2) { //2번메뉴
				System.out.println("[출금]");
				System.out.println("출금할 금액>>");
				int withdraw = scan.nextInt();
				if(myBalance >= withdraw) {
				myBalance = myBalance - withdraw;  // myBalance -= withdraw
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				System.out.println("현재 잔액은 " + myBalance+"원 입니다");
			}else if(sclectMeun == 3) { //3번메뉴
				System.out.println("[잔고]");
				System.out.println("잔고는" + myBalance +"원 입니다");
				
			}else { //4번메뉴
				System.out.println("종료합니다.");
				break;
			}
		}

	}

}
