package day15;

import java.util.ArrayList;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("A"); // 0번 인덱스에 "A"를 저장
		strList.add("B"); // 1번 인덱스에 "B"를 저장
		strList.add("C"); // 2번 인덱스에 "C"를 저장
		System.out.println("0번인덱스 : " + strList.get(0)); // get(0) 인덱스에 저장된 데이터를 가져오는것
		System.out.println("1번인덱스 : " + strList.get(1));
		System.out.println("2번인덱스 : " + strList.get(2));
		System.out.println("size : " + strList.size()); // size-저장되어있는 인덱스 개수
		
		strList.add(1, "D");
		System.out.println("size : " + strList.size()); 
		System.out.println("0번인덱스 : " + strList.get(0));
		System.out.println("1번인덱스 : " + strList.get(1));
		System.out.println("2번인덱스 : " + strList.get(2));
		System.out.println("3번인덱스 : " + strList.get(3));
//		System.out.println("4번인덱스 : " + strList.get(4));
		
		strList.remove(2);
		System.out.println("size : " + strList.size()); 
		System.out.println("0번인덱스 : " + strList.get(0));
		System.out.println("1번인덱스 : " + strList.get(1));
		System.out.println("2번인덱스 : " + strList.get(2));
		
		strList.remove("D");
		System.out.println("strList.remove(\"d\") 실행 후");
		System.out.println("size : " + strList.size());
		System.out.println("0번인덱스 : " + strList.get(0));
		System.out.println("1번인덱스 : " + strList.get(1));
		
		System.out.println("\nfor문");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(i+"번 인덱스: " + strList.get(i));
		}
		
		
		ArrayList<Member> memList = new ArrayList<Member>();
		Member[] memArr = new Member[5];
		
		System.out.println("ArrayList 시작");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println( memList.get(i).getMid());
		}
		System.out.println("Array 시작");
		for(int i = 0; i < memArr.length; i++) {
			
			System.out.println( memArr[i].getMid() );
		}
		System.out.println("Array 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
