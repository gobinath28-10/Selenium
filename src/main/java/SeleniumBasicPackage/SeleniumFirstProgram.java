package SeleniumBasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
WebDriver  driver = new ChromeDriver();
driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

String tittle =  driver.getTitle();
System.out.println(tittle);
String originaltittle = "Selenium Practice - Student Registration Form";

Assert.assertEquals(tittle, originaltittle,"Selenium Practice - Student Registration Form");

WebElement firstname =driver.findElement(By.id("name"));

 firstname.sendKeys("abc");   

String value="abc";

//Assert.assertEquals(firstname,value, "abc");

WebElement email =driver.findElement(By.name("email"));

email.clear();

email.sendKeys("testemail@gmail.com");

WebElement malebutt =driver.findElement(By.name("gender"));

 boolean beforeclick = malebutt.isDisplayed();
//malebutt.click();

boolean answer=malebutt.isDisplayed();

System.out.println(beforeclick);

boolean enable=malebutt.isSelected();

//System.out.println(enable);


Assert.assertEquals(enable, true);

//driver.quit();


	}

}
