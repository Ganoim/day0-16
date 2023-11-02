package day16;

public class Parent {
	String ParenField;
	
	protected String protectedField; // protected: 상속을 받으면다른 패키지에서도 사용가능
	String defaultField;			 //다른 패키지에서 사용X		
	
	void parentMethod() {
		System.out.println("부모클래스에 정의된 parentMethod()");
		
	}
	
	int testMethod() {
		System.out.println("testMethod() 호출");
		return 1;
	}
	
	
	
	

}
