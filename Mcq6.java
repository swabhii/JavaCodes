class Point
{
	protected int x,y;
	public Point(int _x,int _y)
	{
	x=_x;
	y=_y;
	}
}
public class Mcq6
{
	public static void main(String args[])
	{
	Point p=new Point();
	System.out.println("x="+p.x+"y="+p.y);
	}
}

//no constructor-default will work
//but if we have specified parameterised constructor, we need to specify default constructor or we cannot use default constructor directly, because in case no constructor is specified default will work automatically		