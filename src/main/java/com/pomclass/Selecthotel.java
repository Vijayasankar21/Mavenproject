package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	
public static WebDriver driver;

public Selecthotel(WebDriver driver2) {
			
		this.driver =driver2;
		PageFactory.initElements(driver, this);
		}

@FindBy(xpath="//input[@name='radiobutton_0']")
private WebElement select;

public static WebDriver getDriver() {
	return driver;
}

public WebElement getSelect() {
	return select;
}

public WebElement getContinu() {
	return continu;
}

@FindBy(id="continue")
private WebElement continu;



	
	
	
	
	
	
	

}
