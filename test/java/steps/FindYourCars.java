package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import utilities.SeleniumDriver;

public class FindYourCars {
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	
	@Given("I am navigate to {string} Cars Guide page")
	public void i_am_navigate_to_cars_guide_page(String webPageUrl) throws InterruptedException {
		
		SeleniumDriver.openPage(webPageUrl);
		Thread.sleep(5);
	}

	
	@Then("Select brand as {string} from AnyMake dropdown")
	public void select_brand_as_from_any_make_dropdown(String brand) throws InterruptedException {
		
		Thread.sleep(5);
		carsGuideHomePageActions.findYourCarSection();
		carsGuideHomePageActions.clickAnyMakeBox();
		carsGuideHomePageActions.selectMake(brand);
	}

	@And("Select model as{string} from Model Dropdown")
	public void select_model_as_series_from_model_dropdown(String model) {

		carsGuideHomePageActions.clickModelBox();
		carsGuideHomePageActions.selectModel(model);
		
	}

	@And("Click Show me car buttton")
	public void click_show_me_car_buttton() throws InterruptedException {
		
		carsGuideHomePageActions.clickShowMeCarBtn();
		Thread.sleep(10);
	}

}
