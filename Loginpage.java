package projectwishbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Loginpage extends  Base {
	
	WebDriver driver;
	
	@Test (dataProvider="WishbookData")
		public void Excelddt(String username,String password) throws Exception{
		
			driver.findElement(By.xpath(".//*[@id='loginusername']")).sendKeys(username);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']")).sendKeys(password);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("html/body/div[5]/div/div/div[1]/div[2]/form/button")).click();
		    String url=driver.getCurrentUrl();
		    System.out.println(url);
		    
		    Assert.assertTrue(driver.getCurrentUrl().contains("https://seller.wishbook.io/#/auth/login"),"user is not able to login-Invalid credentials");
		    System.out.println("page title verified-user able to login successfully");
		}
		
		
	
@DataProvider(name="WishbookData")

public Object[][] passData() throws Exception{
    Excelddt al = new Excelddt("C:\\Users\\MADHUKAR\\workspace\\wishbooknew\\wishbookdata\\data.xlsx");
	int rows=al.getRowcount(0);
	Object[][]data = new Object [rows][2];
	for(int i=0;i<rows;i++){
		data[i][0]=al.getCelldata(0, 0, i);
		data[i][1]=al.getCelldata(0, 1, i);
	}
	return data;
	
	
}



}
