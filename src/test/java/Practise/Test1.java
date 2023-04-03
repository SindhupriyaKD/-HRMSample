package Practise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void run() {
		System.out.println("ready to run");
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com/");
		driver.quit();

	}
	
	@Test
	public void startToRun()
	{
		System.out.println("Started to run");
	}

}
