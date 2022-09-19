package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/arun1.html");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1500);
		

	}

}
