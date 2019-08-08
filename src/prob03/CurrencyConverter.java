package prob03;

public class CurrencyConverter {
	private static double rate;
	private static double won;
	private static double dollar;

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}

	public static double toDollar(double won) {
		CurrencyConverter.won = won/rate;
		return CurrencyConverter.won;
	}

	public static double toKRW(double dollar) {
		CurrencyConverter.dollar = dollar*rate;
		return CurrencyConverter.dollar;
	}
	
	
}
