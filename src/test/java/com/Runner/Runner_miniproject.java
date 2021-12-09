package com.Runner;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import com.dec.Maven_project.Base_Class;

public class Runner_miniproject extends Base_Class {

	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
	    driver =launchbrowser("chrome");
	
		url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		sleep(4000);
		gettitle();
		
		WebElement mail=driver.findElement(By.xpath("//label[@for='email_create']"));
		gettext(mail);
		
		//using id
		WebElement email = driver.findElement(By.id("email_create"));
		sendkeys(email,"vijayasankar2103@gmail.com");
		getattribute(email);
		
		//using absolute Xpath
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")).click();
		sleep(4000);
		
		geturl();
		gettitle();
		
		//using Classname
		WebElement acc = driver.findElement(By.className("page-heading"));
		gettext(acc);
		WebElement subheader = driver.findElement(By.className("page-subheading"));
		gettext(subheader);
		sleep(4000);
		
		//using Relative Xpath
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div")).click();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[2]/label"));
		gettext(name);
		
		//using Name
		WebElement fname = driver.findElement(By.name("customer_firstname"));
		sendkeys(fname, "vijayasankar");
		getattribute(fname);
		
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[3]/label"));
		gettext(lname);
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		sendkeys(lastname, "P");
		
		getattribute(lastname);
		
		WebElement mailid = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[4]/label"));
		gettext(mailid);
		WebElement elemen = driver.findElement(By.xpath("//input[@data-validate='isEmail']"));
		getattribute(elemen);
        
        WebElement password = driver.findElement(By.xpath("//label[@for='passwd']"));
		gettext(password);
        WebElement pass = driver.findElement(By.id("passwd"));
        sendkeys(pass, "vijay@21");
        getattribute(pass);
        
        WebElement days = driver.findElement(By.id("days"));
         //by usingIndex
         dropdown("index", days, "21");
         
        WebElement months = driver.findElement(By.name("months"));
        //by using visibleText
        
        dropdown("text", months, "March ");
        WebElement years = driver.findElement(By.name("years"));
        
        //by using value
        dropdown("value", years, "1999");
        
        WebElement subheading = driver.findElement(By.xpath("//h3[contains(text(),'Your address')]"));
        gettext(subheading);
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("vijayasankar");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("P");
        driver.findElement(By.name("company")).sendKeys("vijayasankar");
        WebElement addres = driver.findElement(By.xpath("//label[@for='address1']"));
        gettext(addres);
		WebElement addresses = driver.findElement(By.name("address1"));
		sendkeys(addresses, "13-7-5,valluvarnagar,chinnalapatti");
		getattribute(addresses);
		
		WebElement city=driver.findElement(By.id("city"));
		sendkeys(city,"dindigul");
		getattribute(city);
		
		WebElement state = driver.findElement(By.name("id_state"));
		
		dropdown("text", state,"California" );
		isselected(state);
		
		WebElement postcode = driver.findElement(By.name("postcode"));
		sendkeys(postcode, "62430");
		isdisplayed(postcode);
		getattribute(postcode);
		WebElement phoneno = driver.findElement(By.xpath("//label[@for='phone_mobile']"));
		gettext(phoneno);
		WebElement mobileno = driver.findElement(By.name("phone_mobile"));
		sendkeys(mobileno, "9600874067");
		getattribute(mobileno);
		driver.findElement(By.id("alias")).sendKeys("BF 1,venkatesh enclave");
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
		
		Thread.sleep(5000);
		takescreenshot("C:\\Users\\sankar\\eclipse-workspace\\Maven-project\\screenshot\\project3.png");
		
	Actions act=new Actions(driver);
		
		WebElement women=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		act.moveToElement(women).perform();
		WebElement eve = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[2]/a"));
		act.moveToElement(eve).click().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[1]/a")).click();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe"));
		driver.switchTo().frame(frame);
		sleep(3000);
		
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
		actions("movetoelement",quantity );
		actions("doubleclick", quantity);
		
		WebElement size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		
		dropdown("value", size, "3");
		driver.findElement(By.xpath("//*[@id=\"color_24\"]")).click();
		sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		sleep(4000);
		//driver.switchTo().defaultContent();
		defaultcontent();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	     Thread.sleep(4000);
		WebElement clik = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		act.moveToElement(clik).perform();
		clik.click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vijayasankar@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Sankar@21");
		//driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		//Thread.sleep(3000);
	driver.findElement(By.name("processAddress")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		Thread.sleep(3000);
		takescreenshot("C:\\Users\\sankar\\eclipse-workspace\\Maven-project\\screenshot\\miniproject1.png");
		
		
		
		
		
	}



}
