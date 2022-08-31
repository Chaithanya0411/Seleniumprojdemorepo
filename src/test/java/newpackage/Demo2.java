package newpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test (priority=2)
	public void testlogin() {
		
		System.out.println("Login test got executed");
		
	
	}
	@Test (priority=1)
	public void testregistration() {
		
		System.out.println("Registration test got executed");
		
	}
	@Test (priority=3)
	public void testhomepage() {
		
		System.out.println("Homepage test got executed");
	}
}
	

