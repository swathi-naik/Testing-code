package retrivealltype;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Read {
	WebDriver driver;
	@Test (dataProvider="WishbookData")
		public void Alltypeexcel(String username,String password) throws Exception{
		    System.setProperty("webdriver.gecko.driver","H:\\Selenium software\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://seller.wishbook.io/#/auth/login");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='loginusername']")).sendKeys(username);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']")).sendKeys(password);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("html/body/div[5]/div/div/div[1]/div[2]/form/button")).click();
		    Assert.assertTrue(driver.getTitle().contains("Dashboard"),"user is not able to login-Invalid credentials");
		    System.out.println("page title verified-user able to login successfully");
		}
			
		
		
	
@DataProvider(name="WishbookData")

public Object[][] passData() throws Exception{
	Alltypeexcel al = new Alltypeexcel("C:\\Users\\MADHUKAR\\workspace\\ddtframework2\\sheet\\dd.xlsx");
	int rows=al.getRowcount(0);
	Object[][]data = new Object [rows][2];
	for(int i=0;i<rows;i++){
		data[i][0]=al.getCelldata(0, 0, i);
		data[i][1]=al.getCelldata(0, 1, i);
	}
	return data;
	
	
}

		
	

	

}
