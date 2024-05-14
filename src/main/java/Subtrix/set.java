package Subtrix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class set {

	
	@Test
	public void OpenBrowser() 
	{
		
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver ss = new ChromeDriver(options);
		ss.manage().window().maximize();
		
		ss.get("https://www.dev.subtrix.com/");
	
		
		ss.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/nav/div/div[2]/ul/li/div/button")).click(); 
     	ss.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/section/div/div/div[4]/div[3]/span")).click();
		ss.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("Viraj");
		ss.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys("Jadhav");
		
		ss.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("Viraj123");
		ss.findElement(By.xpath("//*[@placeholder=\"Email Address\"]")).sendKeys("virenj002@gmail.com");
		ss.findElement(By.xpath("//*[@placeholder=\"Password\"]")).sendKeys("Viraj12@");
		ss.findElement(By.xpath("//*[@placeholder=\"Confirm Password\"]")).sendKeys("Viraj12@");
		ss.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
		ss.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/section/div/div/div/button")).click();
		
		
		
		
		
		
		
		
		
		
	}
	
}
