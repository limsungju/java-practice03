package prob06;

public class Sub {
	private int lvalue;
	private int rvalue;
	private int subValue;
	
	public void setValue(int lvalue, int rvalue) {
		this.lvalue = lvalue;
		this.rvalue = rvalue;
	}

	public int calculate() {
		this.subValue = this.lvalue - this.rvalue;
		return this.subValue;
	}
}
