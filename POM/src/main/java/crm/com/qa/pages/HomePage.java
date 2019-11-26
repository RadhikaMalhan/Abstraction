package crm.com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import crm.com.qa.base.TestBase;
public class HomePage extends TestBase {

	@FindBy(xpath="//span[@class='user-display']")
	WebElement user;	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement cont;
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement deal;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean UsernameVerify() {
		return user.isDisplayed();
	}
	public ContactPage clickOnContact() {
		cont.click();
		return new ContactPage();
	}
	public DealsPage clickONdeals() {
		deal.click();
		return new DealsPage();
	}
	public void clickOnNewContact() {
		driver.findElement(By.xpath("//a[contains(@href,'/contacts/new')]")).click();
	}

}
