package day_one;

public class Array_Qa {

	public static void main(String[] args) {
		String [] Qa= {"ishan","Nalin", "Himanshu", "Kuldip", "Rathin", "Nistha", "Palak"};
		
		 print_Ani(Qa);
		

	}
	public static void print_Ani(String[] sarray){
		
		for(int i=sarray.length-1;i>=0;i--){
			System.out.println(sarray[i]);
			
		}
	}

	}


