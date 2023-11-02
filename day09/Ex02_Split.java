package day09;

public class Ex02_Split {

	public static void main(String[] args) {
		/* Split */
		String[] menuList = {"아메리카노:2000", "바닐라라떼:3500", "아이스티:3000"};
		
		String[] menuInfo = menuList[0].split(":");
		String menuName = menuInfo[0];
		String menuPrice = menuInfo[1];
		int price = Integer.parseInt(menuPrice); // "2000" >> 2000 (문자를 숫자로 바꿔줌)
		
		System.out.println(menuList[0]);
		
		System.out.println("메뉴명: "+ menuName);
		System.out.println("가격: "+ price);
		
		String strVel = "010-1234-5678"; // "010", "1234", "5678"
		String[] splitResult = strVel.split("-");
		System.out.println(splitResult[0]);
		System.out.println(splitResult[1]);
		System.out.println(splitResult[2]);
		
		

	}

}
