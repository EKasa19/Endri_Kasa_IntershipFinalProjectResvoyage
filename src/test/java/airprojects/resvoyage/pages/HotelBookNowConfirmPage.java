package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.HotelBookNowConfirmPageElements;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HotelBookNowConfirmPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    HotelBookNowConfirmPageElements hotelBookNowConfirmPageElements = new HotelBookNowConfirmPageElements();
    public HotelBookNowConfirmPage(){PageFactory.initElements(BaseInformation.getDriver(), this);}
    public void getUrl(String url){BaseInformation.getDriver().get(url);}

    public void selectHotelWithMaxPrice(double maxPrice){
        basePageObject.getWaitUtils().waitForElementInvisibilityWithCustomTime(60000,hotelBookNowConfirmPageElements.loadingScreen);
        for(WebElement q : hotelBookNowConfirmPageElements.listHotelPriceTotal)
        {
            if(maxPrice>getPrice(q))
            {
                basePageObject.getWebElementUtils().scrollToElement(q);
                System.out.println("Hotel selected with total package price price:"+q.getText());
                basePageObject.getWebElementUtils().scrollToElement(hotelBookNowConfirmPageElements.listHotelBookNowButton.get(hotelBookNowConfirmPageElements.listHotelPriceTotal.indexOf(q)));
                hotelBookNowConfirmPageElements.listHotelBookNowButton.get(hotelBookNowConfirmPageElements.listHotelPriceTotal.indexOf(q)).click();
                break;
            }
        }
    }
    double getPrice(WebElement element){
        String costText = basePageObject.getWebElementUtils().getCostTextOnlyNumbers(element);
        double cost = Double.parseDouble(costText);
        return cost;
    }
}
