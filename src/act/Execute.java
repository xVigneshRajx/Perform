package act;

import java.awt.AWTException;



public class Execute extends Base{

	public static void main(String[] args) throws InterruptedException, AWTException {
		openBrowser();
		maxWindow();
		webSite("https://rahulshettyacademy.com/angularpractice/");
		textInput("(//input[@name='name'])[1]");
		
		
		
		
	}

}
