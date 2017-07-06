package practice;

public class Conversions {

	public static void main(String[] args) {
		String num = "200";
		int i= Integer.parseInt(num);
		System.out.println(i+100);
		System.out.println(num+100);
		
		changetoString();

	}
	
	
	public static void changetoString(){
		int i= 100;
		String sum= String.valueOf(i);
		System.out.println(sum+100);
		System.out.println(i+100);
		
	}

}
