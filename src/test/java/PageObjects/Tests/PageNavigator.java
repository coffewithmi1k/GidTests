package PageObjects.Tests;

import org.openqa.selenium.WebDriver;

public class PageNavigator {
WebDriver driver;


public PageNavigator(WebDriver driver){
    this.driver = driver;

}

public HomePageTShirts getHomePage(){
    driver.get("http://automationpractice.com");
    return new HomePageTShirts(driver);
}

}
