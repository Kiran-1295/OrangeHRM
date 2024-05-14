package TestCases;

import org.testng.annotations.Test;

import Page.LoginPage;
import setup.Setupo;

public class Login extends Setupo{

	@Test
	public void login () {
	
	LoginPage op=new LoginPage(hr);
	
	     op.user();
	     op.password();
	     op.LoginButton();
	     op.Myinfo();
	
	
	}
}
