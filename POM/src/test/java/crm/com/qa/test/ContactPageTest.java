package crm.com.qa.test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import crm.com.qa.base.TestBase;
import crm.com.qa.pages.ContactPage;
import crm.com.qa.pages.HomePage;
import crm.com.qa.pages.LoginPage;
public class ContactPageTest extends TestBase {
	ContactPage cp;
	LoginPage Lp;
	HomePage Hp;
	String sheetName="New Contacts";
public ContactPageTest() {
	super();
}
@BeforeMethod
public void setUp() {
	initialization();	
	 cp= new ContactPage();
  Lp= new LoginPage();
 Hp= Lp.login(prop.getProperty("email"),prop.getProperty("password"));
cp= Hp.clickOnContact();
}
@Test(priority=1)
public void verfiyConatctLabelTest() {
	System.out.println("hello");
	cp.verifyContactLabel();
}
//@DataProvider
//public Object[][] getData() {
	//Object data[][]=TestUtil.getTestData(sheetName);
	//return data;
//}
@Test(priority=2)
public void Entertest() {
	Hp.clickOnNewContact();
}

@AfterMethod
public void tearDown() {
	//driver.quit();                   
	}}
