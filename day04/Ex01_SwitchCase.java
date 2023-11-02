package day04;

public class Ex01_SwitchCase {

	public static void main(String[] args) {
		/* 조건문  - switch case */
		/*
		switch(조건변수) {
		case 변수값1:
			(조건변수의 값이 변수값1과 같을 경우 실행될 부분)
			break;
		case 변수값2:
			(조건변수의 값이 변수값2과 같을 경우 실행될 부분)
			break;
		case 변수값...:
			break;
		default;
		(조건변수와 일치하는case가 업을 경우 실행될 기분)
		범위가 있는 조건은 스위치로 만들길 힘들고
		정해져 있는 조건은 가능하다(범위가 있는 조건은 if문 이용)
		}
		*/
		
		int num = 5;
		switch(num) {
		case 1:
			System.out.println("num = 1");
			break;
		case 5:
			System.out.println("num = 5");
			break;
		default :
			System.out.println("일치하는 case가 없음");
		}
		
		int score = 10;
		switch(score) {
		case 1:
		case 2:
		case 5:
			System.out.println("1~5사이");
			break;
		case 6:
		case 7:
		case 10:
			System.out.println("6~10사이");
			break;
		}
		
		if(score >= 6) { //위 스위치문을 if으로하면 더 간단하게 할 수 있다.
			System.out.println("6~10사이");
		} else {
			System.out.println("6~10사이");
		}
		
		
			

	}

}
