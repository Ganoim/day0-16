package day12;

import java.util.Scanner;

public class MemberJoin {

	public static void main(String[] args) {
		// 회원정보들을 저장할 배열 (회원 5명)
		MemberInfo[] memList = new MemberInfo[5];
		// 회원가입
		// 1. 가입 정보를 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디입력>>");
		String inputMid = scan.next();
		System.out.print("비밀번호입력>>");
		String inputMpw = scan.next();
		System.out.print("이름입력>>");
		String inputMname = scan.next();
		System.out.print("전화번호입력>>");
		String inputMphone = scan.next();
		
		// 2. 입력된 정보를 MemberInfo의 객체에 저장
/*		MemberInfo mem01 = new MemberInfo();
		mem01.setMid(inputMid);		 // mid 필드에 입력한 아이디 저장
		mem01.setMpw(inputMpw);
		mem01.setMname(inputMname);
		mem01.setMphone(inputMphone); */
		
		MemberInfo mem01 = new MemberInfo(inputMid, inputMpw, inputMname, inputMphone);
		
		// 3. memList배열에 0번인덱스에 저장
		memList[0] = mem01; //같은 타입으로 저장(MemberInfo-클래스타입)
		
		// 4. memList배열의 0번인덱스에 있는 회원 정보 출력
		System.out.println("아이디 : "+ memList[0].getMid());
		System.out.println("비밀번호 : "+ memList[0].getMpw());
		System.out.println("이름 : "+ memList[0].getMname());
		System.out.println("전화번호 : "+ memList[0].getMphone());
		
		// 5. 2번 회원 가입 >> 가입할 아이디 >> 중복확인
		System.out.print("가입할 아이디>>");
		inputMid = scan.next(); // 2번 회원아이디
		boolean idCheck = true; // 
		for(int i = 0; i < memList.length; i++) {
			if( memList[i] != null) { // memList배열의 0번인덱스값만 넣었기 때문에 1~5번까지에 값은 null값이여서 이코드를 넣지 않으면 오류가 난다
				if(inputMid.equals( memList[i].getMid()) ) { // 2번 회원의 아이디와 기존 회원에 아이디비교(String(문자)타입은 equals로 비교한다)
					// 
					idCheck = false;
				} 
			}
		}
		if(idCheck) { // idCheck = true 일때
			System.out.println("사용 가능한 아디디 입니다.");
		}else { // idCheck = false 일때
			System.out.println("중복된 아이디 입니다.");
		}
		
		
		
		

	}

}
