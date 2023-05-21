package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id= "Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id= "Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[text()='Log in']")  
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	public void enterUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	
	
}
