package PageObjects.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageTShirts extends PageNavigator {

    public HomePageTShirts(WebDriver driver){
super(driver);
    }


    public WomenPage getWomenPage(){
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        return new WomenPage(driver);
    }
    public WebElement getHomePageConfirmation(){
        return driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));

    }

    public SearchResultPage checkbasicSearch(){
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Red Dress");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        return new SearchResultPage(driver);

    }



}
