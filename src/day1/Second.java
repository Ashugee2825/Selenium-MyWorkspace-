package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Second {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.WIN-3SAVIGLT5C9\\Downloads\\pr\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form");
driver.findElement(By.id("firstName"));
System.out.println("ELEMENT LOCATED");
driver.get("https://demoqa.com/automation-practice-form");
System.out.println("Test Passed!");
driver.findElement(By.name("gender"));
System.out.println("Test Passed!");
driver.get("https://demoqa.com/automation-practice-form");
driver.findElement(By.className("practice-form-wrapper"));
System.out.println("Test Passed!");
driver.get("https://demoqa.com/links");
driver.findElement(By.linkText("Home"));
System.out.println("Test Passed!");
driver.get("https://demoqa.com/text-box");
driver.findElement(By.xpath("//input[@id='userName']"));
System.out.println("Test Passed!");
driver.close();
}}