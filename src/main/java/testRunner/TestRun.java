package testRunner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import properties.FileReadMan;
import properties.Instance;


@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\yuvasri_revision\\TheNinjaStores\\src\\main\\java\\features\\Ninjas.feature",
				glue="stepDef")

public class TestRun {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() throws IOException {
		driver=new ChromeDriver();
		driver.get(Instance.getInsta().getUrl());
		
	}

}
