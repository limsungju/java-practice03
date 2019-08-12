package prob06_1;

public abstract class Arith {
	protected int lvalue;
	protected int rvalue;
	protected int Value;
	
	public void SetValue(int lvalue, int rvalue) {
		this.lvalue = lvalue;
		this.rvalue = rvalue;
	}
	
	public abstract int calculate();

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
