package day08;

public class Ex01_Array {

	public static void main(String[] args) {
		/* Array 배열 */
		/* 같은 타입의 데이터를 하나의 변수에 저장하는 구조 */
//		타입[] 배열이름 = {값1, 값2}
		
		int[] numbers = {11, 12, 13, 14, 15};
//		| 11 | 12 | 13 | 14 | 15 |
//	idx  [0]  [1]	[2]  [3]  [4]
		System.out.println("numbers[0] : " + numbers[0]);
		numbers[0] = 21;
		System.out.println("numbers[0] : " + numbers[0]);
		
		
		// 크기가 5인 int 타입의 배열을 선언
		int[] numArrl = new int[5]; // 값이 들어갈 공간만 만들어준것(index 5)
//		|    |    |    |    |    |
//	idx  [0]  [1]  [2]  [3]  [4]		
		System.out.println("numArrl[0] : " + numArrl[0]);
		numArrl[0] = 100;
		numArrl[1] = 200;
		
		System.out.println("배열의 크기 : " + numArrl.length);
		
		
		
		
		

	}

}
