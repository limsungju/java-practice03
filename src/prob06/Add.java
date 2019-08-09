package prob06;

public class Add {

	private int lvalue;
	private int rvalue;
	private int Value;

	public void setValue(int lvalue, int rvalue) {
		this.lvalue = lvalue;
		this.rvalue = rvalue;
	}

	public int calculate() {
		this.Value = this.lvalue + this.rvalue;
		return this.Value;
	}

	public int getLvalue() {
		return lvalue;
	}

	public void setLvalue(int lvalue) {
		this.lvalue = lvalue;
	}

	public int getRvalue() {
		return rvalue;
	}

	public void setRvalue(int rvalue) {
		this.rvalue = rvalue;
	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}

}
