package day1;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Nine {
 
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.WIN-3SAVIGLT5C9\\Downloads\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");		
				
		driver.manage().window().maximize();
		
		 //Switching to the iframe as the button is inside an iframe
		 driver.switchTo().frame("iframeResult");
		
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();  
		
		 //Switching to Alert window
		 Alert AlertBox  = driver.switchTo().alert();
		
		 //Getting alert text message
		 String alertText = AlertBox.getText();
		
		 //Cancel alert.It will click on the Cancel button
		 AlertBox.dismiss();   
		         
		        System.out.println("Alert Text: "+alertText);
		        
		     
		     driver.quit();
		 }
		}