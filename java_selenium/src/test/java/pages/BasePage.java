package pages;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    // un solo valor para todas las instancias de la clase
     protected static WebDriver driver;
     private static WebDriverWait wait;

     // bloque estatico que se va ejecutar al comienzo

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\java_selenium_def\\java_selenium\\src\\test\\resources\\driver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        find(locator).click();
    }
    public void write(String locator,String textToWrite) {
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public void SelectFromDropDown(String locator,String valueToSelect) {
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(valueToSelect);
    }
    public void TextToValidate(String locator, String valueToValidate) {
        Assert.assertEquals(valueToValidate, find(locator).getText());
    }
    public String textFromElement(String locator) {
        return find(locator).getText();
   }

   public String getValueFromTable(String locator, int row, int column) {
        //String for obtains locator rows
        String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";

        return find(cellINeed).getText();
    }
    // return all that find the findElements
    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }





}
