package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.HotelSelectPageElements;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelSelectPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    HotelSelectPageElements hotelSelectPageElements = new HotelSelectPageElements();
    public HotelSelectPage(){PageFactory.initElements(BaseInformation.getDriver(), this);}

    public void getUrl(String url){BaseInformation.getDriver().get(url);}

    public void switchToSortByPrice_HIGH_LOW(){
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(20000,hotelSelectPageElements.sortHotelResultsDropDown);
        Select dropDown = new Select(hotelSelectPageElements.sortHotelResultsDropDown);
        dropDown.selectByValue("7");
    }
    public void selectHotelWithMaxPrice(double maxPrice){
        basePageObject.getWaitUtils().waitForElementInvisibilityWithCustomTime(60000,hotelSelectPageElements.loadingScreen);
        for(WebElement q : hotelSelectPageElements.listHotelPricesPerNight)
        {
            if(maxPrice>getPrice(q))
            {
                basePageObject.getWebElementUtils().scrollToElement(q);
                System.out.println("Hotel selected with price:"+q.getText()+" per night");
                basePageObject.getWebElementUtils().scrollToElement(hotelSelectPageElements.listHotelSelectButton.get(hotelSelectPageElements.listHotelPricesPerNight.indexOf(q)));
                hotelSelectPageElements.listHotelSelectButton.get(hotelSelectPageElements.listHotelPricesPerNight.indexOf(q)).click();
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
