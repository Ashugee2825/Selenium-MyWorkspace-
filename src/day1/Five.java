package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class Five {
public static void main(String[] args) {  
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.WIN-3SAVIGLT5C9\\Downloads\\driver\\chromedriver.exe");
String baseURL = "http://demo.guru99.com/test/newtours/register.php";  
WebDriver driver = new ChromeDriver();
driver.get(baseURL);
Select drpCountry = new Select(driver.findElement(By.name("country")));
drpCountry.selectByVisibleText("ANTARCTICA");
System.out.println("Test Passed!");
 
driver.get("http://jsbin.com/osebed/2");
Select fruits = new Select(driver.findElement(By.id("fruits")));
fruits.selectByVisibleText("Banana");
fruits.selectByIndex(1);
System.out.println("Test Passed!");
driver.close();
}
}