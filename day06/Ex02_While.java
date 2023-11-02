package day06;

public class Ex02_While {

	public static void main(String[] args) {
		/* 반복문 - while */
		
		/* while(반복조건) {
			반복 실행된 부분
			
		}
		*/
		
		System.out.println("for문 시작");
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nfor문 종료");
		
		
		System.out.println("while문 시작");
		int j= 1;
		while(j <= 5) { //위 for문을 while문으로 쓰면 
			System.out.print( j + " ");
			j++;
		}
		System.out.println("\nwhile문 종료");
		
		
		
		System.out.println();
		int k = 1;
		while(true) {
			System.out.print(k + " ");
			k++;
			if(k > 5) { // 언제 중지가 됐으면 좋은지 break를 이용해서 중지
				break;
			}
		}
			
		System.out.println("\nwhile문 종료");
		
		int z = 1;
		boolean run = true;
		while(run) { // while을 멈추기위해서는 break를 쓰거나 boolean타입 변수를 이용해서 멈춘다(멈추기 않으면 무한반복)
			System.out.print(z + " ");
			z++;
			if(k > 5) { // 언제 중지가 됐으면 좋은지 변수를 이용해서 중지
				run = false;
			}
		}
		/*
		switch() { // 스위치문은 case 1:에서만 멈춤(break)
		case 1:
			run = false;
			break;
		}
		*/
		
		
		
		
		
		

	}

}
