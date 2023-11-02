package day05;

public class Ex04_for {

	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			// break;(멈춤) continue;(건너뜀)
			// i가 5이면 중지
			if (i == 5) {
				break;
			}
			System.out.println(" i = " + i);
		}
		System.out.println();
		
		for(int i = 1; i < 11; i++) {
			if (i == 5) {
				System.out.println("continue");
				continue;
			}
			System.out.println(" i = " + i);
		}
		
		
		
		

	}

}
