package SeleniumBasicPackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SeleniumFirstProgram {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

WebDriver  driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

String title =  driver.getTitle();
System.out.println(title);
String originaltittle = "Selenium Practice - Student Registration Form";

Assert.assertEquals(title, originaltittle,"Selenium Practice - Student Registration Form");

WebElement firstname =driver.findElement(By.id("name"));

 firstname.sendKeys("abc");   

String value="abc";

//Assert.assertEquals(firstname,value, "abc");

WebElement email =driver.findElement(By.name("email"));

email.clear();

email.sendKeys("testemail@gmail.com");

WebElement malebutt =driver.findElement(By.name("gender"));

 boolean beforeclick = malebutt.isDisplayed();
malebutt.click();

boolean answer=malebutt.isDisplayed();

System.out.println(beforeclick);

boolean enable=malebutt.isSelected();

System.out.println(enable);


Assert.assertEquals(enable, true);
WebElement mobileno = driver.findElement(By.xpath("//input[@id='mobile']"));
mobileno.sendKeys("9342513976");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
dob.sendKeys("24-10-2026");

WebElement Sub = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[6]/div/input"));
Sub.sendKeys("english");


WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='hobbies']")));
checkbox.click();

//Navigation 
//driver.navigate().to("https://www.amazon.in/");
//Thread.sleep(2000);
//driver.navigate().back();
//Thread.sleep(5000);
//driver.navigate().forward();
//Thread.sleep(3000);
//driver.navigate().refresh();

WebElement country = driver.findElement(By.id("state"));
Select dropdown = new Select(country);
dropdown.selectByVisibleText("NCR");
dropdown.selectByValue("Haryana");
//dropdown.selectByIndex(2);

WebElement state = driver.findElement(By.id("city"));
Select citydropdown = new Select(state);
citydropdown.selectByVisibleText("Lucknow");
Thread.sleep(2000);
//citydropdown.selectByValue("Agra");

WebElement element = driver.findElement(By.xpath("//button[starts-with(@class,'accordion-button collapsed')][1]"));
element.click();

WebElement text = driver.findElement(By.xpath("//a[@href='text-box.php']"));
text.click();

WebElement name = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/div/input"));
name.sendKeys("XYZ");
//driver.quit();

//td[@class='day' and text()='24']
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

}
