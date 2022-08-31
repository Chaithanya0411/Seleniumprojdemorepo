package apackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(3000);
		
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdownfield);
		select.selectByIndex(4);
		
		WebElement multiselectionfield = driver.findElement(By.id("multiselect1"));
		Select select1 = new Select(multiselectionfield);
		select1.selectByVisibleText("Volvo");
		select1.selectByIndex(2);

	}

}
