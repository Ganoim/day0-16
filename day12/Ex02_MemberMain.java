package day12;

public class Ex02_MemberMain {

	public static void main(String[] args) {
		Ex02_Member memInfo = new Ex02_Member("jgh", "1111");
//		System.out.println(memInfo.id );
//		memInfo.id = "jgh1111";
		String myId = memInfo.getId();
		System.out.println(myId);
		memInfo.setId("jgh1111");
		
		
		
		
		
		

	}

}
