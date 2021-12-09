package com.Runner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.dec.Maven_project.Base_Class;
import com.page_object_manager.Page_Object_Manager;
import com.pomclass.Booknowpage;
import com.pomclass.Itenerypage;
import com.pomclass.Loginpage;
import com.pomclass.Search_hotelpage;
import com.pomclass.Selecthotel;

public class Adactin_Task extends Base_Class{

public static WebDriver driver=launchbrowser("chrome");

public static Page_Object_Manager pom=new Page_Object_Manager(driver);

public static void main(String[] args) throws Throwable {

url("https://adactinhotelapp.com/index.php");

gettitle();

geturl();

wait1(20);

sendkeys(pom.loginpage().getUsername(), "vijayasankar21");

sendkeys(pom.loginpage().getPassword(),"Vijayasankar@21" );

click(pom.loginpage().getLogin_btn());

sleep(4000);

dropdown("text",pom.searchhotel().getLocation(),"Melbourne" );

dropdown("text", pom.searchhotel().getHotels(),"Hotel Sunshine" );

dropdown("text", pom.searchhotel().getRoomtype(), "Double");	

dropdown("text",pom.searchhotel().getRoomno(), "2 - Two");
		
WebElement indate=pom.searchhotel().getIndate();

indate.clear();

sendkeys(indate, "02/12/2021");

WebElement outdate=pom.searchhotel().getOutdate();

outdate.clear();

sendkeys(outdate, "05/12/2021");

dropdown("text", pom.searchhotel().getAdultroom(), "2 - Two");		

click(pom.searchhotel().getSumbit());

sleep(4000);

click(pom.selecthotel().getSelect());

click(pom.selecthotel().getContinu());

sleep(4000);

sendkeys(pom.booknow().getFirstname(), "Vijayasankar");
		
jsexecutor("scrollintoview",pom.booknow().getFirstname());

sendkeys(pom.booknow().getLastname(), "P");

sendkeys(pom.booknow().getAddress(), "13-7-5,valluvar nagar,chinnalapatti");

sendkeys(pom.booknow().getCardnum(), "4567123404562103");
			
dropdown("text", pom.booknow().getCardtype(),"Master Card");

dropdown("text", pom.booknow().getExpmonth(), "December");		

dropdown("text", pom.booknow().getExpyear(), "2022");		

sendkeys(pom.booknow().getCcvnum(),"233");

click(pom.booknow().getBooknow());

sleep(4000);

click(pom.itenerypage().getItenery());	

sleep(4000);		

takescreenshot("C:\\Users\\sankar\\eclipse-workspace\\Maven-project\\screenshot\\adactinpro.png");
		
		
		
		
		
		
		
		
		
	}

}
