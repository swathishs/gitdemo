package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Data.Dataprovider;


public class cart extends Dataprovider{

	public static WebElement up;

	public static void minicart(){

		try{
			driver.findElement(By.xpath(Prop("viewcart")));
			s=true;
		}
		catch (NoSuchElementException e){
			s=false;
		}
		if(s==true){


		}
		else if (s==false){
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("minicart")))).click();

		}
	}

	public static void viewcart() throws Exception{

		checkPageIsReady();
		success  = false;
		count = 0; MAX_TRIES = 5;
		lastException=null;
		while(success==false & count++ < MAX_TRIES){
			try{
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("viewcart")))).click();
				success=true;
			}catch(StaleElementReferenceException | ElementClickInterceptedException e){
				lastException=e;
			}
		}
	}

	public static void cartpage(){

		try{
			(driver.getCurrentUrl()).contains(Prop("carturl"));
			s4=true;
		}
		catch(NoSuchElementException e){
			s4=false;
		}
		Assert.assertTrue(s4, "Cartpage is broken");
	}

	public static void proceed() throws Exception{
		try{
			checkPageIsReady();
			driver.findElement(By.xpath(Prop("proccedtoCheckoutDisabled")));
			s=false;
		}
		catch(NoSuchElementException e){
			s=true;
		}
		if(s==true){
			System.out.println("true");

			WebElement prod = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("proceedtocheckout"))));
			js.executeScript("arguments[0].click();", prod);
		}
		else if(s==false){
			System.out.println("false");
			checkPageIsReady();
			success  = false;
			count = 0; MAX_TRIES = 5;
			lastException=null;
			while(success==false & count++ < MAX_TRIES){
				try{

					WebElement change = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("change"))));
					action.moveToElement(change).click().build().perform();

					success=true;
				}catch(StaleElementReferenceException | ElementClickInterceptedException e){
					lastException=e ;
				}


				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("postalcode")))).sendKeys(Prop("code"));
				checkPageIsReady();
				success  = false;
				count = 0; MAX_TRIES = 5;
				lastException=null;
				while(success==false & count++ < MAX_TRIES){
					try{

						WebElement esti = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("estimate"))));
						//js.executeScript("arguments[0].click();", esti);
						action.moveToElement(esti).click().build().perform();
						success=true;
					}catch(StaleElementReferenceException | ElementClickInterceptedException e){
						lastException=e ;
					}

				}

				checkPageIsReady();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("proceedtocheckout")))).click();
			}
		}}


	public static void checkout(){

		try{
			(driver.getCurrentUrl()).contains(Prop("checkouturl"));
			s4=true;
		}
		catch(NoSuchElementException e){
			s4=false;
		}
		Assert.assertTrue(s4, "Checkoutpage is broken");
	}
	public static void qty() throws Exception{

		checkPageIsReady();
		up=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("Quantitys"))));
		up.click();
		up.sendKeys(Keys.CONTROL,"a");
		up.sendKeys(Prop("qtys"));


	}
	public static void update() throws Exception{

		checkPageIsReady();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("update")))).click();


		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Prop("ok"))));
			s=true;
		}
		catch(NoSuchElementException | TimeoutException e){
			s=false;
		}
		if(s==true){
			System.out.println("update");
			WebElement t = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Prop("ok"))));
			action.moveToElement(t).click().build().perform();
		}
		else if(s==false){

		}
	}
	public static void qtyup() throws Exception{

		checkPageIsReady();
		String update = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("Quantitys")))).getAttribute("value");
		Assert.assertEquals(update,(Prop("qtys")));
	}


}
/*
List<WebElement> rad = driver.findElements(By.xpath(Prop("radio")));

int radio = rand.nextInt(rad.size());
action.moveToElement((rad).get(radio)).click().build().perform();*/