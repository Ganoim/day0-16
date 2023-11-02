package day07;

public class Ex06_Array {

	public static void main(String[] args) {
		/* 배열 Array (하나의 변수에 여러개의 값을 넣을 수 있음)*/
		// 타입 이름 = 값; (변수 안에는 하나의 값만 들어감)
		int num = 10;
		num = 20;
		System.out.println(num);
		
//		변열 선언  (배열인지 일반변수인지 구분은 타입이나 변수이름에 []을 붙임)
//		타입[] 이름 = {값1, 값2};  타입 이름[] = {값1, 값2};
		
		int[] arrNumber = {10, 20};
		int arrNumber2[] = {10, 20};
		int[] menuCount = {3, 4, 5};      // Index - 배열안에 들어가 있는 공간, length
		
		System.out.println(menuCount[0]); // 배열을 사용 할 때는 "배열명[0]"(0부터1) 배열앞에 몇번째 값을 쓸껀지 써줘야한다
		System.out.println(menuCount[1]);
		System.out.println(menuCount[2]);
		
		System.out.println(menuCount.length); // 배열안에 있는 값에 개수를 보여줌
		
		System.out.println("for");
		for(int i = 0; i < menuCount.length; i++) {
			System.out.println(menuCount[i]);
		}
		
		

	}

}
