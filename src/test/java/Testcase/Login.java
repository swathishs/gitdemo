package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import Data.Dataprovider;

public class Login extends Dataprovider {


	public static void Url() throws Exception{

		if (driver.getCurrentUrl().contains(Prop("URL"))){

		}
		else{
			driver.get(Prop("URL"));
		}
	}


	public static void signin() throws Exception{

		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("Sign")))).click();
	}


	public static void loginpage(){

		try{
			driver.findElement(By.xpath(Prop("Logintext")));
			s=true;
		}
		catch(NoSuchElementException e){
			s=false;
		}
		Assert.assertTrue(s, "Loginpage is broken");
	}


	public static void google(){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("Google")))).click();
	}


	public static void googlesigin(){
		try{
			driver.findElement(By.xpath(Prop("Gosign")));
			s1=true;
		}
		catch(NoSuchElementException e){
			s1=false;
		}
		Assert.assertTrue(s, "Google loginpage is broken");

	}


	public static void email()	{

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("email")))).sendKeys(Prop("username"));
	}


	public static void next(){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("next")))).click();
	}


	public static void passpage(){
		try{
			driver.findElement(By.xpath(Prop("pass")));
			s2=true;
		}
		catch(NoSuchElementException e){
			s2=false;
		}
		Assert.assertTrue(s2, "Pass page is broken");
	}


	public static void pass(){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("pass")))).sendKeys(Prop("Password"));
	}

}
