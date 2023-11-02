package day14;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneService phoneSvc = new PhoneService();
		
		boolean run = true;
		while(run) { // while 시작
			//메뉴출력기능 호출
			phoneSvc.showMenu();
			int selecMenu = phoneSvc.scan.nextInt();
			switch(selecMenu) { // switch 시작
			case 1:
				phoneSvc.registInfo();
				break;
			case 2:
				phoneSvc.searchInfo();
				break;
			case 3:
				phoneSvc.modifyInfo();
				break;
			case 4:
				phoneSvc.deleteInfo();
				break;
			default:
				System.out.println("메뉴를 잘못선택했습니다.");
			}
			
		}
		
		
		
		
		

	}

}
