package overloadingandoverridingpolymorbism;

abstract class Shape
{
	abstract double area();
	
	abstract double perimeter();
	
}

class Circle extends Shape
{
	int radius;
	
	Circle(int radius)
	{
		this.radius=radius;
	}
	
	double area()
	{
		return Math.PI*(radius*radius);
	
	}
	
	double perimeter()
	{
		return 2*(Math.PI*radius);
	}
	
}	
	
class Rectangle extends Shape
{
	int length;
	int width;
	
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	double area()
	{
		return length*width; 
	}
	
	double perimeter()
	{
		return 2*(length+width);
	}
	
}

class Square extends Shape
{
	private int area;
	
	public Square(int area)
	{
		this.area=area;
	}
	
	double area()
	{
	   return area*area;	
	}
	
	double perimeter()
	{
		return 4*area;
	}
	
}
public class ShapeHerarchy {
  public static void main(String[] args)
	{
		Shape circle=new Circle(12);
		
		Shape rectangle=new Rectangle(15,10);
		
		Shape square=new Square(12);
		
		System.out.println("CIRCLE AREA:"+circle.area()+"\nCIRCLE PERIMETER:"+circle.perimeter());
		System.out.println("RECTANGLE AREA:"+rectangle.area()+"\nRECTANGLE PERIMETER:"+rectangle.perimeter());
		System.out.println("SQUARE AREA:"+square.area()+"\nSQUARE PERIMETER:"+square.perimeter());
  
  }
}

