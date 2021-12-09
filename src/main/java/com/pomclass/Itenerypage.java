package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itenerypage {
	
public WebDriver driver;	

public Itenerypage(WebDriver driver2) {
			
		this.driver=driver2;
		PageFactory.initElements(driver, this);
			
}
	
@FindBy(name="my_itinerary")
private WebElement itenery;

public WebElement getItenery() {
	return itenery;
}


	
	
	
	
	
	

}
