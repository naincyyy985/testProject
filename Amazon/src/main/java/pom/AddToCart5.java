package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart5
{
	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart;

	public AddToCart5(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickAddToCart5()
	{
		addToCart.click();
	}
	
	}
