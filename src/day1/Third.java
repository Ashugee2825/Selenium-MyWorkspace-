package day1; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Third { 
public static void main(String[] args) { 
// declaration and instantiation of objects/variables 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.WIN-3SAVIGLT5C9\\Downloads\\driver\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); 
String baseUrl = "http://demo.guru99.com/test/login.html"; 
driver.get(baseUrl); 
// Get the WebElement corresponding to the Email Address(TextField) 
WebElement email = driver.findElement(By.id("email")); 
// Get the WebElement corresponding to the Password Field  
WebElement password = driver.findElement(By.name("passwd")); 
email.sendKeys("abcd@gmail.com"); 
password.sendKeys("abcdefghlkjl"); 
System.out.println("Text Field Set"); 
// Deleting values in the text box 
email.clear(); 
password.clear(); 
System.out.println("Text Field Cleared"); 
// Find the submit button 
WebElement login = driver.findElement(By.id("SubmitLogin")); 
// Using click method to submit form 
email.sendKeys("abcd@gmail.com"); 
password.sendKeys("abcdefghlkjl");
login.click(); 
System.out.println("Login Done with Click"); 

 

driver.close();  
} }