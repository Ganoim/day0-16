package day11;

public class Ex01_ConstructorMain {

	public static void main(String[] args) {
		Ex01_Constructor obj01 = new Ex01_Constructor();
		System.out.println(obj01.name);
		System.out.println(obj01.number);
		
		// 매개변수가 1개인 생성자로 ovj02로 생성
		Ex01_Constructor obj02 = new Ex01_Constructor(10);
		
		// 매개변수가 2개인 생성자로 ovj03로 생성
		Ex01_Constructor obj03 = new Ex01_Constructor(100, 20);
		
//		Ex01_Constructor obj04 = new Ex01_Constructor(100, "ABC");
		
	}

}
