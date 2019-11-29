package Testcase;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

public class PDP extends Dataprovider {


	public static void pdppage(){

		try{
			driver.findElement(By.xpath(Prop("PDPpage")));
			s=true;
		}
		catch(NoSuchElementException e){
			s=false;
		}
		Assert.assertTrue(s, "Pdp is broken");
	}

	public static  void qunatity() throws Exception{

		try{
			driver.findElement(By.xpath(Prop("out")));
		s=true;
		}
		catch(NoSuchElementException e){
		s=false;
		}
		if(s==true){
			select();
			PLP.make();
			PLP.model();
			PLP.year();
			goes();
		}
		
		checkPageIsReady();
		WebElement a = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("Quantity"))));
		a.click();
		a.sendKeys(Keys.CONTROL,"a");
		a.sendKeys(Prop("qty"));
	}

	public static void add() throws Exception{

		checkPageIsReady();
		try{
			driver.findElement(By.xpath(Prop("add")));
			s1=true;
		}
		catch (NoSuchElementException e){
			s1=false;
		}
		if(s1==true){

			driver.findElement(By.xpath(Prop("add"))).click();

			try{
				checkPageIsReady();
				success  = false;
				count = 0; MAX_TRIES = 5;
				lastException=null;
				while(success==false & count++ < MAX_TRIES){
					try{
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Prop("viewcart"))));
						//action.moveToElement(add).click().build().perform();
						success=true;
					}catch(StaleElementReferenceException | ElementClickInterceptedException e){
						lastException=e;
					}

				}
				s=true;
			}

			catch(NoSuchElementException | TimeoutException e){
				s=false;
			}
			if(s==true){
				System.out.println("Qty is  available");
			}
			else if(s==false){

				System.out.println("Qty is not available");
				checkPageIsReady();
				success  = false;
				count = 0; MAX_TRIES = 5;
				lastException=null;
				while(success==false & count++ < MAX_TRIES){
					try{
						WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("add"))));
						//action.moveToElement(add).click().build().perform();
						js.executeScript("arguments[0].click();", add);
						success=true;
					}catch(StaleElementReferenceException | ElementClickInterceptedException e){
						lastException=e;
					}
				}
			}

		}
		if(s1==false){

			System.out.println("false");

			checkPageIsReady();
			WebElement lo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("logo"))));
			action.moveToElement(lo).click().build().perform();

			PLP.make();
			PLP.model();
			PLP.year();
			PLP.GO();
			PLP.instock();
			PLP.filter();
			PLP.product();
			qunatity();
			add();	
		}
	}
	public static void mini() throws Exception{

		checkPageIsReady();
		try{
			success  = false;
			count = 0; MAX_TRIES = 5;
			lastException=null;
			while(success==false & count++ < MAX_TRIES){
				try{
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Prop("viewcart"))));
					success=true;
				}catch(StaleElementReferenceException | ElementClickInterceptedException e){
					lastException=e;
				}
			}

			s=true;
		}
		catch(NoSuchElementException | TimeoutException e){
			s=false;
		}
		Assert.assertTrue(s, "Mini cart is not dispalyed");
	}

	public static void fuel() throws Exception{

		checkPageIsReady();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("close")))).click();
		checkPageIsReady();
		WebElement s2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("logos"))));
		js.executeScript("arguments[0].click();", s2);
		checkPageIsReady();
		WebElement prods = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Prop("prod"))));
		success  = false;
		count = 0; MAX_TRIES = 5;
		lastException=null;
		while(success==false & count++ < MAX_TRIES){
			try{
				checkPageIsReady();
				action.moveToElement(prods).click().build().perform();
				success=true;
			}catch(StaleElementReferenceException | ElementClickInterceptedException e){
				lastException=e;
			}
		}
		WebElement utv = driver.findElement(By.xpath(Prop("UTVS")));
		WebElement fuel = driver.findElement(By.xpath(Prop("FUEL")));
		action.moveToElement(utv).build().perform();
		action.moveToElement(fuel).click().build().perform();
	}

	public static void clppage(){

		try{
			(driver.getCurrentUrl()).contains(Prop("clpurl"));
			s=true;
		}
		catch(NoSuchElementException e){
			s=false;
		}
		Assert.assertTrue(s, "clp page is broken");
	}

	public static void clp() throws Exception{

		checkPageIsReady();
		List<WebElement> shopall = driver.findElements(By.xpath(Prop("shopnow")));
		int shop = ThreadLocalRandom.current().nextInt(0,shopall.size());
		action.moveToElement((shopall).get(shop)).click().build().perform();

	}
	public static void genericpage() throws Exception{

		checkPageIsReady();

		try{
			driver.findElement(By.xpath(Prop("vechicle")));
			s1=true;
		}
		catch(NoSuchElementException e){
			s1=false;
		}
		Assert.assertTrue(s1, "Generic pdp is broken");
	}
	public static void select() throws Exception{

		checkPageIsReady();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("vechicle")))).click();
	}
	public static void popup() throws Exception{

		checkPageIsReady();
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Prop("pop"))));
			s=true;
		}
		catch(NoSuchElementException | TimeoutException e){
			s=false;
		}
		Assert.assertTrue(s, "Select popup is broken");
	}
	public static void goes(){

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("Goes")))).click();
	}
}
