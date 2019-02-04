package util;

public class Dolar {
	public static double IOF = 0.06;

	public  double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.06);
//		double result = amount * dollarPrice ;
//		result +=(result*0.06);
//		return result;
	}

}
