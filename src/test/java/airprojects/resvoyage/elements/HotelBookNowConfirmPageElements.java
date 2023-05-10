package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HotelBookNowConfirmPageElements {

    public HotelBookNowConfirmPageElements(){PageFactory.initElements(BaseInformation.getDriver(), this);}
    @FindBy(css = ".value")
    public List<WebElement> listHotelPriceTotal;
    @FindBy(css = "button[onclick^='API']")
    public List<WebElement> listHotelBookNowButton;
    @FindBy(css = ".waitScreen")
    public WebElement loadingScreen;

}
