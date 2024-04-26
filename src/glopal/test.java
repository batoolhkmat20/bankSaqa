package glopal;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test {
	WebDriver driver = new ChromeDriver();
	String wepLogin="https://smartbuy-me.com/smartbuystore/en/";
String firstName="batool";
String LastName="hikmat";
String phone="782000556";
String emil="bhkmat700@gamil.com";
String password="batool09@";
	@BeforeTest
	public void sutup() {
		
		driver.manage().window().maximize();
	}
	@Test(enabled = false)
	public void customerLogin ()
	{driver.get("https://smartbuy-me.com/smartbuystore/en/login");
	WebElement ContenarGift=driver.findElement(By.xpath("/html/body/main/header/div[4]/div/nav/div/div[3]/div/ul/li[3]"));
	WebElement taitl=driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/button"));
	taitl.click();
	WebElement miss=driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/div/ul/li[2]/a/span[1]"));
	miss.click();
	WebElement FirstNameInput=driver.findElement(By.id("register.firstName"));
	FirstNameInput.sendKeys(firstName);
	WebElement lastNameInput=driver.findElement(By.id("register.lastName"));
	lastNameInput.sendKeys(LastName);
	WebElement gnder=driver.findElement(By.cssSelector("button[title='Gender'] span[class='filter-option pull-left']"));
gnder.click();
WebElement femal=driver.findElement(By.cssSelector("div[class='col-md-5 col-sm-5 registerGender'] li:nth-child(3) a:nth-child(1) span:nth-child(1)"));
femal.click();
WebElement barih=driver.findElement(By.id("dateOfBirth"));barih.click();
barih.sendKeys("20/5/1999");
WebElement Code=driver.findElement(By.cssSelector("button[title='Code']"));
Code.click();
 WebElement jordan=  driver.findElement(By.cssSelector("li:nth-child(114) a:nth-child(1)"));
 jordan.click();
//Select select=new Select(Code);
//select.selectByIndex(113);
 WebElement phoneInput=  driver.findElement(By.cssSelector("#mobileNumber"));
 phoneInput.sendKeys(phone);
 WebElement emailInput=  driver.findElement(By.cssSelector("body > main:nth-child(10) > div:nth-child(12) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > input:nth-child(2)"));
 emailInput.sendKeys(emil);
 
 WebElement nothonalty=driver.findElement(By.cssSelector("button[title='Nationality']"));
 nothonalty.click();
 WebElement jordann=  driver.findElement(By.cssSelector("div[class='col-md-12 col-sm-12'] li:nth-child(24) a:nth-child(1)"));
 jordann.click();

  WebElement paswodinput=  driver.findElement(By.cssSelector("#password"));
  paswodinput.sendKeys(password);
  WebElement paswodinputconfirm=  driver.findElement(By.cssSelector("body > main:nth-child(10) > div:nth-child(12) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9) > div:nth-child(1) > input:nth-child(2)"));
  paswodinputconfirm.sendKeys(password);
  WebElement read=driver.findElement(By.cssSelector("#termsandconditions"));
  read.click();
  WebElement register=driver.findElement(By.cssSelector("div[class='form-actions clearfix'] button[type='submit']"));
  register.click();
  WebElement Acual=driver.findElement(By.xpath("/html/body/main/div[3]/div[1]"));
  String Acualtext= Acual.getText();
 
  String acpeted="Thank you for";
  Assert.assertEquals(Acualtext, acpeted);
  System.out.println(Acualtext);
 
	}
@ Test(priority = 1)
public void login()
{
	driver.get("https://smartbuy-me.com/smartbuystore/en/login");
WebElement EmailAddress=driver.findElement(By.cssSelector("body > main:nth-child(10) > div:nth-child(12) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)"));
EmailAddress.sendKeys(emil);
WebElement passwordlogin=driver.findElement(By.cssSelector("body > main:nth-child(10) > div:nth-child(12) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > input:nth-child(2)"));
passwordlogin.sendKeys(password);
WebElement LoginButton=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
LoginButton.click();
}
@Test(enabled = false)
public void searchRandom()
{

driver.get("https://smartbuy-me.com/smartbuystore/en/Smart-Tech/Mobile-%26-Tablets/Smart-Mobile/c/20303");
//WebElement brand=driver.findElement(By.xpath("//*[@id=\"product-facet\"]/div[3]/div[1]"))	;
//brand.click();
//driver.get("https://smartbuy-me.com/smartbuystore/en/Brands/c/brands");

String[] products = {"iPhone", "Samsung", "Huawei"};


Random random = new Random();
int index = random.nextInt(products.length);


WebElement searchBox = driver.findElement(By.id("js-site-search-input"));
WebElement searchButton = driver.findElement(By.className("input-group-btn"));
searchBox.sendKeys(products[index]);
searchButton.click();
//
//WebElement contenar=driver.findElement(By.cssSelector(".col-md-12.text-center-landing"));
//List <WebElement> brands=driver.findElements(By.tagName( "figure"));
//Random random = new Random();
//int index = random.nextInt(brands.size());
//for (int i=0;i<brands.size();i++)
//{
//brands.get(i).click();	
//
//}	
}
@Test(enabled = false)
public void  firstitemadd () throws InterruptedException
{WebElement First=driver.findElement(By.className("item_grid"));
First.click();
WebElement addtocart=driver.findElement(By.id("addToCartButton"));
addtocart.click();
WebElement expectedPriceWthoutdis=driver.findElement(By.className("price"));
String expectdPrice=expectedPriceWthoutdis.getText();
Thread.sleep(3000);
WebElement itemAddto=driver.findElement(By.id("cboxContent"));
WebElement checot=driver.findElement(By.cssSelector("button[id=\"cboxClose\"] span[class=\"fas fa-times\"]"));
driver.get("https://smartbuy-me.com/smartbuystore/en/cart");

String expexted="1 items";
WebElement acual=driver.findElement(By.cssSelector(".js-cart-top-totals.cart__top--totals"));
WebElement acualPrice=driver.findElement(By.cssSelector(".cart__top--amount"));
String acualTextPrice=acualPrice.getText(); 
String textual=acual.getText();
Assert.assertEquals(textual, expexted);
Assert.assertEquals(acualTextPrice, expectdPrice);
}	

@Test(priority = 2)
public void iphonesearch() throws IOException
{WebElement searchBox = driver.findElement(By.id("js-site-search-input"));
WebElement searchButton = driver.findElement(By.className("input-group-btn"));
searchBox.sendKeys("iphone");
searchButton.click();
Date currentdate= new Date(0);
String thenae=currentdate.toString().replace(":", "");
TakesScreenshot src=((TakesScreenshot)driver);
File srcfile=src.getScreenshotAs(OutputType.FILE);
File destnation=new File("src/screen/2"+thenae+".png");
FileUtils.copyFile(srcfile, destnation);

}
@Test(priority = 3)
public void amountRandom()
{WebElement ContenarPrice=driver.findElement(By.className("js-facet-name"));
ContenarPrice.click();
 List <WebElement >allPrice=driver.findElements(By.className("facet__list__label"));//js-facet-form"
// WebElement CHECK=driver.findElement(By.className("facet__list__label"));
	Random rand=new Random();
//for(int i=0;i<allPrice.size();i++)
int RandomSizeToSelect = rand.nextInt(allPrice.size());
allPrice.get( RandomSizeToSelect).click();
WebElement First=driver.findElement(By.className("item_grid"));
First.click();
WebElement MSGacual=driver.findElement(By.id("addToCartForm"))	;
String acual= MSGacual.getText();
String axpeted="Sold out";
Assert.assertEquals(acual, axpeted);
	
}


	
	 @AfterTest
		public void end() {
		
		 
		
	 }
	}
