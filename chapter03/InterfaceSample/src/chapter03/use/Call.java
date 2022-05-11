package chapter03.use;

import chapter03.used.AddCalc;
import chapter03.used.Calculator;
import chapter03.used.SubCalc;
/**
* Check the interface dependency
*/
public class Call {
	public static void main(String[] args) {
		Calculator calculator = new AddCalc();
		Integer result = calculator.calc(10, 5);
		System.out.println("計算結果は「" + result + "」 です。 ");
		calculator = new SubCalc();
		result = calculator.calc(10,5);
		System.out.println("計算結果は「" + result + "」 です。 ");
	}
}