package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Six {
public static void main(String[] args) {
String baseUrl = "http://www.facebook.com/";
System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.WIN-3SAVIGLT5C9\\Downloads\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(baseUrl);
WebElement txtUsername = driver.findElement(By.id("email"));
Actions builder = new Actions(driver);
Action seriesOfActions = builder
.moveToElement(txtUsername)
.click()
.keyDown(txtUsername, Keys.SHIFT)
.sendKeys(txtUsername, "hello")
.keyUp(txtUsername, Keys.SHIFT)
.doubleClick(txtUsername)
.contextClick()
.build();
seriesOfActions.perform() ;
driver.close();
}
}