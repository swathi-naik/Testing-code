package projectwishbook;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;


	public  class Base{
		public WebDriver driver;

		@BeforeMethod 
		public void openapplication(){
			System.setProperty("webdriver.gecko.driver","H:\\Selenium software\\Drivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://seller.wishbook.io/#/auth/login");
		}
		
		@AfterMethod
		public void closeapplication(){
			driver.quit();
		}
	}

