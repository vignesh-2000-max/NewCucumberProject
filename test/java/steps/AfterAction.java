package steps;


import io.cucumber.java.After;
import utilities.SeleniumDriver;

public class AfterAction {
	
	@After
	public static void tearDown() {
		
		/*if(scenario.isFailed()) {
			byte[] screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenShot, "image/png");
		}*/
		SeleniumDriver.tearDown();
	}

}
