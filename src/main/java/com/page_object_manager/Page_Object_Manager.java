package com.page_object_manager;

import org.openqa.selenium.WebDriver;

import com.pomclass.Booknowpage;
import com.pomclass.Itenerypage;
import com.pomclass.Loginpage;
import com.pomclass.Search_hotelpage;
import com.pomclass.Selecthotel;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	private Loginpage lp;
	private Search_hotelpage sh;
	private Selecthotel sh1;
	private Booknowpage bp;
	private Itenerypage ip;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public Loginpage loginpage() {
		
		if (lp==null) {
			lp=new Loginpage(driver);
		}
		return lp;
		
	}
	
    public Search_hotelpage searchhotel() {
		
		if (sh==null) {
			sh=new Search_hotelpage(driver);
		}
		return sh;
		
	}
	
      public Selecthotel selecthotel() {
		
		if (sh1==null) {
			sh1=new Selecthotel(driver);
		}
		return sh1;
		
	}
      public Booknowpage booknow() {
  		
  		if (bp==null) {
  			bp=new Booknowpage(driver);
  		}
  		return bp;
  		
  	}
      public Itenerypage itenerypage() {
    		
    		if (ip==null) {
    			ip=new Itenerypage(driver);
    		}
    		return ip;
    		
    	}
	
	
	
	
	
	
	

}
