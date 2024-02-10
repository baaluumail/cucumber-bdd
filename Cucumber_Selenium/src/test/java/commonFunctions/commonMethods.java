package commonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonMethods {
public static WebDriver driver;

public void clickElement(By element) {
	
	driver.findElement(element).click();
}
public void sendText(By element, String keys) {
	
	driver.findElement(element).sendKeys(keys);
}


}
