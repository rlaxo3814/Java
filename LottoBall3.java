package mc.sn.lottov3;

public class LottoBall3 {
	private int ballNumber;
	private boolean isSelected;
	
	public LottoBall3(int number) {
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
