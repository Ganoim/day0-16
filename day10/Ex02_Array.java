package day10;

public class Ex02_Array {

	public static void main(String[] args) {
		
//		String[] srtArr = new String[5]; 
		
				
		String[][] strArr = new String[2][3]; //2차원 배열의 크기만 설정
//		|		|		|		|
//		|		|		|		|
		strArr[0][0] = "A";
//		strArr[0][3] = "A"; >> ArrayIndexOutOfBoundsException-오류
		System.out.println(strArr.length);    // 행의 개수
		System.out.println(strArr[0].length); // 첫번째 열의 개수
		System.out.println(strArr[1].length); // 두번째 열의 개수
		
		System.out.println("strArr2");
		String[][] strArr2 = new String[3][]; // 해당 배열에 3행만 설정
//	[0]행
//	[1]행	
//	[2]행
		System.out.println(strArr2.length);
//		System.out.println(strArr2[0].length); >> 오류 아직 0행의 값이 없음
		
		
		strArr2[0] = new String[2];
		strArr2[1] = new String[5];
		strArr2[2] = new String[3];
		System.out.println(strArr2[0].length);
		System.out.println(strArr2[1].length);
//	[0]행 |		|		|
//	[1]행 |		|		|		|		|		|	
//	[2]행 |		|		|		|
		
		
		
		
		
		
		
		
		
	}

}
