package day16;

public class Developer extends Person {
	String langType;
	String company;
	
	
	public Developer(String name, int age, String addr, String langType, String company) {
		super(name, age, addr);
//		this.name = name;
//		this.age = age;
//		this.addr = addr;
		this.langType = langType;
		this.company = company;
	}
	
	public Developer() {
		
	}

	public void myJob() {
		System.out.println("나는 Developer입니다.");
	}
	
	
	
	

}
