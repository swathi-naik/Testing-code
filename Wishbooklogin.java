package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Basepage;

public class Wishbooklogin extends Basepage{

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='account_nameornumber']")
	private WebElement un;
	@FindBy(xpath="//input[@name='account_password']")
	private WebElement pwd;
	@FindBy (xpath=("html/body/div[5]/div/div/div[1]/div[2]/form/button"))
	private WebElement login;
	
	public Wishbooklogin(WebDriver driver){
		super(driver);
	
    PageFactory.initElements(driver, this);
	}
	public void setusername(String un1){
		un.sendKeys(un1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void setpassword(String pwd1){
		pwd.sendKeys(pwd1);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	public void clickLogin() throws InterruptedException
	{
		login.click();
		
		Thread.sleep(5000);
		
	}
	public void verifyurl(String lptitle){
		verifytitle(lptitle);
		
	}
	public void verifyerrmsg(WebElement errmsg){
		verifyelementispresent(errmsg);
	}
		
	}
		


