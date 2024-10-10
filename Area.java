package java10;
import java.util.Scanner;
public class Area {
	void area(float base,float height) {
		float area=0.5f*base*height;
		System.out.println("Area of Triangle is:"+ area);
	}
	void area(int width,int height) {
		int area=width*height;
		System.out.println("Area of Rectangle is:"+area);
	}
	void area(int radius) {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle is:"+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    Area obj=new Area();
	    float b,h;
	    System.out.println("Enter the base of the triangle:");
	    b=sc.nextFloat();
	    System.out.println("Enter the height of the triangle:");
	    h=sc.nextFloat();
	    int w,he;
	    System.out.println("Enter the width of the rectangle:");
	    w=sc.nextInt();
	    System.out.println("Enter the height of the rectangle:");
	    he=sc.nextInt();
	    int r;
	    System.out.println("Enter the radius of the circle:");
	    r=sc.nextInt();
	    obj.area(b,h);
	    obj.area(w,he);
	    obj.area(r);
	    

	}

}
