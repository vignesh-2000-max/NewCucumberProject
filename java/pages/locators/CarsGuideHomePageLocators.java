package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"cgsearch-mobile\"]")
	public WebElement SearchBox;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/svg")
	public WebElement ClickSearch;
	
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement MoveToBuySellLink;
	
	@FindBy(how=How.LINK_TEXT,using="reviews")
	public WebElement MoveToReviewsLink;

	@FindBy(how=How.XPATH,using="//*[@id=\"cgAppCarsForSaleForm\"]/h3")
	public WebElement MoveToFindYourNextCar;
	
	
	@FindBy(how=How.LINK_TEXT,using="news")
	public WebElement MoveToNewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="advice")
	public WebElement MoveToAdviceLink;
	
	@FindBy(how=How.LINK_TEXT,using="pricing + specs")
	public WebElement MoveToPricingSpecsLink;
	
	@FindBy(how=How.LINK_TEXT,using="guides")
	public WebElement MoveToGuideLink;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"uhf-sell-header-link\"]/button")
	public WebElement ClickSellMyCar;

	@FindBy(how=How.LINK_TEXT,using="Sign up / Sign in")
	public WebElement MoveToSignUpInLink;

	@FindBy(how=How.XPATH,using="//*[@id=\"makes\"]")
	public WebElement ClickAnyMakeDropDown;

	@FindBy(how=How.XPATH,using="//*[@id=\"models\"]")
	public WebElement ClickModelDropDown;

	@FindBy(how=How.XPATH,using="//*[@id=\"search-submit\"]")
	public WebElement ClickShowmeCarBtn;

	@FindBy(how=How.XPATH,using="//*[@id=\"uhf-make\"]")
	public WebElement MoveToMakeDropDown;

	@FindBy(how=How.XPATH,using="//*[@id=\"uhf-model\"]")
	public WebElement MoveToModelDropDown;
	
   
	
	

}
