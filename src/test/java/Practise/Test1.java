package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void run() {
		WebDriver driver=null;
		System.out.println("ready to run");
		String browserName = System.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
		 driver= WebDriverManager.chromedriver().create();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}else {
			driver=WebDriverManager.firefoxdriver().create();
		}
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}
	
	@Test
	public void startToRun()
	{
		System.out.println("Started to run");
	}

}
