package PageObjects.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends PageNavigator {

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    public WebElement verifySearchResultsBasic(){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
    }
}
