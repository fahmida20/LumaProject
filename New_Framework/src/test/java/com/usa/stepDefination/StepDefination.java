package com.usa.stepDefination;





import org.testng.Assert;

import com.usa.basepage.SuperClass;
import com.usa.elementPage.PageFactoryElements;
import com.usa.genericFunctions.CommonMethods;
import com.usa.genericFunctions.WaitHelper;

import io.cucumber.java.en.*;


public class StepDefination extends SuperClass{
	PageFactoryElements pf;
	@Given("user able to login the application")
	public void user_able_to_login_the_application() throws InterruptedException {
		//initialization(); 
        pf= new PageFactoryElements(); 
        
        log.info(">>>>>>User able to login the application<<<<<<<");
		pf.applicationLogin();
		CommonMethods.captureScreenshot(driver,"login page");
	}
	@When("user able to select Jackets from Men module")
	public void user_able_to_select_jackets_from_men_module() {
		
		log.info(">>>>>>User able to select Men module<<<<<<<");
		WaitHelper.seleniumWait(pf.getselectMenMoodule());
		CommonMethods.mouseHoverOver(pf.getselectMenMoodule());
		
		log.info(">>>>>>User able to select Top module<<<<<<<");
		WaitHelper.seleniumWait(pf.getselectTopMoodule());
		CommonMethods.mouseHoverOver(pf.getselectTopMoodule());
		
		log.info(">>>>>>User able to select Jacket module<<<<<<<");
		WaitHelper.seleniumWait(pf.getselectJacketMoodule());
		CommonMethods.actionClick(pf.getselectJacketMoodule());
	    
		
		
	}
	@When("user able to select a Jacket product's size, color, quantity")
	public void user_able_to_select_a_jacket_product_s_size_color_quantity() {
	   
		log.info(">>>>>>User able to select AllJupiterJacket <<<<<<<");
		CommonMethods.actionClick(pf.getselectAllJupiterTrainer());
		
		log.info(">>>>>>User able to select Jacket product size<<<<<<<");
		WaitHelper.seleniumWait(pf.getselectSize());
		CommonMethods.actionClick(pf.getselectSize());
		
		
		
		
		CommonMethods.captureScreenshot(driver, "Failed color option");
		log.info(">>>>>>User able to select Jacket color<<<<<<<");
		WaitHelper.seleniumWait(pf.getselectColor());
		CommonMethods.actionClick(pf.getselectColor());
		
		log.info(">>>>>>User able to select Jacket quantity<<<<<<<");
		WaitHelper.seleniumWait(pf.getselectQuantity());
		pf.getselectQuantity().clear();
		pf.getselectQuantity().sendKeys("1");
		
		
	}
	@When("user able to click add to cart button")
	public void user_able_to_click_add_to_cart_button() {
		log.info(">>>>>>User able to click Add to Cart button<<<<<<<");
		WaitHelper.seleniumWait(pf.getclickAddCart());
		CommonMethods.actionClick(pf.getclickAddCart());
	    
	}
	@When("user able to click on the shopping cart pop-up")
	public void user_able_to_click_on_the_shopping_cart_pop_up() {
		
		log.info(">>>>>>User able to click ShoppingCart<<<<<<<");
		WaitHelper.seleniumWait(pf.getclickShoppingCart());
		CommonMethods.actionClick(pf.getclickShoppingCart());
	    
	    
	}
	@When("user able to click on the proceed to checkout")
	public void user_able_to_click_on_the_proceed_to_checkout() {
		
		log.info(">>>>>>User able to click on Proceed To CheckOut button<<<<<<<");
		WaitHelper.seleniumWait(pf.getclickProceedToCheckOut());
		CommonMethods.actionClick(pf.getclickProceedToCheckOut());
	    
	    
	}
	@When("user able to add shipping information")
	public void user_able_to_add_shipping_information() {
		
		log.info(">>>>>>User able to add Add NewShipping Details<<<<<<<");
		pf.getAddNewShippingDetails();
	  
	}
	@When("user able to select shipping method radial button and click on next button")
	public void user_able_to_select_shipping_method_radial_button_and_click_on_next_button() {
	   
		log.info(">>>>>>User able to add Shipping Method and click next<<<<<<<");
		CommonMethods.getPageRefresh();
		WaitHelper.seleniumWait(pf.getenterShippingMethod());
	    CommonMethods.actionClick(pf.getenterShippingMethod());
	    
	    
	    WaitHelper.seleniumWait(pf.getClickNext());
	    CommonMethods.actionClick(pf.getClickNext());
	    
	    
	}
	@When("user able to click on the place order button")
	public void user_able_to_click_on_the_place_order_button() {
	   
		log.info(">>>>>>User able to click on PlaceOrder<<<<<<<");
		WaitHelper.seleniumWait(pf.getclickOnPlaceOrder());
	    CommonMethods.jsClick(pf.getclickOnPlaceOrder());
	    
	}
	@Then("user able to verify the confirmation message {string}")
	public void user_able_to_verify_the_confirmation_message(String expectedResult) {
		
		
		log.info(">>>>>>User able to varify the confirmation message<<<<<<<");
		Assert.assertEquals(expectedResult,pf.getvarifyTextMessage().getText());
		System.out.println("Order Confirmation:"+ pf.getvarifyTextMessage().getText());
	    
	}


}
