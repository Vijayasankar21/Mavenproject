package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booknowpage {
	
public WebDriver driver;	

public Booknowpage(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		}

public WebElement getFirstname() {
	return firstname;
}


public WebElement getLastname() {
	return lastname;
}


public WebElement getAddress() {
	return address;
}


public WebElement getCardnum() {
	return cardnum;
}


public WebElement getCardtype() {
	return cardtype;
}


public WebElement getExpmonth() {
	return expmonth;
}


public WebElement getExpyear() {
	return expyear;
}


public WebElement getCcvnum() {
	return ccvnum;
}


public WebElement getBooknow() {
	return booknow;
}

@FindBy(name="first_name")
private WebElement firstname;

@FindBy(name="last_name")
private WebElement lastname;

@FindBy(name="address")
private WebElement address;

@FindBy(name="cc_num")
private WebElement cardnum;

@FindBy(name="cc_type")
private WebElement cardtype;

@FindBy(name="cc_exp_month")
private WebElement expmonth;

@FindBy(name="cc_exp_year")
private WebElement expyear;

@FindBy(name="cc_cvv")
private WebElement ccvnum;


@FindBy(name="book_now")
private WebElement booknow;			
	
	
	
	
	
	
	
	
	

}
