package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commonFunctions.commonMethods;
import commonFunctions.objectRepo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class test extends commonMethods{
   // public static WebDriver driver=commonMethods.driver;
    


	
    @Given("^user on homepage$")
    public void user_is_on_homepage() throws Throwable {     
    	System.setProperty("webdriver.chrome.driver","/Users/balabhuveegk/eclipse-workspace-first/Cucumber_Selenium/src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
       
    }
    
    
    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
    	
    	
    	clickElement(objectRepo.logoImg);
    	
    	clickElement(objectRepo.search);
    	Thread.sleep(10000);
    	
        //driver.findElement(By.xpath("//*[@aria-label='Search']")).click();
    }
    
    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
    	sendText(objectRepo.search,"bala");
    	//driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("TestNG Selenium");
        //driver.findElement(By.xpath("//*[@aria-label='testng selenium']")).click();   
        //driver.findElement(By.xpath("//*[@href='https://www.browserstack.com/guide/testng-framework-with-selenium-automation']")).click();
        
    }
    
    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
    //	
    	//String actual =driver.findElement(By.xpath("//*[@data-btn-eventname='ClickedGetStarted']")).getText();
    	//String exp_message = "Get Started free";
    	
        //Assert.assertEquals(exp_message, actual);
        driver.quit();  
    }      
    
}

