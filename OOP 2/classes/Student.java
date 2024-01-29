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

	public void setAge(int age)
	{
		this.age = age;
	}
}
public class Student {
    public static void main(String[] args)
	{
		Learner learner = new Learner();
		learner.setAge(17);
		learner.setName("mark");

		System.out.println(learner.getName() + " " + learner.getAge()  + ".");
	}
}
