package day06;

import java.util.Scanner;

public class Ex03_while {

	public static void main(String[] args) {
		/* 반복문 - while */
		//while문은 조건이 false가 될때까지 반복
		//while문을 중지시키는 방법
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("숫자입력>>");
			int inputNum = scan.nextInt();
			System.out.println("입력한 숫자 : " + inputNum);
//			if(inputNum == 0) {
//				break;
//			}
			switch(inputNum) {
			case 0:
				System.out.println("swich-case");
				run = false;
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
