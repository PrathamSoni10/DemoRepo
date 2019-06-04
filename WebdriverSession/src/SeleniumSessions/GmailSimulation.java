package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSimulation {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pratham.soniten@gmail.com");
		driver.findElement(By.xpath("//content[@class='CwaK9']//child::span")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("itsGmail@143");
		driver.findElement(By.xpath("//content[@class='CwaK9']//child::span")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]]"));

	}

}
