package com.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dec.Maven_project.Base_Class;

public class Dummy_project extends Base_Class{

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

	driver=launchbrowser("chrome");
	
	url("http://practice.automationtesting.in/");
	
	sleep(4000);	
		
	gettitle();
	
	geturl();
	
	takescreenshot("C:\\Users\\sankar\\eclipse-workspace\\Maven-project\\screenshot\\chrome.png");
	
	
	
	
	
	
	
	
	
	}

}
