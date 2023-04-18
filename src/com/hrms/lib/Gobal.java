package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Gobal {

		public WebDriver driver;
			//To Provide Test Data & Objects Related to Whole application
			public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
			public String un  = "admin";
			public String pw  = "admin";
			public String FN  = "sayyada";
			public String LN  = "merchant";
			//Objects
			public String txt_loginname = "txtUserName";
			public String txt_password  = "txtPassword";
			public String btn_login     = "Submit";
			public String link_logout   = "Logout";
			public String frm_frame     = "rightMenu";
			public String btn_Add       = "//input[@value='Add'][@type='button']";
			public String txt_empfn     = "txtEmpFirstName";
			public String txt_empln     = "txtEmpLastName";
			public String btn_save      = "btnEdit";

}
