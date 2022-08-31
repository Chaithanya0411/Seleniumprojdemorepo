package apackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void sampleEtoE() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String str = driver.getTitle();
		System.out.println(str);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Assert.assertTrue(driver.findElement(By.className("title")).isDisplayed());
		//Boolean bool = driver.findElement(By.className("title")).isDisplayed();
		//System.out.println(bool);
		
		WebElement successmessage = driver.findElement(By.className("title"));
		String successmesssageText = successmessage.getText();
		Assert.assertEquals(successmesssageText,"PRODUCTS");
		
		
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//*[@value='za']")).click();
		driver.findElement(By.xpath("//*[@class='pricebar']//*[@class='btn btn_primary btn_small btn_inventory']")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		
		
		Assert.assertTrue(driver.findElement(By.className("title")).isDisplayed());
		//Boolean bool1 = driver.findElement(By.className("title")).isDisplayed();
		//System.out.println(bool1);
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Chaithanya");
		driver.findElement(By.id("last-name")).sendKeys("Mailagani");
		driver.findElement(By.name("postalCode")).sendKeys("0629");
		driver.findElement(By.id("continue")).click();
		
		
		Assert.assertTrue(driver.findElement(By.className("title")).isDisplayed());
		//Boolean bool2 = driver.findElement(By.xpath("//*[@class='header_secondary_container']//*[@class='title']")).isDisplayed();
		//System.out.println(bool2);
		
		
		driver.findElement(By.name("finish")).click();
		
		
		Assert.assertTrue(driver.findElement(By.className("title")).isDisplayed());
		//Boolean bool3 = driver.findElement(By.className("title")).isDisplayed();
		//System.out.println(bool3);
		
		
		driver.findElement(By.id("back-to-products")).click();
		
		
		Assert.assertTrue(driver.findElement(By.className("title")).isDisplayed());
		//Boolean bool4 = driver.findElement(By.className("title")).isDisplayed();
		//System.out.println(bool4);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='root']//a[@id='logout_sidebar_link']")).click();
		
		
		driver.quit();
		
		
		
				
			
	} 

}
