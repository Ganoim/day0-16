package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_TryCatch {

	public static void main(String[] args) {
		/* 예외처리 */
		
		System.out.println("시작");
		Member[] memArr = new Member[3];
		String mid = null;
		try { // try-실행할 코드
			mid = memArr[0].getMid(); // java lang.NullPointerException
			
			
		} catch(NullPointerException e) { // catch-예외상황
			System.out.println("catch - NullPointerException 예외 발생");
			mid = "te:st";
		}
		
		System.out.println("회원 아이디 : " + mid);
		System.out.println(mid.split(":")[0]);
		System.out.println("처리 후 실행");
		System.out.println("종료");
		
		
		int num = 0;
		try {
			int result = 10 / num;
			System.out.println(result);
			System.out.println(memArr[0].getMid());
			
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생");
			
		} catch(NullPointerException e) {
			System.out.println("NullPointerException 예외 발생");
			
		} catch(Exception e) { // 모든 예외
			System.out.println("Exception 예외 발생");
		}
		System.out.println("확인");
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴입력>>");
		int selecMenu = 0;
		try {
			selecMenu = scan.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력 해주세요!");
		} finally { //무조건 실행되는 코드
			System.out.println("무조건 실행");
		}
		System.out.println(selecMenu);
		
		
		
		
		
	}

}
