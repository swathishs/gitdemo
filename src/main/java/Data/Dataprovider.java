package Data;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class Dataprovider {

	public static WebDriver driver;
	public static Properties Prop;
	public static FileInputStream file;
	public static WebDriverWait wait;
	public static Actions action;
	public static Random rand;
	public static JavascriptExecutor js;
	public static boolean s;
	public static boolean s1,s2,s4;
	public static boolean success  = false;
	public static int count = 0, MAX_TRIES = 3;
	public static Throwable lastException;
	public static String pageLoadStatus = null;


	public static String Prop(String value) {

		
		try{

			Prop = new Properties();
			File location=new File("src/main/java/Data");
			File name = new File(location, "Data.properties");
			FileInputStream fis=new FileInputStream(name.getAbsolutePath());
			Prop.load(file);

		}

		catch(Exception e){
			e.printStackTrace();
		}

		return Prop.getProperty(value);
	}


	@BeforeSuite(alwaysRun=true)
	public void Browserselection() {


		if(Prop("Browser").equals("firefox")){
			File location=new File("src");
			File name = new File(location, "geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", name.getAbsolutePath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(Prop("Browser").equals("Chrome")){
			File location=new File("src");
			File name = new File(location, "chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", name.getAbsolutePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(Prop("Browser").equals("Internet")){
			File location=new File("src");
			File name = new File(location, "IEDriverServer.exe");
			System.setProperty("webdriver.gecko.driver", name.getAbsolutePath());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		else {

			System.out.println("Intalize web browser broken");

		}

		action = new Actions(driver);
		wait=new WebDriverWait(driver, 30);
		rand = new Random();
		js = ((JavascriptExecutor) driver);


	}

	public static void checkPageIsReady() throws Exception {
		 for (int i=0; i<20; i++)
		    { 
		        try 
		        {
		            Thread.sleep(1000);
		        }catch (InterruptedException e) {} 
		        //To check page ready state.

		        if (js.executeScript("return document.readyState").toString().equals("complete"))
		        { 
		            break; 
		        }   
		 }
	}
	/*@AfterSuite(alwaysRun=true)	
	public static void close_browser(){
		
		driver.close();
	}*/
}


