package day12;

public class Ex02_Member {
	private String id; // 아이디
	private String pw; // 비밀번호
	
	public Ex02_Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() { //get 정보를 가져옴
		return this.id;
	}
	
	public void setId(String id) { // set 정보저장
		this.id = id;
	}
	
	//source - Generate get and set
	public String getPw() { 
		return pw;
	}

	public void setPw(String pw) {
//		if(pw.length() > 4) { // length-글자수(pw글자수 제한)
//		}
		this.pw = pw;
	}
	
	
	
	
	
	
	
	

}
