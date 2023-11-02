package day06;

import java.util.Scanner;

public class Ex03_while2 {

	public static void main(String[] args) {
		/* 반복문 - while */
		//while문을 중지시키는 법을 알아야함
		Scanner scan = new Scanner(System.in);
		
		loopwhile:
		while(true) {
			System.out.print("숫자입력>>");
			int inputNum = scan.nextInt();
			System.out.println("입력한 숫자 : " + inputNum);
			switch(inputNum) {
			case 0:
				System.out.println("swich-case");
				break loopwhile;
			}
		}
		
		
		
		
		
		



	}

}
