package mc.sn.day6;

import java.util.Scanner;

public class BankApplication {
	private Account[] accounts;
	
	public BankApplication(int size) {
		accounts =  new Account[size];
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication bank = new BankApplication(10);
		bank.openBank();
		
	}
	
	public void openBank() {
		System.out.println("지금 부터 은행 업무를 시작합니다.");
		boolean isClosed = false;
		Scanner scan = new Scanner(System.in);
		while(!isClosed) {
			this.viewMenu();
			String command = scan.nextLine();
			if(command.equals("5")) {
				isClosed = true;
			}else if (command.equals("1")) {
				
			}else if (command.equals("2")) {
				
			}else if (command.equals("3")) {
				this.deposit();
			}else if (command.equals("4")) {
				
			}
		}
		scan.close();
		System.out.println("오늘 은행업무를 종료합니다");
	}
	public void viewMenu() {
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("1.계좌생성|2.계좌조회|3.계좌입금|4.계좌출금|5.업무종료|");
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("선택 >>>");
	}
	public void deposit() {
		
	}
	public Account findAccount(String ano) {
		
		return null;
	}
}


