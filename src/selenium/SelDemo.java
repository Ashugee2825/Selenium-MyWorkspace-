package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemo {
	
	public static void main(String[] args) {
		// Set the path to chromedriver.exe if it's not in your system's PATH
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		 
		// Create a WebDriver instance
		WebDriver driver = new ChromeDriver();

	// Now you can use 'driver' to interact with the browser
		driver.get("https:iamsandesh23.github.io/selenium.github.io/");
	//	driver.manage().window().
		
		
		
		
	}
     
}  
  
