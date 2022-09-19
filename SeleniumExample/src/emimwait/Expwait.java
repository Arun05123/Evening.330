package emimwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expwait {

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 driver.findElement(By.id("email")).sendKeys("arunakumarsn@gmailm.com");
	 driver.findElement(By.id("pass")).sendKeys("hsgdhjsdghj");
	 Thread.sleep(2000);
	 driver.findElement(By.id("loginbutton")).click();
	 

	}

}
