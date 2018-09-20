package SPM_Keywords;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.google.common.base.Function;

import SPM_UIActions.SPMPage;
import Utilities.Resources;

public class Keywords extends Resources{
	
	public static String Navigate() {
		System.out.println("Navigate is called");
		driver.get(webElement);		
		return "Pass";
	}

	public static String InputText() {
		System.out.println("InputText is called");
		try {
			getWebElement(webElement).sendKeys(TestData);
		}catch (Throwable t) {
			return "Failed - Element not found "+webElement;
		}
		return "Pass";
	}
		
	public static String ClickOnLink() {
		System.out.println("ClickOnLink is called");
		
		String url = driver.getCurrentUrl();
        System.out.println(url);
		try {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			Thread.sleep(100);
			getWebElement(webElement).click();
			Thread.sleep(2000);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}catch (Throwable t) {
			t.printStackTrace();
			return "Failed - Element not found "+webElement;
		}
		return "Pass";
	}

	public static String VerifyText() {
		System.out.println("VerifyText is called");
		try {
			String ActualText= getWebElement(webElement).getText();
			System.out.println(ActualText);
			if(!ActualText.equals(TestData)) {
				return "Failed - Actual text "+ActualText+" is not equal to to expected text "+TestData;
			}
		}catch (Throwable t) {
			return "Failed - Element not found "+webElement;
		}
		return "Pass";
	}

	/*public static String VerifyAppText() {
		System.out.println("Verify App Text is called");
		try {
			String ActualText= getWebElement(webElement).getText();
			System.out.println(ActualText);

			if(!ActualText.equals(AppText.getProperty(webElement))) {
			
				
				return "Failed - Actual text "+ActualText+" is not equal to to expected text "+AppText.getProperty(webElement);
				
			}
		}catch (Throwable t) {
			return "Failed - Element not found "+webElement;
		}
		return "Pass";
	}
	*/
	
   /**
    * This Method will return web element.
    * @param locator
    * @return
    * @throws Exception
    */
	public static WebElement getLocator(String locator) throws Exception {
        String[] split = locator.split(":");
		String locatorType = split[0];
		String locatorValue = split[1];

		if (locatorType.toLowerCase().equals("id"))
			return driver.findElement(By.id(locatorValue));
		else if (locatorType.toLowerCase().equals("name"))
			return driver.findElement(By.name(locatorValue));
		else if ((locatorType.toLowerCase().equals("classname"))
				|| (locatorType.toLowerCase().equals("class")))
			return driver.findElement(By.className(locatorValue));
		else if ((locatorType.toLowerCase().equals("tagname"))
				|| (locatorType.toLowerCase().equals("tag")))
			return driver.findElement(By.className(locatorValue));
		else if ((locatorType.toLowerCase().equals("linktext"))
				|| (locatorType.toLowerCase().equals("link")))
			return driver.findElement(By.linkText(locatorValue));
		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return driver.findElement(By.partialLinkText(locatorValue));
		else if ((locatorType.toLowerCase().equals("cssselector"))
				|| (locatorType.toLowerCase().equals("css")))
			return driver.findElement(By.cssSelector(locatorValue));
		else if (locatorType.toLowerCase().equals("xpath"))
			return driver.findElement(By.xpath(locatorValue));
		else
			throw new Exception("Unknown locator type '" + locatorType + "'");
	}
	
	public static List<WebElement> getLocators(String locator) throws Exception {
        String[] split = locator.split(":");
		String locatorType = split[0];
		String locatorValue = split[1];

		if (locatorType.toLowerCase().equals("id"))
			return driver.findElements(By.id(locatorValue));
		else if (locatorType.toLowerCase().equals("name"))
			return driver.findElements(By.name(locatorValue));
		else if ((locatorType.toLowerCase().equals("classname"))
				|| (locatorType.toLowerCase().equals("class")))
			return driver.findElements(By.className(locatorValue));
		else if ((locatorType.toLowerCase().equals("tagname"))
				|| (locatorType.toLowerCase().equals("tag")))
			return driver.findElements(By.className(locatorValue));
		else if ((locatorType.toLowerCase().equals("linktext"))
				|| (locatorType.toLowerCase().equals("link")))
			return driver.findElements(By.linkText(locatorValue));
		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return driver.findElements(By.partialLinkText(locatorValue));
		else if ((locatorType.toLowerCase().equals("cssselector"))
				|| (locatorType.toLowerCase().equals("css")))
			return driver.findElements(By.cssSelector(locatorValue));
		else if (locatorType.toLowerCase().equals("xpath"))
			return driver.findElements(By.xpath(locatorValue));
		else
			throw new Exception("Unknown locator type '" + locatorType + "'"); 
	}
	
	public static WebElement getWebElement(String locator) throws Exception{
		System.out.println("locator data:-"+locator+"is---"+Repository.getProperty(locator));
		return getLocator(Repository.getProperty(locator));
	}
	
	public static List<WebElement> getWebElements(String locator) throws Exception{
		return getLocators(Repository.getProperty(locator));
	}
	
	public static String expliciteWait() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, 60); 
		wait.until(ExpectedConditions.visibilityOf(getWebElement(webElement)));
		return "Pass";
	}
	

	/*
	public static String expliciteWait(){
     try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		return "Failed - unable to load the page";
	}
     return "Pass";
	}
	*/
	
	public static String clickWhenReady(By locator, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
		return "Pass";

	}
	
	public static String waitFor() throws InterruptedException {
		Thread.sleep(1500);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return "Pass";
	}
	
	public static String Loader() throws InterruptedException {
		
		 //Wait until report section displayed
        WebDriverWait wait = new WebDriverWait(driver, 360);
       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(text(),'loading...')]")));
		return "Pass";
		
		/*WebDriverWait wait = new WebDriverWait(driver, 60); 
		wait.until(ExpectedConditions.visibilityOf(getWebElement(webElement)));
		return "Pass";*/
		
		
	}
	
	public static String selectProspectName() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.selectProspectName();
	}
	
	public static String SelectAgent() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectAgent();
	}	
		
	public static String SelectCategory() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectCategory();
	}	
	
	public static String SelectTagcontact() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectTagcontact();
	}	
	
	public static String Selectpolicy() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.Selectpolicy();
	}	
	
	public static String SelectActionstype() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectActionstype();
	}	
	
	public static String UploadDocument() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.UploadDocument();
	}	
	
	public static String SelectAppAgentName() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectAppAgentName();
	}
	
	public static String SelectAppUnitName() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectAppUnitName();
	}
		
	public static String SelectRemainderAgentname() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectRemainderAgentname();
	}
	
	public static String SelectRemainderTime() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectRemainderTime();
	}
	
	public static String SelectContactGroup() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectContactGroup();
	}
	
	public static String SelectContactType() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectContactType();
	}
	
	public static String SelectConcludeReason() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectConcludeReason();
	}
	
	public static String SelectProspectdd() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectProspectdd();
	}
	
	public static String ListUnmanagedProspects() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.ListUnmanagedProspects();
	}
		
	public static String SelectLeadType() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectLeadType();
	}
	
	

	public static String SelectPriority() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectPriority();
	}
	
	public static String SelectSourceValues() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.SelectSourceValues();
	}
	

	public static String Logout() throws Exception{
		SPMPage reg = new SPMPage();
		return reg.Logout();
	}
	
	/*public static void closeBrowser(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.quit();
	}*/
	
	public static String closeBrowser() throws Exception {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.quit();
		return Description;
	}
	
 }  
