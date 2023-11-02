package day10;

public class MyInfo {
	String name;  // 이름
	int age;	  // 나이
	
	private String phone1; // 전화번호 - 접근제어(private)
	String phone2;		   // 전화번호
	
	void printMyInfo() { // 내정보출력
		System.out.println("내정보출력");
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}
	
	
	
}
