package day04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자입력>>");
		String strVal = scan.next();
		System.out.println("strVal : " + strVal);
		
		switch(strVal) {
		case "A":
			System.out.println("switch A");
			break;
		case "B":
			System.out.println("switch B");
			break;
		case "ABC":
			System.out.println("switch ABC");
			break;
		default:
		}
		System.out.println("switch문 종료");
		
		
		
		
		System.out.println("if문 시작");
		//위 스위치문을 if문으로
		// int 변수는 == 으로 같은지 비교하고
		// String 변수는 "strVal.equals("A")" 변수 이름앞에 equals를 써서 비교를 한다
		if(strVal.equals ("A")) {
			System.out.println("if A");
		} else if(strVal.equals ("B")) {
			System.out.println("if B");
		} else if(strVal.equals ("ABC")) {
			System.out.println("if ABC");
		}
		System.out.println("if문 종료");
		
		System.out.println(strVal == "A");
		System.out.println(strVal.equals("A") );
		

	}

}
