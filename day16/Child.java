package day16;

public class Child extends Parent { //extends Parent - Parent클래스를 상속
	String childVal;
	
	
	void childMethod() {
		System.out.println(protectedField);
		System.out.println(defaultField);
		
		System.out.println(childVal);
	}
	
	@Override // 재정의된 메소드를 구분(재정의된 메소드만 사용가능)-코드에 붙이는 주석같은 용도
	void parentMethod() { //재정의
		System.out.println("자식클래스에서 재정의된 parentMethod()");
		
	}
	
	int testMethod(int number) { //재정의X overloading
		System.out.println("testMethod() 호출");
		return + 1;
	}
	
	
	
	
	
}
