package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {

		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void searchBoxAction() {

		carsGuideHomePageLocators.SearchBox.click();
	}
	public void findYourCarSection() {

		carsGuideHomePageLocators.MoveToFindYourNextCar.click();
	}

	public void searchClickAction() {

		carsGuideHomePageLocators.ClickSearch.click();
		
	}
	public void moveToBuySellMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToBuySellLink);
	}
    
	public void moveToReviewMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToReviewsLink);
	}
	public void moveToNewsMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToNewsLink);
	}
	public void moveToAdviceMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToAdviceLink);
	}
	public void moveToPriceSpecsMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToPricingSpecsLink);
	}
	public void moveToGuideMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToGuideLink);
	}
	public void moveToSignUpAction() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToSignUpInLink);
	}
    
	public void clickSellMyCar() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.ClickSellMyCar);
	}
    
	public void moveToMakeDropDown() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToMakeDropDown);
	}
    
	public void moveToModelDropDown() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.MoveToModelDropDown);
	}
    
	public void clickAnyMakeBox() {
		carsGuideHomePageLocators.ClickAnyMakeDropDown.click();
	}
	public void clickModelBox() {
		carsGuideHomePageLocators.ClickModelDropDown.click();
	}
	
	public void clickShowMeCarBtn() {
		carsGuideHomePageLocators.ClickShowmeCarBtn.click();
	}
	
	public void selectMake(String make) {
		Select select=new Select(carsGuideHomePageLocators.ClickAnyMakeDropDown);
		select.selectByVisibleText(make);
	}
	
	public void selectModel(String model) {
		Select select=new Select(carsGuideHomePageLocators.ClickModelDropDown);
		select.selectByVisibleText(model);
	}
	
	
	
}
