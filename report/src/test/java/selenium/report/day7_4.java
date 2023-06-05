package selenium.report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_4 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
  @Test
  public void main() throws InterruptedException {
	  Thread.sleep(3000);
	  
	  String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle,driver.getTitle(), "Login page is not loaded successfully.");
  }
  @Test(dependsOnMethods="main")
  public void main2() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement user= driver.findElement(By.name("username"));
	  user.sendKeys("Admin");
	  WebElement pass=driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
  }
}