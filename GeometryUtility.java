class Geometry
{
double length;
double breadth;
double radius;

// Default Constructor
Geometry()
{
System.out.println("Geometry Utility Started");
}

// Constructor for Square
Geometry(double side)
{
length = side;
}

// Constructor for Rectangle
Geometry(double l, double b)
{
length = l;
breadth = b;
}

// Constructor for Circle
Geometry(int r)
{
radius = r;
}

// Method Overloading

// Area of Square
void area(double side)
{
System.out.println("Area of Square = " + (side * side));
}

// Area of Rectangle
void area(double l, double b)
{
System.out.println("Area of Rectangle = " + (l * b));
}

// Area of Circle
void area(int r)
{
double area = 3.14 * r * r;
System.out.println("Area of Circle = " + area);
}
}

public class GeometryUtility
{
public static void main(String args[])
{
// Default Constructor
Geometry g1 = new Geometry();

System.out.println();

// Square
Geometry square = new Geometry(5.0);
square.area(5.0);

System.out.println();

// Rectangle
Geometry rectangle = new Geometry(8.0, 4.0);
rectangle.area(8.0, 4.0);

System.out.println();

// Circle
Geometry circle = new Geometry(7);
circle.area(7);
}
}
