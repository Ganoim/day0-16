package day01;

public class Ex04 {

	public static void main(String[] args) {
		/*
		int javaScore = 100;
		int oracleScore = 80;
		 */
		int num1, num2;
		num1 = 20;
		
		int javaScore = 100, orecleScore = 80;
		int totalScore = javaScore + orecleScore;
		System.out.println(totalScore);
		System.out.println(totalScore / 2);
		
//		System.out.println(javaScore + orecleScore);
//		System.out.println((javaScore + orecleScore) / 2);
		
		String name = "전관호";
		String birth = "2023년 4월";
		String myInfo =  name + birth;
		System.out.println(myInfo);
		
		System.out.println(name + javaScore);
		String testVal = "100";
		System.out.println(javaScore);
		System.out.println(testVal);
// 		
		
		// 숫자를 문자로
		int number = 10;
		
		int intresult = number; //10
		
		String result = number + ""; //숫자를 ""(길이가 문자가0인)것을 더해주면(결합) 문자가된다
		
		//문자를 숫자로
		int re = Integer.parseInt("100"); //Integer.parseInt(문자를 숫자로 바꾸는 방법)이라는 메소드를 써준다
		
		

		
	}

}
