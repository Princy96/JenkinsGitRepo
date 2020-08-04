package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/
import org.testng.annotations.Test;

public class SmokeTest {
	@Test
	public void loginTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\jar\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
		driver.get("http:\\rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='signin_info']/a[1]"))).click();
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		Thread.sleep(5000);
		
		//driver.quit();
	}

}
