package day01;

public class Ex03 {

	public static void main(String[] args) {
		
		// java 시험 점수
		// java, score, first 변수를 선언할때 시작은 소문자 단어가 바뀌면 대문자로(javaScoreFirst)-규칙
		// 변수명을 쓸때 그 쓰임새에 맞는 이름으로 설정
		
		/* 이런식으로 주석을 달아놓으면 좋음
		 * 작성자:
		 * 기능:
		 * 파라메터:
		 *  */
		int javaScore = 90;
		char charVal = 'A';
		String strVal = "문자열변수";
		
		System.out.println(javaScore); //지정된 기능을 수행 할수 있게해주는 것을 메소드(println) -매개변수는(javaScore)
		System.out.println("javaScore");//syso쓰고 ctrl+스페이스 누르면 - System.out.printl
		
		int oracleScore = 80;
		System.out.println(oracleScore); //alt+방향키(선택된 줄 이동) ctrl+y 앞으로
		
		System.out.println("문자출력");
		System.out.println("자바 점수: " + javaScore);
		System.out.println(javaScore + oracleScore);
		System.out.println("총점:"+ javaScore + oracleScore);
		// "총점 : 90" + 80
		System.out.println("총점:"+ (javaScore + oracleScore) );
		
		
		
	}

}
