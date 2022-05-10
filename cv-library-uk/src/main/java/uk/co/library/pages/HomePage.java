package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;
@FindBy(xpath = "//input[@id='location']")
    WebElement locationField;
@FindBy(xpath = "//select[@id='distance']")
    WebElement distancedropDownMenu;
@FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;
@FindBy(xpath = "//input[@id='salarymin']")
    WebElement minSalaryField;
@FindBy(xpath = "//input[@id='salarymax']")
    WebElement maxSalaryField;
@FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
@FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
@FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobButton;
@FindBy(xpath = "//span[contains(text(),'Accept All')]")
WebElement cookiesAcceptField;
@FindBy(xpath = "//span[contains(text(),'Manage Settings')]")
WebElement manageCookie;

public void enterJobtitle(String jobTitle){
    sendTextToElement(jobTitleField,jobTitle);

}
public void enterLocation(String location){
    sendTextToElement(locationField,location);
}
public void selectDistance(String distance){
    selectByVisibleTextFromDropDown(distancedropDownMenu,distance);
}
public void clickOnMOreSeacrhOptionLink(){
    clickOnElement(moreSearchOptionLink);

}
public  void enterMinSalary(String minSalary){
    sendTextToElement(minSalaryField,minSalary);
}
public void enterMaxSalary(String maxSalary ){
    sendTextToElement(maxSalaryField,maxSalary);
}
public void selectSalaryType(String sType){
    selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
}
public void  selectJobType(String jobType){
    selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
}
public void clickOnFindJobButton(){
    clickOnElement(findJobButton);
}


public  void clickOnManageCookie(){
    clickOnElement(manageCookie);
}

public  void hanldingIframe(){
    driver.switchTo().frame("gdpr-consent-notice");
clickOnElement(cookiesAcceptField);
driver.switchTo().defaultContent();
}
}
