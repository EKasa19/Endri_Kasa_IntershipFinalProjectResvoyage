package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.FlightSelectPageElements;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FlightSelectPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    FlightSelectPageElements flightSelectPageElements = new FlightSelectPageElements();
    public FlightSelectPage(){PageFactory.initElements(BaseInformation.getDriver(),this);}
    public void getUrl(String url){
        BaseInformation.getDriver().get(url);
    }


    public void selectFlight(int flightNum){
        System.out.println("User selects flight");
        // FlightNum -> is the position of the flights left default 0 is the first one
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(60000,flightSelectPageElements.modifySearchButton);
        basePageObject.getWaitUtils().waitForElementClickable(flightSelectPageElements.flightSelectButtonList.get(flightNum));
        basePageObject.getWebElementUtils().scrollToElement(flightSelectPageElements.flightSelectButtonList.get(flightNum));
        flightSelectPageElements.flightSelectButtonList.get(flightNum).click();
    }
    public void selectFlightWithPreferredAirline(String airline){
        System.out.println("User selects the first flight that has the preferred airline if none are found then select the first one");
        basePageObject.getWaitUtils().waitForElementInvisibilityWithCustomTime(60000,flightSelectPageElements.loadingScreen);
        int flightNum = getTickedThatAll3FlightsAreFromTheSameAirline(airline);
        basePageObject.getWaitUtils().waitForElementClickable(flightSelectPageElements.flightSelectButtonList.get(flightNum));
        basePageObject.getWebElementUtils().scrollToElement(flightSelectPageElements.flightSelectButtonList.get(flightNum));
        flightSelectPageElements.flightSelectButtonList.get(flightNum).click();
    }
    int getTickedThatAll3FlightsAreFromTheSameAirline(String airline){
        int output=0;
        for (int i = 0; i < flightSelectPageElements.flightAirlineFlagImg.size(); i+=3) {
            if(flightSelectPageElements.flightAirlineFlagImg.get(i).getAttribute("airline").equals(airline)
                    &&flightSelectPageElements.flightAirlineFlagImg.get(i+1).getAttribute("airline").equals(airline)
                    &&flightSelectPageElements.flightAirlineFlagImg.get(i+2).getAttribute("airline").equals(airline))
            {
                output=i;
                break;
            }
        }
        return output/3;
    }
    public void selectCompartmentForTheSelectedFlight(int i){
        System.out.println("User selects with compartment book now button to press");
        // 0 left option - 1 middle option - 2 right option
        WebElement button = flightSelectPageElements.flightBookNowButtonList.get(i);
        basePageObject.getWebElementUtils().scrollToElement(button);
        button.click();
    }
    public void selectCompartmentForMultiFlightT(int i){
        System.out.println("User selects with compartment book now button to press");
        // 0 left option - 1 middle option - 2 right option
        WebElement button = flightSelectPageElements.multiFlightBookNowButtonList.get(i);
        basePageObject.getWebElementUtils().scrollToElement(button);
        button.click();
    }

}
