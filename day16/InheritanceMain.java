package day16;

public class InheritanceMain {

	public static void main(String[] args) {
		Parent prt = new Parent();
		prt.parentMethod();
		
		Child chd = new Child();
		chd.ParenField = "";
		chd.parentMethod();
		
		
		ParentClass parent = new ParentClass(); //ParentClass에 int와 String타입에 매개변수 2개를 만들어주었기 때문에 똑같이 매개변수를 넣어줘야 에러가 안남    
		ChildClass Child = new ChildClass();
		
		
	}

}
