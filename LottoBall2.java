package mc.sn.lotto.v2;

public class LottoBall2 {
	private int ballNumber;
	private boolean isSelected;
	
	public LottoBall2(int number) {
		this.ballNumber = number;
	}
	
	public int getBallNumber() {
		return this.ballNumber;
	}
//	private void setBallNumber(int ballNumber) {
//		this.ballNumber = ballNumber;
//	}
	public boolean getSelected() {
		return this.isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(ballNumber);
	}
}
