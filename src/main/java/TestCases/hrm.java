package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import setup.Setupo;

public class hrm extends Setupo{


	@Test
	public void elements() throws InterruptedException {
		

		Thread.sleep(4000);
		
	//	hr.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
	//	hr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		hr.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
		
		
		hr.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
		hr.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
	
		hr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();
		
     	Thread.sleep(2000);
     //   hr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")).sendKeys("AMAN");
		
	//	hr.findElement(By.xpath("//*[@name=\"firstName\"]")).click();
		Thread.sleep(2000);
	//	hr.findElement(By.xpath("//input[@name=\"firstName\"]")).clear();
		WebElement as= hr.findElement(By.xpath("//*[@name=\"firstName\"]"));
		as.click();
		
		as.clear();
		Thread.sleep(2000);
		as.sendKeys("AMAN");
		
	  //  hr.findElement(By.xpath("//input[@name=\"middleName\"]")).clear();
		hr.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("VIJAY");
		
		hr.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("SHARMA");
		Thread.sleep(2000);
	   
		hr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("iaeifn");
		hr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("111111");
		
		
		
	}
	
	
}
