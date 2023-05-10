package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.ConfirmFlightPageElements;
import airprojects.resvoyage.globals.Globals;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.*;


public class ConfirmFlightPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    ConfirmFlightPageElements confirmFlightPageElements = new ConfirmFlightPageElements();
    public ConfirmFlightPage(){PageFactory.initElements(BaseInformation.getDriver(), this);}

    public void getUrl(String url){BaseInformation.getDriver().get(url);}

    //Passenger Fill data:
    public void fillFirstPassengerData(){
        System.out.println("Fill first passenger data");
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(60000,confirmFlightPageElements.firstPasName);
        fillPasseData(confirmFlightPageElements.firstPasName,Globals.passe1Name);
        fillPasseData(confirmFlightPageElements.firstPasLname,Globals.passe1SurName);
        fillPasseData(confirmFlightPageElements.firstPasEmail,Globals.passe1Email);
        fillPasseData(confirmFlightPageElements.firstPasEmailConfirm,Globals.passe1Email);
        fillPasseData(confirmFlightPageElements.firstPasPhoneNum,Globals.passe1Phone);
        selectGender(confirmFlightPageElements.firstPasGendersCheckboxOptions,Globals.passe1Gender);
        dropDOWN_selectByValue(confirmFlightPageElements.firstPasBirthday,Globals.passe1BDay);
        dropDOWN_selectByValue(confirmFlightPageElements.firstPasBirthMonth,Globals.passe1BMonth);
        dropDOWN_selectByValue(confirmFlightPageElements.firstPasBirthYear,Globals.passe1BYear);
    }
    public void fillSecondPassengerData(){
        System.out.println("Fill second passenger data");
        basePageObject.getWaitUtils().waitForElementVisible(confirmFlightPageElements.secondPassDropdownClickToFillInfo);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.secondPassDropdownClickToFillInfo);
        confirmFlightPageElements.secondPassDropdownClickToFillInfo.click();
        fillPasseData(confirmFlightPageElements.secondPasName,Globals.passe2Name);
        fillPasseData(confirmFlightPageElements.secondPasLname,Globals.passe2SurName);
        selectGender(confirmFlightPageElements.secondPasGendersCheckboxOptions,Globals.passe2Gender);
        dropDOWN_selectByValue(confirmFlightPageElements.secondPasBirthDay,Globals.passe2BDay);
        dropDOWN_selectByValue(confirmFlightPageElements.secondPasBirthMonth,Globals.passe2BMonth);
        dropDOWN_selectByValue(confirmFlightPageElements.secondPasBirthYear,Globals.passe2BYear );
    }
    public void fillThirdPassengerData(){
        System.out.println("Fill third passenger data");
        basePageObject.getWaitUtils().waitForElementVisible(confirmFlightPageElements.thirdPassDropdownClickToFillInfo);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.thirdPassDropdownClickToFillInfo);
        confirmFlightPageElements.thirdPassDropdownClickToFillInfo.click();
        fillPasseData(confirmFlightPageElements.thirdPasName,Globals.passe3Name);
        fillPasseData(confirmFlightPageElements.thirdPasLname,Globals.passe3SurName);
        selectGender(confirmFlightPageElements.thirdPasGendersCheckboxOptions,Globals.passe3Gender);
        dropDOWN_selectByValue(confirmFlightPageElements.thirdPasBirthDay,Globals.passe3BDay);
        dropDOWN_selectByValue(confirmFlightPageElements.thirdPasBirthMonth,Globals.passe3BMonth);
        dropDOWN_selectByValue(confirmFlightPageElements.thirdPasBirthYear,Globals.passe3BYear );
    }
    public void fillFirstChildData(){
        System.out.println("Fill first child passenger data");
        basePageObject.getWaitUtils().waitForElementVisible(confirmFlightPageElements.fourthPassDropdownClickToFillInfo);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.fourthPassDropdownClickToFillInfo);
        confirmFlightPageElements.fourthPassDropdownClickToFillInfo.click();
        fillPasseData(confirmFlightPageElements.fourthPasName,Globals.child1Name);
        fillPasseData(confirmFlightPageElements.fourthPasLname,Globals.child1SurName);
        selectGender(confirmFlightPageElements.fourthPasGendersCheckboxOptions,Globals.child1Gender);
        dropDOWN_selectByValue(confirmFlightPageElements.fourthPasBirthDay,Globals.child1BDay);
        dropDOWN_selectByValue(confirmFlightPageElements.fourthPasBirthMonth,Globals.child1BMonth);
        dropDOWN_selectByValue(confirmFlightPageElements.fourthPasBirthYear,Globals.child1BYear );
    }
    public void fillSecondChildData(){
        System.out.println("Fill second child passenger data");
        basePageObject.getWaitUtils().waitForElementVisible(confirmFlightPageElements.fifthPassDropdownClickToFillInfo);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.fifthPassDropdownClickToFillInfo);
        confirmFlightPageElements.fifthPassDropdownClickToFillInfo.click();
        fillPasseData(confirmFlightPageElements.fifthPasName,Globals.child2Name);
        fillPasseData(confirmFlightPageElements.fifthPasLname,Globals.child2SurName);
        selectGender(confirmFlightPageElements.fifthPasGendersCheckboxOptions,Globals.child2Gender);
        dropDOWN_selectByValue(confirmFlightPageElements.fifthPasBirthDay,Globals.child2BDay);
        dropDOWN_selectByValue(confirmFlightPageElements.fifthPasBirthMonth,Globals.child2BMonth);
        dropDOWN_selectByValue(confirmFlightPageElements.fifthPasBirthYear,Globals.child2BYear );
    }
    public void fillInfantPasseData(){
        System.out.println("Fill first infant passenger data");
        basePageObject.getWaitUtils().waitForElementVisible(confirmFlightPageElements.thirdPassDropdownClickToFillInfo);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.thirdPassDropdownClickToFillInfo);
        confirmFlightPageElements.thirdPassDropdownClickToFillInfo.click();
        fillPasseData(confirmFlightPageElements.thirdPasName,Globals.inf1Name);
        fillPasseData(confirmFlightPageElements.thirdPasLname,Globals.inf1SName);
        selectGender(confirmFlightPageElements.thirdPasGendersCheckboxOptions,Globals.inf1Gender);
        dropDOWN_selectByValue(confirmFlightPageElements.thirdPasBirthDay,Globals.inf1BDay);
        dropDOWN_selectByValue(confirmFlightPageElements.thirdPasBirthMonth,Globals.inf1BMonth);
        dropDOWN_selectByValue(confirmFlightPageElements.thirdPasBirthYear,Globals.inf1BYear );
    }

    //Credit Card click and fill
    public void selectCreditCardPaymentOption(){
        System.out.println("User selects credit card payment option ");
        //basePageObject.getWaitUtils().waitForElementInvisibilityWithCustomTime(60000,confirmFlightPageElements.loadingScreen);
        basePageObject.getWaitUtils().waitForElementClickableWithCustomTime(60000,confirmFlightPageElements.confirmBtn);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.creditCardButton);
        confirmFlightPageElements.creditCardButton.click();
    }
    public void fillCreditCardInfo(){
        System.out.println("User fills credit card info");
        basePageObject.getWaitUtils().waitForElementVisible(confirmFlightPageElements.creditCardNumber);
        fillPasseData(confirmFlightPageElements.creditCardNumber,Globals.creditCardNumber);
        fillPasseData(confirmFlightPageElements.creditCardCCV,Globals.creditCardCVC);
        fillPasseData(confirmFlightPageElements.creditCardNameOnCard,Globals.creditCardHolderName);
        dropDOWN_selectByValue(confirmFlightPageElements.cCardExpMonth,Globals.creditCardEXPMonth);
        dropDOWN_selectByValue(confirmFlightPageElements.cCardExpYear,Globals.creditCardEXPYear);
        fillPasseData(confirmFlightPageElements.postalCodeCreditCard, Globals.creditCardZIP);
        fillPasseData(confirmFlightPageElements.billingAddress,Globals.creditCardCity);
        fillPasseData(confirmFlightPageElements.cityCreditCard,Globals.creditCardCity);
    }
    public void clickAddHotelButton(){
        System.out.println("User click on add hotel button");
        basePageObject.getWaitUtils().waitForElementVisible(confirmFlightPageElements.addHotelButton);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.addHotelButton);
        confirmFlightPageElements.addHotelButton.click();
    }
    public void clickAddCarButton(){
        System.out.println("User click on add car button");
        basePageObject.getWaitUtils().waitForElementClickable(confirmFlightPageElements.addCarButton);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.addCarButton);
        confirmFlightPageElements.addCarButton.click();
    }
    public void clickConfirmButton(){
        System.out.println("User click on confirm button to go to checkout page");
        basePageObject.getWaitUtils().waitForElementClickable(confirmFlightPageElements.confirmBtn);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.confirmBtn);
        confirmFlightPageElements.customFiledCCV_fourNumberAmexCard.sendKeys(Globals.fourNumberAmexCardCode);
        confirmFlightPageElements.termsAndConditions.click();
        confirmFlightPageElements.confirmBtn.click();
    }
    public void selectSeats(String seatCode){
        System.out.println("User tries to select seat with code "+seatCode);
        basePageObject.getWaitUtils().waitForElementClickable(confirmFlightPageElements.selectSeatBtn);
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.selectSeatBtn);
        confirmFlightPageElements.selectSeatBtn.click();
        WebElement seat = seatToBeSelected(seatCode);
        if(seat != null)
        {
            System.out.println("Seat with seat code:"+seat+" is not available however another window seat has been selected");
            basePageObject.getWebElementUtils().scrollToElement(seat);
            seat.click();}
        else
            System.out.println("Error seat with code:"+seatCode+" is not available and no window seats are available");
        basePageObject.getWebElementUtils().scrollToElement(confirmFlightPageElements.saveSeatSelectedButton);
        confirmFlightPageElements.saveSeatSelectedButton.click();
    }
    void fillPasseData(WebElement elementToBeFilled, String dataFromGlobal) {
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(10000,elementToBeFilled);
        basePageObject.getWebElementUtils().scrollToElement(elementToBeFilled);
        elementToBeFilled.click();
        elementToBeFilled.sendKeys(dataFromGlobal);
    }
    void selectGender( List<WebElement> passenger, char gender){
        switch (gender){
            case 'F':
                basePageObject.getWaitUtils().waitForElementClickable(passenger.get(0));
                basePageObject.getWebElementUtils().scrollToElement(passenger.get(0));
                passenger.get(0).click();
                break;
            case 'M':
                basePageObject.getWaitUtils().waitForElementClickable(passenger.get(1));
                basePageObject.getWebElementUtils().scrollToElement(passenger.get(1));
                passenger.get(1).click();
                break;
            default:
                System.out.println("!!! No gender data given in Globals for passenger");
        }
    }
    void dropDOWN_selectByValue(WebElement bDayOrMonthOrYear, String dataFromGlobalsDMY){
        basePageObject.getWaitUtils().waitForElementVisible(bDayOrMonthOrYear);
        basePageObject.getWebElementUtils().scrollToElement(bDayOrMonthOrYear);
        bDayOrMonthOrYear.click();
        Select dropDown = new Select(bDayOrMonthOrYear);
        dropDown.selectByValue(dataFromGlobalsDMY);
    }
    WebElement seatToBeSelected(String seatCode){
        List<String>  Data_Code = fillAttributeList("data-code");
        List<String>  Data_Price = fillAttributeList("data-price");
        int seat;
        WebElement webElementSeat = null;
        if(Data_Price.get(Data_Code.indexOf(seatCode)).equals("0")){
            for (WebElement q : confirmFlightPageElements.listOfAllSeats){
                if (q.getAttribute("data-code").contains("A")&&q.getAttribute("class").contains("price")){
                    webElementSeat = q;
                    break;
                }
            }
        }
        else{
            seat = Data_Code.indexOf(seatCode);
            webElementSeat = confirmFlightPageElements.listOfAllSeats.get(seat);
        }
        return webElementSeat;
    }
    List<String> fillAttributeList(String attribute){
        List<String> attributeList = new ArrayList<>();
        for(WebElement seat : confirmFlightPageElements.listOfAllSeats){
            attributeList.add(seat.getAttribute(attribute));
        }
        return attributeList;
    }
}
