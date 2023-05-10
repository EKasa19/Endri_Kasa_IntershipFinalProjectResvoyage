package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageElements {
    public CheckoutPageElements(){PageFactory.initElements(BaseInformation.getDriver(),this);}

    @FindBy(css = "div.ref_num_btn h2 span")
    public WebElement bookingNumberCode;
    @FindBy(css = "div.ref_num_btn h2")
    public WebElement bookingConfirmMsg;
    @FindBy(id = "bookingPassengersResultDiv")
    public WebElement passengerListCheckNames;
    @FindBy(css = ".waitScreen")
    public WebElement loadingScreen;
}
