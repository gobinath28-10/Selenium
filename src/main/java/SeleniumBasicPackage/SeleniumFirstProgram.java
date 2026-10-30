package SeleniumBasicPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SeleniumFirstProgram {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

WebDriver  driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

driver.manage().window().maximize();



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

WebElement name = driver.findElement(By.id("fullname"));
name.sendKeys("XYZ");

Point location= name.getLocation();
System.out.println(location);

int xvaliue = location.getX();
int yvalue = location.getY();

System.out.println(xvaliue);
System.out.println(yvalue);
System.out.println("x =>"+ xvaliue + " Y =>" + yvalue );

WebElement button = driver.findElement(By.cssSelector("input.btn.btn-primary"));

//2. Get the specific CSS property value
String fontSize = button.getCssValue("font-size");
String color = button.getCssValue("color");

System.out.println(fontSize);
System.out.println(color);


TakesScreenshot ts = (TakesScreenshot) driver;

File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File("./Screenshots/image.png");
FileHandler.copy(source, destination);

try {
    org.openqa.selenium.io.FileHandler.copy(source, destination);
    System.out.println("Screenshot captured successfully!");
} catch (java.io.IOException e) {
    System.out.println("Failed to save screenshot: " + e.getMessage());
}

WebElement textform = driver.findElement(By.id("TextForm"));

File source1 = textform.getScreenshotAs(OutputType.FILE);
File destination1 = new File("./Screenshots/image.png");
FileHandler.copy(source1, destination1);

WebElement Ele_acc = driver.findElement(By.className("accordion-button"));
Ele_acc.click();

WebElement fram_ale = driver.findElement(By.id("headingThree"));
fram_ale.click();

WebElement alert = driver.findElement(By.xpath("//a[@href=\"alerts.php\"]"));
alert.click();

WebElement alertbutt = driver.findElement(By.xpath("//button[@onclick=\"showAlert()\"]"));
alertbutt.click();

Thread.sleep(3000);

driver.switchTo().alert().accept();


//WebElement alertbuttcan = driver.findElement(By.xpath("//button[@onclick=\"myDesk()\"]"));
//alertbuttcan.click();

Thread.sleep(3000);

driver.switchTo().alert().dismiss();

WebElement alertbutttext = driver.findElement(By.xpath("//button[@onclick=\"myPromp()\"]"));
alertbutttext.click();

WebDriverWait wai1t = new WebDriverWait(driver, Duration.ofSeconds(10));
wai1t.until(ExpectedConditions.alertIsPresent());

Alert alertmess =driver.switchTo().alert();



String inputVariable = "Hello from Selenium 4!";

alertmess.sendKeys(inputVariable);

Thread.sleep(5000);

alertmess.accept();







//location.



//WebElement mail = driver.findElement(By.xpath(""));
//mail.sendKeys("abcxyz@gmail.com");

//driver.quit();

//td[@class='day' and text()='24']
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

}
