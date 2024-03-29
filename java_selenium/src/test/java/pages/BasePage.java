
package pages;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
    }
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    public static void closeBrowser() {
        driver.quit();
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }
    private WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElementByxpath(String locator) {
        try {
            find(locator).click();
        } catch (Exception e) {
            System.out.println("**********************");
            System.out.println("Element was not found: " + locator);
            System.out.println("**********************");
        }
    }
    public void write(String locator,String textToWrite) {
        try {
            find(locator).clear();
            find(locator).sendKeys(textToWrite);
        } catch (Exception e) {
            System.out.println("**********************");
            System.out.println("Element was not found: " + locator);
            System.out.println("**********************");
        }
    }
    public void SelectFromDropDownByValue(String locator,String valueToSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(valueToSelect);
    }
    public String textFromElement(String locator) {
        return find(locator).getText();
   }
   public String getValueFromTable(String locator, int row, int column) {
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return find(cellINeed).getText();
    }
    public Boolean isDisplayed(String locator) {
        return find(locator).isDisplayed();
    }

    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }
}
