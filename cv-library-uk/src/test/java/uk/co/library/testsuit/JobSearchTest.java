package uk.co.library.testsuit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

HomePage homePage;
ResultPage resultPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        resultPage=new ResultPage();

    }
    @Test(dataProvider ="jobsearch",dataProviderClass = TestData.class,groups ={"sanity","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException {

        homePage.enterJobtitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMOreSeacrhOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.hanldingIframe();
        homePage.clickOnFindJobButton();
        String actualtext=resultPage.gettextFromResultTextField();
        String expactedText=result;
        Assert.assertEquals(actualtext,expactedText,"displaye message is wrong");


    }


}
