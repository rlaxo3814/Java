package mc.sn.day7review;//패키지

import java.util.Scanner;//임폴트

public class BankApplication2 {//클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test()호출하는 코드 작성하시오
		BankApplication ba = new BankApplication();
				ba.test();
	}
	
	//openBank라는 식별자의 기본 메소드를 생성하세요
	public void openBank() {
		System.out.println("은행업무를 시작합니다.");
		
		//입금1,출금2,조회3,계좌생성4
		boolean isClosed = false;
		//키보드와 연결하는 코드 작성
		Scanner scan = new Scanner(System.in);
		while(!isClosed) {
			String command = scan.nextLine();
			//종료가 입력되면 반복문을 빠져나가는 코드 작성
			if(command.equals("5")) {
				isClosed = true;
			}else if(command.equals("1")) {
				this.deposit(scan);
			}else if(command.equals("2")) {
					this.withdraw(scan);
			}else if(command.equals("3")) {
					this.accountList();
			}else if(command.equals("4")) {
				this.createAccount(scan);
			}
			//키보드와 연결종료하는 코드 작성
		}
			scan.close();
	}
		
	//입금,출금,조회,계좌생성 작업을 하는 메소드 생성하시오
	public void deposit(Scanner scan) {
		
	}
	public void withdraw(Scanner scan) {
		
	}
	public void accountList() {
		
	}
	public void createAccount(Scanner scan) {
		
	}
	private Account findAccount(String ano) {
	Account result = null;
	//리턴타입과 짝이되는 코드 작성하시오
		return result;
	}
	
	//test라는 식별자의 기본 메소드를 생성하세요
	public void test() {
		//Account클래스를 인스턴스를 만들고 값을 셋팅하는 작업
		//1.인스턴스가 생성되는 동시에 값 셋팅
		Account kim = new Account(10000,"kim","0001");
		//2.인스턴스가 생성되고 난 후에 값 셋팅
		Account lee = new Account();
		lee.setAno("0002");
		lee.setOwner("lee");
		lee.setBalance(10000);
		System.out.println(kim);
		System.out.println(lee);
	}
}
