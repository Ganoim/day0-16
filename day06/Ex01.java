package day06;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		
		for(int i = 0; i <= 2; i++) { //i : 0,1,2 : 3번
			System.out.println("[ i = " + i + " ]");
			for(int j = 0; j <= 3; j++) {  // j : 0,1,2,3
				System.out.println("j = " + j);
			}
		}
		/*
		 구구단 : 2단 ~ 9단
		 2 X 1 = 2, 3 X 1 = 1, 9 X 1 = 9 
		 2 X 2 = 4, 3 X 2 = 6, 9 X 2 = 18
		 ...
		 ...
		 2 X 9 = 18, 3 X 9 = 27, 9 X 9 = 81
		 
		 
		 */
		System.out.println();
		
		
		for(int i = 2; i <= 9; i++) { // 2 ~ 9
			
			if( i<7) { //if를 이용해서 2~9단중 3단만 보고싶을때(i != 3) 7~9단 까지만 보고 싶은때(i < 7)
				continue;
			}
			for(int j = 1; j <= 9; j++) {  // 1 ~ 9
				System.out.println( i + "X" + j + "=" + (i * j));
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
