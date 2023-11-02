package day16;

public class PersonMain {

	public static void main(String[] args) {
		
//		Person person = new Person("전관호", 23, "인천");
		Person person = new Person();
		person.name = "전관호";
		person.age = 23;
		person.addr = "인천";
		
//		Student stu = new Student("전관호", 23, "인천", "인하공전", "정보통신과");
		Student stu = new Student();
		stu.name = "전관호";
		stu.age = 23;
		stu.addr = "인천";
		stu.univName = "인하공전";
		stu.major = "정보통신과";
		
		Developer dev = new Developer("전관호", 23, "인천", "JAVA", "ICAC");   
		
//		person.myJob();
//		stu.myJob();
//		dev.myJob();
		
		PersonService psvc = new PersonService();
		psvc.choiceType(person);
		psvc.choiceType(stu);
		psvc.choiceType(dev);
		
		
		
		//		Animal animalObj = new Dog()
		Person personSTU = new Student(); //Person(부모클래스)에 저장되어 있는 것만 쓸수있다  
//		Student personPER = new Person(); //반대로 자식클래스 타입으로 부모객체 생성자는 만들수없다
		
/*		if (personSTU instanceof Student) {
		
		} */
		Person personDEV = new Developer();
		
		
		
		
		
		
	}

}
