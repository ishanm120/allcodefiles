package day_one;

public class Leap {

	public static void main(String[] args) {
		int i= 2100;
		
		if((i%4==0 || i%400==0)&&i%100 !=0){
			System.out.println(i + "is a leap year");
		}
		else
			System.out.println(i + " is not a leap year");

	}

}
