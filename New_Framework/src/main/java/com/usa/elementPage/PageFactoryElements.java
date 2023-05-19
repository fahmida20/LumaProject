package com.usa.elementPage;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.basepage.SuperClass;
import com.usa.genericFunctions.CommonMethods;
import com.usa.genericFunctions.WaitHelper;

public class PageFactoryElements extends SuperClass{    //selenium has obeject repository or not?
	                                                      //where we store our web element?
	public PageFactoryElements() {
		PageFactory.initElements(driver, this);
	
	}

	//how we can store our elements?
	
	@FindBy(linkText = "Sign In")
	@CacheLookup
	private WebElement SignInButton;

	public WebElement getSignInButton() {
		return SignInButton;
	}
	
	@FindBy(id="email")
	@CacheLookup
	private WebElement EnterUserName;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}
	
	@FindBy(id="pass")
	@CacheLookup
	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}
	
	
	@FindBy(xpath="(//*[text()='Sign In'])[1]")
	@CacheLookup
	private WebElement clickOnSigninbtn;

	public WebElement getclickOnSigninbtn() {
		return clickOnSigninbtn;
	}
	
	
	//method for signIn application we create method than call by element get method name
	
    public void applicationLogin() {
    	
    	WaitHelper.seleniumWait(getSignInButton());
    	CommonMethods.actionClick(getSignInButton());
    	
    	WaitHelper.seleniumWait(getEnterUserName());
    	getEnterUserName().sendKeys(prop.getProperty("userName"));
		
    	WaitHelper.seleniumWait(getEnterPassword());
    	getEnterPassword().sendKeys(prop.getProperty("password"));
		
    	WaitHelper.seleniumWait(getclickOnSigninbtn());
    	CommonMethods.actionClick(getclickOnSigninbtn());
    	
	}
	
	
	
	@FindBy(xpath="//*[text()='Men']")
	@CacheLookup
	private WebElement selectMenMoodule;

	public WebElement getselectMenMoodule() {
		return selectMenMoodule;
	}
	
	@FindBy(id="ui-id-17")
	@CacheLookup
	private WebElement selectTopMoodule;

	public WebElement getselectTopMoodule() {
		return selectTopMoodule;
	}
	
	@FindBy(xpath="(//*[text()='Jackets'])[2]")
	@CacheLookup
	private WebElement selectJacketMoodule;

	public WebElement getselectJacketMoodule() {
		return selectJacketMoodule;
	}
	
	
	@FindBy(xpath="(//a[@class= 'product-item-link'])[3]")
	@CacheLookup
	private WebElement selectAllJupiterTrainer;

	public WebElement getselectAllJupiterTrainer() {
		return selectAllJupiterTrainer;
	}
	
	@FindBy(xpath="(//*[@index='2'])[1]")
	@CacheLookup
	private WebElement selectSize;

	public WebElement getselectSize() {
		return selectSize;
	}
	
	@FindBy(xpath= "(//*[@index='0'])[2]")
	//@FindBy(xpath= "(//*[@idex='0'])[2]")
	@CacheLookup
	private WebElement selectColor;

	public WebElement getselectColor() {
		return selectColor;
	}
	
	@FindBy(xpath="//*[@id='qty']")
	@CacheLookup
	private WebElement selectQuantity;

	public WebElement getselectQuantity() {
		return selectQuantity;
	}
	
	@FindBy(xpath="//*[text()='Add to Cart']")
	@CacheLookup
	private WebElement clickAddCart;

	public WebElement getclickAddCart() {
		return clickAddCart;
	}
	
	@FindBy(xpath="//*[text()='shopping cart']")
	@CacheLookup
	private WebElement clickShoppingCart;

	public WebElement getclickShoppingCart() {
		return clickShoppingCart;
	}
	
	@FindBy(xpath="(//*[text()='Proceed to Checkout'])[2]")
	@CacheLookup
	private WebElement clickProceedToCheckOut;

	public WebElement getclickProceedToCheckOut() {
		return clickProceedToCheckOut;
	}
	
	@FindBy (xpath="//*[text()='New Address']")
	 @CacheLookup	
	 private WebElement addNewAdress;
	public WebElement getaddNewAdress() {
		return   addNewAdress;    
		}	
		   
	
	// adding new shipping address
	
	@FindBy (xpath="(//*[@type = 'text'])[2]")
	 @CacheLookup	
	 private WebElement EnterFirstName;
	public WebElement getEnterFirstName() {
		return   EnterFirstName;    
		}	
	
	@FindBy (xpath="(//*[@type = 'text'])[3]")
	 @CacheLookup	
	 private WebElement EnterLastName;
	public WebElement getEnterLastName() {
		return   EnterLastName;    
		}
	
	@FindBy (xpath="(//*[@type = 'text'])[4]")
	 @CacheLookup	
	 private WebElement EnterCompanyName;
	public WebElement getEnterCompanyName() {
		return   EnterCompanyName;    
		}
	
	@FindBy (xpath="(//*[@type = 'text'])[5]")
	 @CacheLookup
	private WebElement enterStreetAdress;

	public WebElement getenterStreetAdress() {
	return  enterStreetAdress;
		}	
	
	@FindBy (xpath="(//*[@type = 'text'])[8]")
	 @CacheLookup
	private WebElement selectCity;

	public WebElement getselectCity() {
	return   selectCity;
		}
	
	@FindBy (xpath="(//*[@class='select'])[1]")
	 @CacheLookup
	private WebElement selectState;

	public WebElement getselectState() {
	return   selectState;
		}	
	
	@FindBy (xpath="(//*[@type='text'])[10]")
	 @CacheLookup
	private WebElement enterZip;

	public WebElement getenterZip() {
	return enterZip; 
	}
	
	@FindBy (xpath="(//*[@class='select'])[2]")
	 @CacheLookup
	private WebElement selectCountry;

	public WebElement getselectCountry() {
	return   selectCountry;
		}	
	
	
	@FindBy (xpath="(//*[@type='text'])[11]")
	 @CacheLookup
	private WebElement enterPhoneNumber;

	public WebElement getenterPhoneNumber() {
	return   enterPhoneNumber;
		}	
	
	@FindBy (xpath="//*[text()='Ship here']")
	 @CacheLookup
	private WebElement clickOnShipHere;

	public WebElement getclickOnShipHere() {
	return    clickOnShipHere;
		}	
	
	@FindBy (xpath="(//*[@type='radio'])[1]")
	 @CacheLookup
	private WebElement enterShippingMethod;

	public WebElement getenterShippingMethod() {
	return enterShippingMethod;
		}	
	

	@FindBy (xpath="//*[text()='Next']")
	 @CacheLookup
	private WebElement ClickNext;

	public WebElement getClickNext() {
	return   ClickNext;
		}
	
	@FindBy (xpath="//*[text()='Place Order']")
	 @CacheLookup
	private WebElement clickOnPlaceOrder;

	public WebElement getclickOnPlaceOrder() {
	return  clickOnPlaceOrder;
		}	
	
	@FindBy (xpath="//*[text()='Thank you for your purchase!']")
	 @CacheLookup
	private WebElement varifyTextMessage;

	public WebElement getvarifyTextMessage() {
	return  varifyTextMessage;
		}
	
	
	// here is xpath for list of WebElements:
	
	@FindBy (xpath="(//*[@class='select'])[1]/option")
	 @CacheLookup
	private List<WebElement> selectListOfState;

	public List<WebElement> getselectListOfState() {
	return selectListOfState;
		}
	
	@FindBy (xpath="(//*[@class='select'])[2]/option")
	 @CacheLookup
	private List<WebElement> selectListOfCountry;

	public List<WebElement> getselectListOfCountry() {
	return selectListOfCountry;
		}
	
	
	
	
	
	// create method for adding new shipping address 
	
	
      public void getAddNewShippingDetails() {
    	  
    	  WaitHelper.seleniumWait(getaddNewAdress());
  		  CommonMethods.jsClick(getaddNewAdress());
  	    
  		  WaitHelper.seleniumWait(getEnterFirstName());
  		  getEnterFirstName().clear();
  		  getEnterFirstName().sendKeys("afroza");
    	  
  		  WaitHelper.seleniumWait(getEnterLastName());
  		  getEnterLastName().clear();
  		  getEnterLastName().sendKeys("akter");
    	  
  		  WaitHelper.seleniumWait(getEnterCompanyName());
  		 getEnterCompanyName().clear();
  		  getEnterCompanyName().sendKeys("banglo");
    	  
  		  WaitHelper.seleniumWait(getenterStreetAdress());
  		 getenterStreetAdress().clear();
  		  getenterStreetAdress().sendKeys("43rd wall street");
    	  
  		  WaitHelper.seleniumWait(getselectCity());
  		  getselectCity().clear();
  		  getselectCity().sendKeys("Queens");
  		  
  		 // WaitHelper.seleniumWait(getselectState());
  		 CommonMethods.dropdown(getselectState(), "New York");
  		//CommonMethods.handleDropdown(getselectListOfState(), "New York");
  		  
  		  WaitHelper.seleniumWait(getenterZip());
  		  getenterZip().clear();
  		  getenterZip().sendKeys("11413");
  		
  		 // WaitHelper.seleniumWait(getselectCountry());
  		CommonMethods.dropdown(getselectCountry(), "United States");
  		 //CommonMethods.handleDropdown(getselectListOfCountry(), "United States");
  		
  		  WaitHelper.seleniumWait(getenterPhoneNumber());
    	  getenterPhoneNumber().sendKeys("098-7435-6789");
    	  
    	  WaitHelper.seleniumWait(getclickOnShipHere());
    	  CommonMethods.actionClick(getclickOnShipHere());
   
    	  //getenterShippingMethod().sendKeys("akter");
    	 // getClickNext().sendKeys("akter");
    	 // getclickOnPlaceOrder().click();
    	  
      }
	
	
	

}
