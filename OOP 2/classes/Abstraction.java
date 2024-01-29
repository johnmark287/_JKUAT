abstract class Mobile
{
	abstract void text();

	abstract void call();
}

class Oppo extends Mobile
{
	void text()
	{
		System.out.println("----Texting----");
	}

	// @overide
	void call()
	{
		System.out.println("----Calling----");
	}
}

public class Abstraction
{
	public static void main(String args[])
	{
		Oppo oppo = new Oppo();
		oppo.call();
		oppo.text();

		// Mobile mobile = new Mobile() {
		// 	// @Override
			
		// };
	}
}
