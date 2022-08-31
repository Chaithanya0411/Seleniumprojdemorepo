package apackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> itr = windowsid.iterator();
		
		String mainwindowid = itr.next();
		String childwindowid = itr.next();
		
		driver.switchTo().window(childwindowid);		
		
		String str = driver.findElement(By.id("para1")).getText();
		System.out.println(str);
		
		
	}

}
