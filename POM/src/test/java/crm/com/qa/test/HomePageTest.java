package crm.com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.com.qa.base.TestBase;
import crm.com.qa.pages.ContactPage;
import crm.com.qa.pages.DealsPage;
import crm.com.qa.pages.HomePage;
import crm.com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	HomePage Hp;
public  HomePageTest() {
	super();
}
@BeforeMethod
public void setUp() {
	initialization();	
	LoginPage Lp= new LoginPage();
	Hp=Lp.login(prop.getProperty("email"),prop.getProperty("password"));
}
@Test(priority=1)
public void verifyPageTitleTest() {
	String title=Hp.verifyHomePageTitle();
	Assert.assertEquals(title,"Cogmento CRM");
}
@Test(priority=2)
public void VerfifyUsernameTest() {
	Assert.assertTrue(Hp.UsernameVerify());
}
@Test(priority=3)
public void clickOncontactTest() {
	ContactPage cp=Hp.clickOnContact();
}
@Test(priority=4)
public void clickOnDealTest() {
	DealsPage d=Hp.clickONdeals();
}
@AfterMethod
public void tearDown() {
	driver.quit();}  }


