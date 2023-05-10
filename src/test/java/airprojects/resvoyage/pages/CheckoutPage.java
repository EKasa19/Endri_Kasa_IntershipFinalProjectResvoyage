package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.CheckoutPageElements;
import airprojects.resvoyage.globals.Globals;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class CheckoutPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    CheckoutPageElements checkoutPageElements = new CheckoutPageElements();
    public CheckoutPage(){PageFactory.initElements(BaseInformation.getDriver(), this);}
    public void getUrl(String url){BaseInformation.getDriver().get(url);}

    public void getBookingNumber(){
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(10000,checkoutPageElements.bookingNumberCode);
        System.out.println("The booking number is: "+checkoutPageElements.bookingNumberCode.getText());
        Assert.assertTrue(assetThatThePhasesAreDisplayed());
    }
    public void asserNamesAreCorrect(){
        Assert.assertTrue(checkNamesInBooking());
    }
    boolean checkNamesInBooking(){
        String passengerData = checkoutPageElements.passengerListCheckNames.getText();
        boolean check = Globals.userCheckIfNamesList.contains(passengerData);
        return check;
    }
    boolean assetThatThePhasesAreDisplayed(){
        basePageObject.getWaitUtils().waitForElementInvisibilityWithCustomTime(10000,checkoutPageElements.loadingScreen);
        String checkMsg = checkoutPageElements.bookingConfirmMsg.getText();
        return checkMsg.contains("booking reference number"+"Please");
    }

}
