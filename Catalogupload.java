package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Basepage;

public class Catalogupload extends Basepage {
	WebDriver driver;

	@FindBy(xpath="//span[@.='My Products']")
	private WebElement myproducts;
	
	@FindBy(xpath="//span[@.='Catalogs']")
	private WebElement catalogs;
	
	@FindBy (xpath="//span[@.='Add Catalog']")        
	private WebElement addcatalog;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement name;
	
	@FindBy(xpath="//span[@.='Select Brand']")
	private WebElement brand;
	
	@FindBy(xpath="//span[@.='Select Category']")
	private WebElement category;
	
	@FindBy(xpath="//a[@ng-click='wizard.go(2)']")
	private WebElement next;
	
	@FindBy(xpath="//input[@name='thumbnail']")
	private WebElement browse;
	
	@FindBy(xpath="//input[@placeholder='Select work']")
	private WebElement work;
	
	@FindBy(xpath="//input[@placeholder='Select fabric']")
	private WebElement fabric;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement addproduct;
	
	@FindBy(xpath="//span[@name=class='fa fa-circle']")
	private WebElement radiosingle;
    
	@FindBy(xpath="//input[@placeholder='Enter percentage']")
	private WebElement percentage;
	
	@FindBy(xpath="//input[@ngf-select='uploadFiles($files)']")  
	private WebElement browse1;

	@FindBy(xpath="//input[@name='price']")
	private WebElement enterprice;
	
	@FindBy(xpath="//button[ng-click='AddProducts()']")
	private WebElement done;
	
	

	public Catalogupload(WebDriver driver) {
		super(driver);
	
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyproducts(){
		myproducts.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void clickcatalog(){
		catalogs.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void clickaddcatalogs(){
		addcatalog.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void entercatalogname(String catalogname){
		name.sendKeys(catalogname);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void selectbrand(){
		Select s=new Select(brand);
		s.selectByIndex(1);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void selectcategory(){
		Select s = new Select(category);
		s.selectByIndex(0);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void clicknext(){
		next.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void uploadimage(String path){
		browse.sendKeys(path);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void selectwork(){
		Select s =new Select(work);
		s.selectByIndex(1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void selectfabric(){
		Select s =new Select(fabric);
		s.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void clicksubmit(){
		addproduct.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void selecboth(){
		radiosingle.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void enterpercentage(){
		percentage.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void attachcatalog(String image){
		browse1.sendKeys(image);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void Enterprice1(String price){
		enterprice.sendKeys(price);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void uploaddone(){
		done.click();
	}
}
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



