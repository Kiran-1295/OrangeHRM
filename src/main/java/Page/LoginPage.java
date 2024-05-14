package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver hr;
	
	public LoginPage (WebDriver hr) 
	{
		this.hr=hr;
	}
	
	public void user() 
	{
		hr.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
	}
	
	public void User(String un) 
	{
		hr.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(un);
	}
	
	public void password() 
	{
		hr.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
	}
	
	public void Pass(String ps) 
	{
		hr.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(ps);
	}
	
	public void LoginButton() 
	{
		hr.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}
	
	public void Myinfo() 
	{
		hr.findElement(By.className("oxd-main-menu-item active")).click();
	}
	
//	public void Login() 
//	{
//		
//	}
//	
//	public void Login() 
//	public void Login() 
//	public void Login() 
//	
}
