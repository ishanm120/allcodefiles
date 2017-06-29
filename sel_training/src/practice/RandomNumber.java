package practice;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rd= new Random();
		int i= rd.nextInt(500);
		System.out.println(i);
		
		System.out.println("ishan"+i+"@gmail.com");
		
	}

}
