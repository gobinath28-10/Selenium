package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/");
		
	WebElement username = driver.findElement(By.id("name"));
	
	username.sendKeys("abc");
	
	
	
	}

}
