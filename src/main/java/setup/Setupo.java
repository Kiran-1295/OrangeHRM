package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;

public class Setupo {

	public WebDriver hr;
	@BeforeTest
	   public void OpenBrowser() {
	    	
		    EdgeOptions edgeOptions = new EdgeOptions();
	        edgeOptions.addArguments("-inprivate");
	        hr=new EdgeDriver(edgeOptions);
		
			hr.manage().window().maximize();
	    	hr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	
	   }
	
}
