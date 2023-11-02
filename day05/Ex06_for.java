package day05;

import java.util.Scanner;

public class Ex06_for {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시작숫자>>");
		int startNum = scan.nextInt();
		System.out.print("종료숫자>>");
		int endNum = scan.nextInt();
		int count = 0;//3의 배수의 개수 저장할 변수
		int sum = 0; //총합을 저장할 변수
		
		//3의 배수의 개수를 세는 코드
		System.out.println("for문 시작");
		for(int i = startNum; i <= endNum; i++) {
			System.out.print(i+" ");
			
			if( i % 3 == 0) {
				count = count + 1;
				sum = sum + i;
				
			}
			
			
		}
		System.out.println("\nfor문 종료");
		System.out.println("3의 배수는" + count + "개 입니다");
		System.out.println("총합은 " + sum);
		
		
	}

}
