package day05;

public class Ex07_Question {

	public static void main(String[] args) {
		/*
		 * 1. 1~30번 까지의 학생
		 * 2. 짝수번 학생, 홀수번 학생
		 * 3. 짝수 : 통새우와퍼세트 9700원
		 *    홀수 : 와퍼세트 8900원
		 *    5의 배수인 학생인 경우 : 와퍼주니어세트 6600원
		 *    
		 * 4. 통새우와퍼세트의 총액 출력
		 *    와퍼세트의 총액 출력
		 * */
		
		int sum1 = 0;
		int sum2 = 0;
		int set1 = 9700;
		int set2 = 8900;
		
		for(int i = 1; i <= 30; i++) { // 1~30번 학생
			
			if( i % 2 == 0) { // 짝수번호 학생인 경우
				sum1 = sum1 + set1;
				
			} else { // 홀수번호 학생인 경우
				sum2 = sum2 + set2;
			}
			
			
		}
		System.out.println("통새우와퍼세트의 총액은" + sum1 + "원 입니다");
		System.out.println("와퍼세트의 총액은 " + sum2 + "원 입니다");
		
		
		
		// if문 2개를 continue를 이용해서 하는 방법
		System.out.println();
		int shrimpWafer = 0;//통새우총액
		int wafer = 0; //와퍼총액
		int waferJunior = 0;

		for(int i = 1; i <= 30; i++) { // 1~30번 학생
			
			if( i % 5 == 0) { // 5의 배수의 학생인 경우
				waferJunior = waferJunior + 6600;
				continue; //5의 배수일 경우 6600을 더하고 넘김
				
			} if(i % 2 == 0) { //짝수 학생인 경우
				shrimpWafer = shrimpWafer + 9700;
			}
			
			else { // 홀수번호 학생인 경우
				wafer = wafer + 8900;
			} 
			
			
		}
		System.out.println("통새우와퍼세트의 총액은" + shrimpWafer + "원 입니다");
		System.out.println("와퍼세트의 총액은 " + wafer + "원 입니다");
		System.out.println("와퍼주니어세트의 총액은 " + waferJunior + "원 입니다");
		
		
		
		
		// if문 하나로 묶어서 하는방법
		System.out.println();
		int shrimpWafer1 = 0;//통새우총액
		int wafer1 = 0; //와퍼총액
		int waferJunior1 = 0;

		for(int i = 1; i <= 30; i++) { // 1~30번 학생
			if( i % 5 == 0) { // 5의 배수의 학생인 경우
				waferJunior1 = waferJunior1 + 6600;
			} else if(i % 2 == 0) { //짝수 학생인 경우
				shrimpWafer1 = shrimpWafer1 + 9700;
			}
			else { // 홀수번호 학생인 경우
				wafer1 = wafer1 + 8900;
			} 
			
			
		}
		System.out.println("통새우와퍼세트의 총액은" + shrimpWafer1 + "원 입니다");
		System.out.println("와퍼세트의 총액은 " + wafer1 + "원 입니다");
		System.out.println("와퍼주니어세트의 총액은 " + waferJunior1 + "원 입니다");
		
		
		
		
		
		
		

	}

}
