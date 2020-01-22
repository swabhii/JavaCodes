import java.util.*;
class Shape{
	int s;

}
abstract class Shape2D extends Shape{
	void calculateArea();
	void calculatePerimeter();

}
abstract class Shape3D extends Shape{
	void calculateArea();
	void calculateVolume();

}
class Square extends Shape2D{
	void calculateArea(int s)
	{

	}
	void calculatePerimeter(int s)
	{

	}
}
class Rectangle extends Shape2D{
	void calculateArea(int l,int b)
	{

	}
	void calculatePerimeter(int l, int b)
	{
		
	}

}
 class Circle extends Shape2D{
 	void calculateArea(float r)
	{

	}
	void calculatePerimeter(float r)
	{
		
	}

}
class Sphere extends Shape3D{
	void calculateArea(float r)
	{

	}
	void calculateVolume(float r)
	{

	}
}

class Inheritance
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Shape s1=new Shape();
		int side=s.nextInt();
		s.calculatePerimeter(side);



	}
}