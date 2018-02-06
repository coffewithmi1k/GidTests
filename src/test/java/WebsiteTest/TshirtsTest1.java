package WebsiteTest;

import PageObjects.Tests.HomePageTShirts;
import PageObjects.Tests.PageNavigator;
import PageObjects.Tests.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TshirtsTest1 {
    private WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown() {
        driver.close();

    }

    @Test
    public void getHomePage() {
        PageNavigator pageNav = new PageNavigator(driver);
        HomePageTShirts onHomePage = pageNav.getHomePage();
       Assert.assertEquals(driver.getTitle(),"My Store");
    }

    @Test
    public void checkBasicSearch(){
        PageNavigator nav = new PageNavigator(driver);
SearchResultPage onSearchResultPage = nav.getHomePage().checkbasicSearch();
Assert.assertEquals(onSearchResultPage.verifySearchResultsBasic().getText(),
        "No results were found for your search \"Red Dress\"");
    }
}