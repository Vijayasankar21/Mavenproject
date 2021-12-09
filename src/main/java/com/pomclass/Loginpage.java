package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

public Loginpage(WebDriver driver2) {
		
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}
public WebDriver driver;	
		
  @FindBy(id="username")
  private WebElement username;
  
  public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin_btn() {
	return login_btn;
}

@FindBy(id="password")
  private WebElement password;
  
  @FindBy(xpath="//input[@value='Login']")
  private WebElement login_btn;
		
		

	
	
		
		
		



}
