package prob06;

public class Mul {
	private int lvalue;
	private int rvalue;
	private int mulValue;
	
	public void setValue(int lvalue, int rvalue) {
		this.lvalue = lvalue;
		this.rvalue = rvalue;
	}

	public int calculate() {
		this.mulValue = this.lvalue * this.rvalue;
		return this.mulValue;
	}
}
