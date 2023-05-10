package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarSelectPageElements {
    public CarSelectPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);}

    @FindBy(id = "departure_date")
    public WebElement pickUpDate;
    @FindBy(id = "AnyTime1")
    public WebElement pickUpHourDropdown;
    @FindBy(id = "AnyTime2")
    public WebElement dropOffHourDropdown;
    @FindBy(id = "submitBTN")
    public WebElement submitBTN;
    @FindBy(id = "modifySearchControl")
    public WebElement modifySearchCarPageBtn;
    @FindBy(css = "#SearchResultColumn button")
    public List<WebElement> addCardAllButtonsList;
}
