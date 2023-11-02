package day15;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		/*  */
		Member[] memArr = new Member[105];  // 회원목록 배열
		
		Member member01 = new Member();   // 화원정보
		memArr[0] = member01; // 회원정보를 목록의 저장
		
		Member membe02 = new Member();  // 회원정보
		memArr[1] = member01; // 회원정보를 목록의 저장
		
		System.out.println("배별의 크기"); 
		
		
		
		//ArrayList 회원목록
		ArrayList<Member> memList = new ArrayList<Member>();
		System.out.println("1_suze :" + memList.size());
		
		Member mem01 = new Member();
		mem01.setMid("id01");
		mem01.setMpw("pw01");
		// 회원정보를 회원목록 저장
		memList.add(mem01);
		System.out.println("2_suze :" + memList.size());
		
		Member mem02 = new Member();
		mem02.setMid("id02");
		mem02.setMpw("pw02");
		memList.add(mem02);
		System.out.println("3_suze :" + memList.size());
		
		//1번 회원정보 결보출력
		System.out.println(memList.get(0));
		//2번 회원정보 출력
		System.out.println(memList.get(1));
		System.out.println("size : " + memList.size());
		

	}

}
