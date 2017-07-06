package practice;

public class OpenBrowser {
	
	static String browser= "IE";
public static void main(String[] args) {
	
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.out.println("Chrome is opened");
	}else if(browser.equalsIgnoreCase("IE")){
		System.out.println("IE is opened");		
	}else{
		System.out.println("Firefox is opened");
	}
	
}
}
