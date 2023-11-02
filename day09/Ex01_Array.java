package day09;

import java.util.Scanner;

public class Ex01_Array {

	public static void main(String[] args) {
		/* 코드를 작성할때 단계별로 따로따로 만드는게 나중에 코드를 수정할때 더 좋다 */
		/* index의 개념알기 */
		Scanner scan = new Scanner(System.in);
		String[] menuList = {"아메리카노", "아이스티", "바닐라라떼"}; // 배열에 메뉴와 가격을 같이 담는방법!
		int[] priceList = {2000, 3500, 3000};
		int totalPrice = 0; 
		int[] orderCount = new int[menuList.length];
//		int size = menuList.length; 
		
		while(true) { //while문 시작
//			System.out.println("[1]아메리카노 [2]바닐라라떼 [3]아이스티");
//			menuList 배열의 모든 값 출력
			for(int i = 0; i < menuList.length; i++) {
				System.out.print("["+(i)+"]"+ menuList[i] + " ");
			}
			System.out.println("["+ menuList.length +"]주문종료");
			
			
			System.out.print("\n메뉴선택>>"); //
			int selectMenu = scan.nextInt(); //menuList[]의 인덱스 번호 입력
			if(selectMenu >= 0 && selectMenu < menuList.length) {
				System.out.println("["+menuList[selectMenu]+"]선택");
				//주문내역 추가
				System.out.println(priceList[selectMenu]+"원 입니다");
				totalPrice = totalPrice + priceList[selectMenu];
				//선택한 메뉴의 주문수 + 1
				orderCount[selectMenu] = orderCount[selectMenu] + 1; 
				
				
			} else if(selectMenu == menuList.length) {
				System.out.println("[주문종료]선택");
				break;
			}
			
			else {
				System.out.println("다시 선택 해주세요!");
			}
			
		}//while문 종료
		//주문내역, 총액
		int totalPrice2 = 0; 
		for(int i = 0; i < menuList.length; i++) {
			if(orderCount[i] > 0) {
				System.out.println("["+menuList[i]+"]"+orderCount[i]+"잔"); //orderCount를 menuList와 배열 수를 맟춰서 한거기 때문에 가능하 코드
				totalPrice2 = totalPrice2 + (priceList[i]*orderCount[i]);
				
			}
		}
		System.out.println("결제할 금액은" + totalPrice + "원 입니다");
		System.out.println("결제할 금액은" + totalPrice2 + "원 입니다");
		
		
		
		
		
		
		
		
	}

}
