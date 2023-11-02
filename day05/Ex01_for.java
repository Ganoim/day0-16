package day05;

public class Ex01_for {

	public static void main(String[] args) {
		/* 반복문 - for문 */
/*		    최기화식      조건식  증감식i++(i=i+1)
		for(int i = 0;  i < 10; i++) {
			i가 10보다 작은면 반속 실행	
		}
*/
		
		
		System.out.println("for문 시작");
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			/*
			 * 1. int i = 0 초기화식
			 * 2. i < 5 조건 확인(반복을 위한 조건식)
			 * 3. System.out.println("i = " + i)를 실행
			 * 4. i++ 증감식 실행 i:0 >> i:1
			 * 5. i < 5; 조건 확인
			 * 6. System.out.println("i = " + i)를 실행
			 * 7. i++ 증감식 실행 i:1	 >> i:2 ... i:5
			 *    위 과정반복
			 * ... i < 5 조건 확인 :: false이면 반복문 종료
			 * */
			
		}
		System.out.println("for문 종료");
		
		System.out.println();
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
			
		}
		
		
		
		
		
		
		

	}

}
