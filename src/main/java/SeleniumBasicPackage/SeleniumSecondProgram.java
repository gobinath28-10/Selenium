package SeleniumBasicPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class SeleniumSecondProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
WebElement username = driver.findElement(By.id("name"));
	
username.sendKeys("abc");

WebElement alertbutton =  driver.findElement(By.xpath("//button[text()=\" Alerts, Frames & Windows \"]"));
alertbutton.click();

WebElement alert =  driver.findElement(By.xpath("//a[@href=\"alerts.php\"]"));
alert.click();

Thread.sleep(3000);
	
WebElement clickbutt =  driver.findElement(By.xpath("//button[@onclick=\"myDesk()\"]"));
clickbutt.click();

Thread.sleep(2000);

driver.switchTo().alert().dismiss();

WebElement textele =  driver.findElement(By.xpath("//button[@onclick=\"myPromp()\"]"));
textele.click();

Alert alert1 = driver.switchTo().alert();

alert1.sendKeys("Hi");

Thread.sleep(4000);

alert1.accept();


	
	
	}

}
