package crm.com.qa.test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.com.qa.base.TestBase;
import crm.com.qa.pages.HomePage;
import crm.com.qa.pages.LoginPage;
public class LoginPageTest extends TestBase {
	LoginPage Lp;
	HomePage Hp;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();	
	 Lp= new LoginPage();
	}
	@Test(priority=1)
	public void TitleTest() {
		String title = Lp.validateLoginPageTitle();
		Assert.assertEquals(title,"Cogmento CRM");
	}
	@Test(priority=2)
	public void LoginTe() {
		Hp=Lp.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
