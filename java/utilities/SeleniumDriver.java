package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//74cfb2c5396e4a50b864bbd0a9d6a403
public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver=null;
	
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 40;
	public final static int PAGE_LOAD_TIMEOUT=50;
	//public final static Duration TIME =;
	
	//singletone pattern
	private SeleniumDriver() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver= new ChromeDriver();
		waitDriver= new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
		
	}
	
	public static void openPage(String url) {
		
		driver.get(url);
		
	}
	public static WebDriver getDriver() {
		
		return driver;
	}
	public static void setUp() {
		
		if (seleniumDriver==null) {
			
		seleniumDriver=new SeleniumDriver();
		
		}
	}
	public static void tearDown() {
		
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver =null;
	}

}
