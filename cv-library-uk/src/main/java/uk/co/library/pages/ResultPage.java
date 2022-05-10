package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {
    public  ResultPage(){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultTextField;

    public String  gettextFromResultTextField(){
        return getTextFromElement(resultTextField);
    }



}
