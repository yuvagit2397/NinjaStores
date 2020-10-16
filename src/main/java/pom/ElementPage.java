package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ElementPage {
	
	public static WebDriver driver;
	
	public ElementPage(WebDriver edriver) {
		this.driver=edriver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	

}
