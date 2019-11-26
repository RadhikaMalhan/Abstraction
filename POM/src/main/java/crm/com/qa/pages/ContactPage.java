package crm.com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import crm.com.qa.base.TestBase;

public class ContactPage extends TestBase{
	
@FindBy(xpath="//div[contains(@class, 'ui header')]")
WebElement ContactLabel;
@FindBy(name="first_name")
WebElement firstname;
@FindBy(name="last_name")
WebElement lastname;
@FindBy(xpath="//button[@class='ui linkedin button']")
WebElement saveBtn;

public ContactPage() {
	PageFactory.initElements(driver, this);
}
public boolean verifyContactLabel() {
	return ContactLabel.isDisplayed();
}
public void EnterElements(String Ftname,String Ltname) {
firstname.sendKeys(Ftname);
lastname.sendKeys(Ltname);
saveBtn.click();

}

}
