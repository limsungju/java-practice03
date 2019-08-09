package prob06;

public class Div {
	private int lvalue;
	private int rvalue;
	private int divValue;
	
	public void setValue(int lvalue, int rvalue) {
		this.lvalue = lvalue;
		this.rvalue = rvalue;
	}

	public int calculate() {
		this.divValue = this.lvalue / this.rvalue;
		return this.divValue;
	}
}
