package day08;

import java.util.Scanner;

public class Ex04_Scores {

	public static void main(String[] args) {
		/* 1. 과목수 배열 생성
		   2. 성적을 입력
		   3.  모든 과목의 성적 출력
		   4. 성적분석(총점, 평균, 최대값, 최소값) 
		   변수를 선언할때 반복문 안에서만 쓸건지 밖에서도 써야하는 잘 판단해서 써야하고
		   이 프로그램처럼 반복문안에서 변수값을 유지시켜야하니까 while문 밖에 선언을하고 사용했다
		 */
		Scanner scan = new Scanner(System.in);
		int[] scores = null; //  null : 형태는 가지고 있는데 안에 값을 가지고 있지 않음
		boolean check = false; // 2. 성적입력 기능으로 성적을 입력했는지 확인
		
		boolean run = true;
		while(run) {
			//1. 메뉴 출력
			System.out.println("---------------------------------------------");
			System.out.println("[1]과목수입력 [2]성적입력 [3]성적출력 [4]성적분석 [5]종료");
			System.out.println("---------------------------------------------");
			System.out.print("메뉴선택>>");
			int selectMenu = scan.nextInt();
			if( selectMenu != 1 && scores == null ) {  //selectMenu의 값이 2,3,4 이면서 scores 배열이 null
				System.out.println("[1]과목수를 입력해주세요!");
				continue;
			}
			
			
			
			
			switch(selectMenu) {
			case 1: // [1]과목수입력 선택 (배열 생성)
				System.out.print("과목수 입력>>");
				int size = scan.nextInt();
				scores = new int[size];
				check = false;
				break;
			case 2: // [2]성적입력 선택
				for(int i = 0; i < scores.length; i++) {
						System.out.print( (i+1)+"번째 과목의 점수>>");
						scores[i] = scan.nextInt();
				}
				check = true;
				break;
			case 3: // [3]성적출력 선택
				if(check) { //check : true >> 성적입력을 했으면
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores["+i+"] : " + scores[i]);
					}
				} else { //check : false >> 성적입력을 하지 않았으면
					System.out.println("[2]성적입력을 해주세요!");
				}
				break;
			case 4: // [4]성적분석 선택
					for(int i = 0; i < scores.length; i++) {
						
					}
				
				break;
			default: // [5]종료 선택
				
			}
			
		}
		
		
		

	}

}
