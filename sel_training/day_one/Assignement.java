package day_one;

public class Assignement {
	static int radius= 3;
	static float pi= 3.14f;
	static float area= pi*radius*radius;
	static float perimeter= 2*pi*radius;

	public static void main(String[] args) {
		
		
		System.out.println("area of cirecle is "+ area + " sq. meter");
		System.out.println("area of cirecle is "+ perimeter + " meter");
		System.out.println("");
		
		radius= 5;
		float area= pi*radius*radius;
		float perimeter= area;
		System.out.println("area of cirecle is "+ area + " sq. meter");
		System.out.println("area of cirecle is "+ perimeter + " meter");
		System.out.println("");
		
		/*float perimeter= area= 50;
		System.out.println("area of cirecle is "+ area + " sq. meter");
		System.out.println("area of cirecle is "+ perimeter + " meter");*/

	}

}
