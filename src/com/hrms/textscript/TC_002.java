package com.hrms.textscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002 
{
	@Test
	public void tc002()
	{
		DOMConfigurator.configure("log4j.xml");

		
		 //Test Steps
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();

	}
}


