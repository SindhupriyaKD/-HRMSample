package Practise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void running() {
		System.out.println("Running");
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
}
