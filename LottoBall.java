package mc.sn.lotto;

public class LottoBall {
	private int ballNumber;
	private boolean isSelected;
	
	public LottoBall(int number) {
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
