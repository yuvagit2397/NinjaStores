package pom;

import org.openqa.selenium.WebDriver;

public class PageOM {
	public static WebDriver driver;
	public PageOM(WebDriver ndriver) {
		this.driver=ndriver;
	}
	private static ElementPage ep;
	
	public static ElementPage getep() {
		ep=new ElementPage(driver);
		return ep;
	}

}
