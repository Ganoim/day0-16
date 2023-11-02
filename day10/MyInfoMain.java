package day10;

public class MyInfoMain {

	public static void main(String[] args) {
		int score = 100;
		System.out.println(score);
		
		String str = "B";
		System.out.println(str);
		
//		MyInfo info01 = new MyInfo의생성자() - 생성자는 클래스 이름과 동일
		MyInfo info01 = new MyInfo();
//		info01의 필드값 사용
		System.out.println(info01.name);
		System.out.println(info01.age);
//		info01의 printMyInfo() 호출
		info01.printMyInfo();
		
		
		
		
		System.out.println("필드값 저장");
//		info01의 name필드에 이름 저장
		info01.name = "전관호";
		System.out.println(info01.name);
//		info01의 name필드에 나이 저장
		info01.age = 23;
		System.out.println(info01.age);
		info01.printMyInfo();
		
		System.out.println();
		MyInfo info02 = new MyInfo();
		info01.printMyInfo();
		info02.printMyInfo();
		
		
		
	}

}
