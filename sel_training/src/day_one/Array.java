package src.day_one;

import org.apache.xpath.operations.String;

public class Array {
	
	
	

public static void main(String[] array) {
		String [] Ani= {"tigar","Lion", "Leapord"};
		System.out.println(Ani.length);
		 print_Ani(Ani);
		

	}
	public static void print_Ani(String[] sarray){
		
		for(int i=0;i<3;i++){
			System.out.println(sarray[i]);
			
		}
	}

}
