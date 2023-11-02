package day03;

public class Ex01_If {

	public static void main(String[] args) {
		
		/* 조건문 - if
		
		if(조건식) {
			조건식이 true 일 경우 실행되는 부분			
		} else {
			조건식이 false 일 경우 실행되는 부분	
		}
		else는 단독으로 사용 x
		if의 조건이 아니면 나오는 것이기때문
		
		*/
		System.out.println("if문 시작");
		boolean boolVal = 10 > 20;
		if( boolVal) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("if문 종료");
		
		int score = 85;
		if( score >= 90) {
			System.out.println("A학점입니다.");
		} else if( score >= 80 ) {
			System.out.println("A학점이 아닙니다.");		
		} else {
			System.out.println("80점 미만입니다");
		}
		
		//변수 사용 범위
		int num1 = 1;
		int num2 = 2;
		if( num1 < num2 ) {
			System.out.println("num1이 num2보다 작다");
			int num3 = 10; //변수느 자기가 선언된 범위안에서만 사용가능({})
			System.out.println(num2);
		}
//		System.out.println("num3 : " + num3);
		
		
		
		
		
		
		

	}

}
