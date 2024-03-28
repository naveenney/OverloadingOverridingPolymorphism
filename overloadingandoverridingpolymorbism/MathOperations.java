package overloadingandoverridingpolymorbism;

public class MathOperations {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public double add(double a,double b)
	{
		return a+b;
	}
	public double add(double a,double b,double c)
	{
		return a+b+c;
	}
	
	public int sustract(int a,int b)
	{
		return a-b;
	}
	
	public int substract(int a,int b,int c)
	{
		return a-b-c;
	}
	
	public double substract(double a,double b)
	{
		return a-b;
	}
	
	public double substract(double a,int b)
	{
		return a-b;
	}
	
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public double multiply(double a,double b,double c)
	{
		return a*b*c;
	}
	
	public int divide(int a,int b)
	{
		return a*b;
	}
	
	public int divide(int a,int b,int c)
	{
		return (a/b)/c;
	}
	
	public double divide(double a,double b)
	{
		return a/b;
	}
}
