class Calculator
{
    //final variable - becomes constant value.
    public final double pie = 3.142;

    public final int sum(int a, int b)
    {
        return (a + b);
    }
}
class AdvCalculator extends Calculator
{
    //can't overide a "final" function.
    @Override
    public final int sum(int a, int b)
    {
        return (a + b);
    }
}
public class KeywordFinal
{
	public static void main(String[] args) {
        
    }
}
