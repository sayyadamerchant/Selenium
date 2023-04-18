package com.hrms.textscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
@Test
//DOMConfigurator.configure("log4j.xml");
public void tc001() {
	DOMConfigurator.configure("log4j.xml");

	//public static void main(String[] args) {
		//Test Steps
        General obj = new General();
        obj.openApplication();
        obj.login();
        obj.logout();
        obj.closeApplication();

	}

}
