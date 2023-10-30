public class polymorphism {
    public void print()
	{
		System.out.println("Print.");

	}

	public void config()
	{
		System.out.println("Congrats.");
	}

	/**
	 * Innerpolymorphism
	 */
	public class Innerpolymorphism extends polymorphism
	{
		@Override
		public void print()
		{
			System.out.println("Print overide.");
		}
	}
}

