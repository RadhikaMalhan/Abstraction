package crm.com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.com.qa.base.TestBase;

public class LoginPage extends TestBase{
  //Page Factory--OR:
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement submit;
	@FindBy(xpath="//a[@href='https://api.cogmento.com/register']")
	WebElement register;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public HomePage login(String eml,String pwd) {
		email.sendKeys(eml);
		password.sendKeys(pwd);
		submit.click();
		return new HomePage();
		
	}
	
}
