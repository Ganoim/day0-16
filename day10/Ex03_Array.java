package day10;

public class Ex03_Array {

	public static void main(String[] args) {
		/* 2차 배열에서는 (strArr.length)가 행의 개수를 의미 */
		
		String[][] strArr = { {"A","B","C"},
							  {"D","E"},
							  {"F","G","H","I"} };
		
		System.out.println("0행");
		// 0행의 모든 문자 출력
		for(int i = 0; i < strArr[0].length; i++ ) {
			System.out.println(strArr[0][i]);
		}
		System.out.println("1행");
		// 1행의 모든 문자 출력
		for(int i = 0; i < strArr[1].length; i++ ) {
			System.out.println(strArr[1][i]);
		}
		System.out.println("2행");
		// 2행의 모든 문자 출력
		for(int i = 0; i < strArr[2].length; i++ ) {
			System.out.println(strArr[2][i]);
		}
		System.out.println("-----");
		
		for(int row = 0; row < strArr.length; row++ ) { //행번호의 반복
			System.out.println(row + "행");
			
			for(int col = 0; col < strArr[row].length; col++) { //열 번호의 반복
				System.out.println(strArr[row][col]);
			}
			
		}
		
		
		
		
		

	}

}
