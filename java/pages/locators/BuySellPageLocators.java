package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuySellPageLocators {
	

	@FindBy(how=How.XPATH,using="//*[@id=\"cgsearch-mobile\"]")
	public WebElement SearchBox;
	

}
