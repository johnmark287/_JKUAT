class Calculator
{
	/**
	 * properties
	 * methods
	*/
	public int add(int a, int b)
	{
		int sum;

		sum = a + b;
		return (sum);
	}
	public int sub(int a, int b)
	{
		int sub;
		
		sub = a - b;
		return (sub);
	}
}

/**
 *  AdvCalc
 */
class  AdvCalc extends Calculator{
	public int multi(int a, int b)
	{
		return (a * b);
	}
	public int _pow(int a, int b)
	{
		return (a * b);
	}
}

public class Demo
{
	public static void main(String s[])
	{
		int x;
		int y;
		int result;

		x = 2;
		y = 5;
		// Calculator calc;
		
		// calc = new Calculator();
		// int result;
		
		// result = calc.add(x, y);

		AdvCalc calc = new AdvCalc();

		result = calc.add(x, y);

		System.out.println("Result: " + result);
	}
}
