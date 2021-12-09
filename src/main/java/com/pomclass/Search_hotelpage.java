package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotelpage {

public static WebDriver driver;

public Search_hotelpage(WebDriver driver2) {
		
	this.driver =driver2;
	PageFactory.initElements(driver, this);
	}

@FindBy(id="location")
private WebElement location;

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getRoomno() {
	return roomno;
}

public WebElement getIndate() {
	return indate;
}

public WebElement getOutdate() {
	return outdate;
}

public WebElement getAdultroom() {
	return adultroom;
}

public WebElement getSumbit() {
	return sumbit;
}

@FindBy(id="hotels")
private WebElement hotels;


@FindBy(id="room_type")
private WebElement roomtype;

@FindBy(id="room_nos")
private WebElement roomno;

@FindBy(id="datepick_in")
private WebElement indate;

@FindBy(id="datepick_out")
private WebElement outdate;

@FindBy(id="adult_room")
private WebElement adultroom;

@FindBy(id="Submit")
private WebElement sumbit;



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
