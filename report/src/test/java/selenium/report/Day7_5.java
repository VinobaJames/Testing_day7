package selenium.report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_5 {
	WebDriver driver;
      @Test(groups= {"SmokeTest"})
  public void SmokeTest() throws InterruptedException{
	  driver =new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  String Expected_url=driver.getCurrentUrl();
	  Assert.assertEquals(Expected_url, driver.getCurrentUrl());
	  String Expected_title=driver.getTitle();
	  Assert.assertEquals(Expected_title,driver.getTitle());
	  driver.close();
	  
  }
      @Test(groups= {"RegressionTest"})
      public void RegressionTestCase() throws InterruptedException{
    	  WebDriverManager.edgedriver().setup();
    	  driver =new EdgeDriver();
    	  driver.get("https://www.godaddy.com/");
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
    	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
    	  
    	  
    	  
    	  
      }
}