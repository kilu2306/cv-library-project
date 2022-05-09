package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name="jobsearch")
    public Object[][]getData(){
        Object [][] data = new Object[][]{

                {"tester","harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Automation Tester","Sheffield","up to 5 miles","20000","40000","Per annum","Permanent","Permanent Automation Tester jobs in Sheffield"},
                {"manager","Nottinghamshire","up to 15 miles","40000","45000","Per annum","Part Time","Part Time Manager jobs in Nottinghamshire"},
             {"Nurse", "Essex", "2", "80", "7000", "day", "Contract", "Contract Nurse jobs in Essex"},
                {"Teacher", "Oxford", "5", "800", "40000", "annum", "Apprenticeship", "Apprenticeship Teacher jobs in Oxford"},
                {"Developer", "Nottingham", "7", "900", "30000", "month", "Permanent", "Permanent Developer jobs in Nottingham"}
        };return  data;
    }

}
