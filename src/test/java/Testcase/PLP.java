package Testcase;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Data.Dataprovider;

public class PLP extends Dataprovider{

	static String text;
	static String text1;
	static String text2;
	static String w;
	static int t;
	static WebElement y;


	public static void make() throws Exception{
		checkPageIsReady();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("make")))).click();
		List<WebElement> allmake = driver.findElements(By.xpath(Prop("Select")));
		int randomNum = ThreadLocalRandom.current().nextInt(0, allmake.size());
		Actions a = action.moveToElement((allmake).get(randomNum));
		text=allmake.get(randomNum).getText();
		a.click().build().perform();
	}

	public static void selection () throws Exception{
		checkPageIsReady();
		try {
			WebElement	a = driver.findElement(By.xpath(Prop("selectmake")));
			a.equals(text);
			s=true;
		}
		catch(NoSuchElementException e){
			s=false;
		}
		Assert.assertTrue(s, "Element is not visible");
	}


	public static void model() throws Exception{
		checkPageIsReady();
		success  = false;
		count = 0; MAX_TRIES = 5;
		lastException=null;
		while(success==false & count++ < MAX_TRIES){
			try{
				WebElement w = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("models"))));
				w.isEnabled();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("model")))).click();
				success=true;
			}catch(StaleElementReferenceException | ElementClickInterceptedException e){
				lastException=e;
			}
		}
		List<WebElement> allmodel= driver.findElements(By.xpath(Prop("Select")));
		int randomnum = ThreadLocalRandom.current().nextInt(0, allmodel.size());
		Actions b = action.moveToElement((allmodel.get(randomnum)));
		text1= allmodel.get(randomnum).getText();
		b.click().build().perform();
	}

	public static void selection1() throws Exception{
		checkPageIsReady();
		try{
			WebElement a = driver.findElement(By.xpath(Prop("selectmodel")));
			a.equals(text1);
			s1=true;
		}
		catch(NoSuchElementException e){
			s1=false;
		}
		Assert.assertTrue(s1, "Element is not visible");
	}


	public static void year() throws Exception{
		checkPageIsReady();
		success  = false;
		count = 0; MAX_TRIES = 5;
		lastException=null;
		while(success==false & count++ < MAX_TRIES){
			try{
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("year")))).click();
				success=true;
			}catch(StaleElementReferenceException | ElementClickInterceptedException e){
				lastException=e ;
			}

			List<WebElement> Allyear = driver.findElements(By.xpath(Prop("Select")));
			int randomnum = ThreadLocalRandom.current().nextInt(0 , Allyear.size());
			Actions c = action.moveToElement((Allyear.get(randomnum)));
			text2 = Allyear.get(randomnum).getText();
			c.click().build().perform();
		}
	}

	public static void selection2() throws Exception{
		checkPageIsReady();
		try{
			WebElement a = driver.findElement(By.xpath(Prop("selectyear")));
			a.equals(text2);
			s1=true;
		}
		catch(NoSuchElementException e){
			s1=false;
		}
		Assert.assertTrue(s1, "Element is not visible");
	}

	public static void GO() throws Exception{
		checkPageIsReady();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("go")))).click();
	}


	public static void plppage() throws Exception{

		checkPageIsReady();
		try{
			success  = false;
			count = 0; MAX_TRIES = 5;
			lastException=null;
			while(success==false & count++ < MAX_TRIES){
				try{
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Prop("PLPpage"))));
					success=true;
				}catch(StaleElementReferenceException | ElementClickInterceptedException e){
					lastException=e;
				}
			}

			s2=true;
		}
		catch(NoSuchElementException e){
			s2=false;
		}
		Assert.assertTrue(s2, "PLP is broken");
	}


	public static void filter() throws Exception{
		boolean present;

		checkPageIsReady();
		try{
			success  = false;
			count = 0; MAX_TRIES = 5;
			lastException=null;
			while(success==false & count++ < MAX_TRIES){
				try{
					driver.findElement(By.xpath(Prop("yes")));
					success=true;
				}catch(StaleElementReferenceException | ElementClickInterceptedException e){
					lastException=e;
				}
			}
			present=true;
		}
		catch(NoSuchElementException e){
			present=false;
		}
		if(present==true){
			System.out.println("Yes Present");
			checkPageIsReady();
			WebElement y = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("yes"))));
			y.click();
			checkPageIsReady();

		}
		else if(present==false){
			System.out.println("Yes Not Present");
			WebElement lo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("logo"))));
			action.moveToElement(lo).click().build().perform();
			make();
			model();
			year();
			GO();
			filter();		
		}
	}


	public static void instock() throws Exception{

		checkPageIsReady();
		success  = false;
		count = 0; MAX_TRIES = 5;
		lastException=null;
		while(success==false & count++ < MAX_TRIES){
			try{
				w = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Prop("text")))).getText();
				success=true;
			}catch(StaleElementReferenceException | ElementClickInterceptedException e){
				lastException=e;
			}
		}

		System.out.println(w);
		checkPageIsReady();
		List<WebElement> k1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(Prop("in"))));
		t = k1.size();
		System.out.println(t);
		Assert.assertEquals(w, (Integer.toString(t)), "In stock product mismatch");

	}


	public static void product() throws Exception{

		checkPageIsReady();
		List<WebElement> product = driver.findElements(By.xpath(Prop("product")));
		int randomnum = rand.nextInt(product.size());
		
		success  = false;
		count = 0; MAX_TRIES = 5;
		lastException=null;
		while(success==false & count++ < MAX_TRIES){
			try{
				action.moveToElement((product).get(randomnum)).click().build().perform();
				success=true;
			}catch(StaleElementReferenceException | ElementClickInterceptedException e){
				lastException=e;
			}
		}
		
		
	}

}
