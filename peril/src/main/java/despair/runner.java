package despair;

public class runner {

	public static void main(String[] args) {
		CalcInterface add = (num1, num2) -> num1 + num2;
		System.out.println(add.calc(12, 34));

		CalcInterface minus = (num1, num2) -> num1 - num2;
		System.out.println(minus.calc(5, 3));

		CalcInterface divide = (num1, num2) -> num1 / num2;
		System.out.println(divide.calc(4, 13));

		CalcInterface multiply = (num1, num2) -> num1 * num2;
		System.out.println(multiply.calc(9, 4));
	}

}
