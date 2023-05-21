package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumCucumberBDD\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
	}

}
