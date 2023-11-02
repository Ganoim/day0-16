package day01;

public class Ex02 {
	//클래스 안에 만들 수 있는것
	//필드
	//메소드
	//생성자

	public static void main(String[] args) { //main=메소드(시작)
		/* 변수 */
		/*프로그램 실행하는데 필요한 
		 * 데이터를 저장하기 위해
		 * 메모리 공간안에 영역을 할당하고
		 * 이름을 부여하는 것
		 */
		//자료형: 숫자 || 문자
		//정수형 숫자 : byte, short, int, long
		int number = 10; // 변수를 선언하고 초기화(사용할 수 있도록 해주는것)
		
		int number2; // int 타입 변수 number2를 선언
		number2 = 20;// number2를 초기화(값을 넣어서 사용할 수 있게 만든것)
		
		int number3 = 30;
		int number4;
		System.out.println(number3);
//		System.out.println(number4); (변수값이 없어서 오류)
		
//		[변수타입] [변수명] = [변수값];    (변수선언 문법)
		/* 
		 [byte 타입] : 1byte >> 8bit(127(0포함 128), -128 총256까지 저장가능)
		 [shirt 타입] : 2byte >> 16bit
		 [int 타입] : 4byte (4byte 만큼저장가능)
		 [long 타입] : 8byte
		 */
		
		byte bteNum1 = 127;
		short shortNum1 = 128;
		int intNum1 = 100; 
		long longNum1 = 1234567890; //(L, l)long를 쓸 때 마지막에 L을 붙여야 int 이상에 값을 쓸 수 있다
		
		//실수형 숫자
		/*
		 [float 타입] : 4byte
		 [double 타입]: 8byte
		 */
		float floatNum1 = 10.123F; //(F, f)를 써야 사용가능
		double doubleNum = 111.1234;
		
		// [boolean 타입] : true || false (둥중 하나만 저장)
		boolean boolVal1 = true;
		boolean boolVal2 = false;
		boolean boolVal3 = 10 > 20 ; // 결과값(false)
		
		// [char 타입] : 문자(한글자 저장할때('A'))
		// ''(쿼터) 문자형인지 아닌지 ''로 구분 쿼터를 쓰면 문자형으로 인식
		char chatVal1 = 'A';
		// 여러글자(문자열)을 쓸때는 ""(더블쿼터)
		String srtVal1 = "abcd"; 
		// 참조형(기본형으로 할 수 없는 여러 문자열를 쓸때)-String(기본형은 글자색이 보라색 참조형은 색이 없음 검정색
		// int, float, boolean, string - 앞으로이 4개를 주로씀
		
	}

}
