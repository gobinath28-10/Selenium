package SeleniumBasicPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PromptAlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");

        // 1. Trigger the prompt alert
        driver.findElement(By.id("prompt")).click();

        // 2. Explicitly wait until the alert is present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // 3. Optional: Get text from the prompt
        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);

        // 4. Send keys to the input field and accept (Click "OK")
        alert.sendKeys("Selenium Automation");
        Thread.sleep(5000);
        alert.accept();

       // driver.quit();
    }
}
   