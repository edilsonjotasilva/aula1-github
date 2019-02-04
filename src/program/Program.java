package program;

import util.Calculator;

public class Program {
	public static void main(String[] args) {
		//Calculator calc = new Calculator();
		double c = Calculator.circumference(3);
		double v = Calculator.volume(3);
		System.out.printf("Circunferencia: %.2f%n",c);
		System.out.printf("Volume : %.2f%n",v);
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
	}
}
