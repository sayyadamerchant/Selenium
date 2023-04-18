package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global;

public class General extends Gobal 
{

 
		//To provide all re-usable fun:/methods related to whole application
		public void openApplication() 
		{
		System.setProperty("webdiver.chrome.driver", "F:\\new floder selenium\\new floder chromedriver path\\chromedriver_win32 (3)\\chromedrivder.exe");
		  driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened"); //html Report
		Log.info("Application Opened"); //logfile
		}
		public void closeApplication() {
		driver.close();
		Log.info("Application closed");
		}
		public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Login completed");
		}
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
		
		}
		

		public void enterFrame() {
		driver.switchTo().frame(frm_frame);
		System.out.println("Entered into Frame");
		Log.info("Entered into frame");
		}
		public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frame");
		}
		public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_empfn)).sendKeys(FN);
		driver.findElement(By.name(txt_empln)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New emp Added");
		Log.info("new emp added");
		}
		

		
				
			
	

		


	}


