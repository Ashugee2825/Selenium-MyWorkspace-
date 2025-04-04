package day1;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
 
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Ten {
 
	
public static void main(String[] args) throws InterruptedException {
    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.WIN-3SAVIGLT5C9\\Downloads\\driver\\chromedriver.exe");
 
        WebDriver driver = new ChromeDriver();
 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 
        driver.navigate().to("https://www.google.com/");
        
        //Maximize the browser window
        driver.manage().window().maximize();
        
        //Printing Browser Title
        
        System.out.println("Browser Title is: "+driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        // Minimize the browser window
        driver.manage().window().setPosition(new Point(0, -1000));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Thread.sleep(3000);
        
        //Maximizing browser after 3 seconds
        
        driver.manage().window().maximize();
     }
}