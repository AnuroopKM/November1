package Controlstatements;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Areas ob=new Areas();
ob.circle();
int ans=ob.rectangle(4,3);
System.out.println("Area of rectangle: "+ans);
ob.square(4);
double tria=ob.triangle();
System.out.println("Area of triangle: "+tria);
	}
public void circle() 
{
	double pi=3.14;
	int r=3;
	double area=pi*r*r;
	System.out.println("Area of circle: "+area);
}
public int rectangle(int a,int b)
{
	int rect=a*b;
	return rect;
}
public void square(int d)
{
	double sq=d*d;
	System.out.println("Area of square: "+sq);
	
	
}
public double triangle()
{
	int b=3,h=5;
	double tri=0.5*b*h;
	return tri;
}
}
