package selenium.report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_1 {
  @Test
  public void checkTitle() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  driver.manage().window().maximize();
	  String currTitle=driver.getTitle();
	  Assert.assertEquals(currTitle,driver.getTitle());
	  
	  
  }
}