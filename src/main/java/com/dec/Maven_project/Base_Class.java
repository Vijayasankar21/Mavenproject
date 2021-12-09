package com.dec.Maven_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver launchbrowser(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"//driver//chromedriver.exe");
	     driver= new ChromeDriver();	
	}
	return driver;
	}
	
	public static void click(WebElement element) {
      
	element.click();	
	}
	
	public static void sendkeys(WebElement element,String value  ) {
		
	element.sendKeys(value);
	}
	
	public static void url(String url) {
		
	driver.get(url);
		
	}
	public static void wait1(int s) {
		driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);

	}
	public static void sleep(int milliseconds) throws InterruptedException {
	
	Thread.sleep(milliseconds);
		
	}
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println("Page title :" +title);

	}
	public static void dropdown(String type,WebElement element,String value) {
	
		Select s=new Select(element);
		
	if (type.equalsIgnoreCase("index")) {
		
		int index = Integer.parseInt(value);
		
		s.selectByIndex(index);
	}	
	
	else if (type.equalsIgnoreCase("value")) {
		
		s.selectByValue(value);
	}

	else if (type.equalsIgnoreCase("text")) {
		
		s.selectByVisibleText(value);
	}
	
	}
	
	public static void close() {
		
	driver.close();
	}
	
	public static void quit() {
	
	driver.quit();
		
	}
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);

	}
	public static void defaultcontent() {

	driver.switchTo().defaultContent();
	}
	
	
	public static void geturl() {
	
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	public static void gettext(WebElement element) {
		
		String text = element.getText();
		System.out.println(text);

	}
	public static void getattribute(WebElement element) {
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		

	}
	public static void isselected(WebElement element) {
		boolean f=element.isSelected();
		System.out.println(f);

	}
	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}
	
	public static void takescreenshot(String path) throws Throwable {
		
		TakesScreenshot scr=(TakesScreenshot)driver;
		File scr1 = scr.getScreenshotAs(OutputType.FILE);
		File i=new File(path);
		FileHandler.copy(scr1, i);

	}
	public static void actions(String type,WebElement element) {

		Actions a =new Actions(driver);
		
	if (type.equalsIgnoreCase("movetoelement")) {
		a.moveToElement(element).build().perform();
		
	}	

	else if (type.equalsIgnoreCase("doubleclick")) {
		a.doubleClick(element).build().perform();
	}
	else if (type.equalsIgnoreCase("rightclick")) {
		a.contextClick(element).build().perform();
		
	}
	else if (type.equalsIgnoreCase("click")) {
		
		a.click(element).build().perform();
	}
	}
	
	public static void jsexecutor( String type,WebElement element) {
		
	JavascriptExecutor js=(JavascriptExecutor) driver;	
	
	if (type.equalsIgnoreCase("scrollby")) {
		js.executeScript("window.scrollBy(0,3000);", element);

	}
	else if (type.equalsIgnoreCase("scrollintoview")) {
		
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	}
	public static void robot(String type) throws Throwable {
		
		Robot r=new Robot();
		
	if (type.equalsIgnoreCase("keydown")) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}	
	else if (type.equalsIgnoreCase("enter")) {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}	
	}
	
	
	
	
	

}
