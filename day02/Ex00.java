package day02;

public class Ex00 {

	public static void main(String[] args) {
		/* 연산자 */
		// +, -, *, /, =, %
		int number1; // int타입의 number1 선언
		number1 = 10; // number1을 10으로 초기화
		number1 = 20;
		number1 = 30;
		// 1 + 2 = 3(일반 연산)
		// =기준으로 오른쪽에 있는 걸 왼쪽에 대입(자바에서 =)
		
		int number2 = 2;
		int number3 = 3;
		
		number2 = 20;
		number3 = number3 + 30;
		
		//1. number3 + 30 >> 3 + 30 >> 33
		//2. number3 = 33;
		System.out.println(number2);//20
		System.out.println(number3);//33
		
		int scoere = 80;
		int result;
		result = scoere + 10;
		System.out.println("덧셈결과: " + result);
		
		result = scoere - 20;
		System.out.println("뺄셈결과: " + result);
		
		result = scoere * 30;
		System.out.println("곱셈결과: " + result);
		
		result = scoere / 40;
		System.out.println("나누셈결과: " + result);
		
		result = scoere % 50;
		System.out.println("나머지결과: " + result);
		
		
		
		

	}

}
