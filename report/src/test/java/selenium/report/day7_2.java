package selenium.report;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day7_2{
	
	int a=100,b=10;
	
  @Test(priority = 1)
  public void add() {
	  int sum=a+b;
	  Assert.assertEquals(sum,110);
  }
  
  @Test(priority = 2)
  public void subtract() {
	  int sub=a-b;
	  Assert.assertEquals(sub, 90);
  }
  
  @Test(priority = 3)
  public void mutiply() {
	  int product=a*b;
	  Assert.assertEquals(product, 1000);
  }
  
  @Test(priority = 4)
  public void divide() {
	  int div=a/b;
	  Assert.assertEquals(div, 10);
  }
}
