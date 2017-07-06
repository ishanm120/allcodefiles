package testNG_framework;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.testng.annotations.Test;

public class ScreenSize {
	
	@Test
	void screensize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
	System.out.println(width);
	System.out.println(height);
	}

}
