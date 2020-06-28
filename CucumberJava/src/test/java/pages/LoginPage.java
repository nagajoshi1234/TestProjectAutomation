package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 WebDriver driver;
	 
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_login    = By.id("login");
	By btn_logout    = By.id("logout");
	
// constructor ---name is same as class name is called constructor
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProjectDemo"));{
			
			 throw new IllegalStateException("THis is not Login Page.The currnet page is "
					 +driver.getCurrentUrl());
			 
		}
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	public void checkLogOutisDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
		
	}
	
//	public void loginValidUser(String username,String password) {
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password);
//		driver.findElement(btn_login).click();
//		
//	}
}
