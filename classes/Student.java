/**
 * Modifiers:
 * - Default is only accesible within the class.
 * - public - 
 * - private -
 * - protected-
 * */
class Learner
{
	private String name;
	private int age;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}

	public int setAge(int age)
	{
		this.age = age;
	}
}
public class Student {
    public static void main(String[] args)
	{
		Learner learner = new Learner();
		learner.age = 17;
		learner.name = "mark";

		System.out.println(learner.name + " " + learner.age  + ".");
	}
}
