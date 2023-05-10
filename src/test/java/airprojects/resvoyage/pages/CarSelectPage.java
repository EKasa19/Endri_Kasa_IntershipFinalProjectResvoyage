package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.CarSelectPageElements;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CarSelectPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    CarSelectPageElements carSelectPageElements = new CarSelectPageElements();
    public CarSelectPage(){PageFactory.initElements(BaseInformation.getDriver(),this);}

    public void getUrl(String url){
        BaseInformation.getDriver().get(url);
    }

    public void clickSubmitBtnCarPage(){
        basePageObject.getWaitUtils().waitForElementVisible(carSelectPageElements.submitBTN);
        carSelectPageElements.submitBTN.click();
    }
    public void changeDropOffH(String hour_00_00_am_or_pm){
        System.out.println("User selects the drop off hour for the car");
        basePageObject.getWaitUtils().waitForElementVisible(carSelectPageElements.dropOffHourDropdown);
        changeTheHour(carSelectPageElements.dropOffHourDropdown,hour_00_00_am_or_pm);
    }
    public void changePickUpH(String hour_00_00_AM_or_Pm){
        System.out.println("User selects pick up hour for the car");
        basePageObject.getWaitUtils().waitForElementClickable(carSelectPageElements.pickUpHourDropdown);
        changeTheHour(carSelectPageElements.pickUpHourDropdown,hour_00_00_AM_or_Pm);
    }
    void changeTheHour(WebElement dropdown,String hour_00_00_AM_or_Pm){
        basePageObject.getWaitUtils().waitForElementVisible(dropdown);
        Select hour = new Select(dropdown);
        hour.selectByVisibleText(hour_00_00_AM_or_Pm);
    }
    public void selectCar(int num){
        System.out.println("User selects the car they want");
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(60000,carSelectPageElements.modifySearchCarPageBtn);
        basePageObject.getWebElementUtils().scrollToElement(carSelectPageElements.addCardAllButtonsList.get(num));
        carSelectPageElements.addCardAllButtonsList.get(num).click();
    }

}
