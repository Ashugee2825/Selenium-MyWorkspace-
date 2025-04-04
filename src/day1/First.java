package day1; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class First { 
public static void main(String[] args) { 
System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.WIN-3SAVIGLT5C9\\Downloads\\driver\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); 
String baseUrl = "https://www.cdac.in/"; 
String expectedTitle = "C-DAC"; 
String actualTitle = ""; 
driver.get(baseUrl); 
actualTitle = driver.getTitle(); 
if (actualTitle.contentEquals(expectedTitle)){ 
System.out.println("Test Passed!"); 
} else { 
System.out.println("Test Failed"); 
} 

driver.close(); 
} 
}