package SPM_UIActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SPM_Keywords.Keywords;
import Utilities.Resources;

public class SPMPage extends Resources{ 
	
	SimpleDateFormat sdf = new SimpleDateFormat("MMddHms");
	SimpleDateFormat sdf1 = new SimpleDateFormat("MMddHms");
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    //System.out.println(sdf.format(timestamp));
	 Random randomGenerator = new Random();  
    int PhoneNumner = randomGenerator.nextInt(1000);  
    int EmailID = randomGenerator.nextInt(1000);
  //System.out.println("FirstName_"+ sdf.format(timestamp));
	//System.out.println(sdf.format(timestamp));
	
	public String EnterFirstName() throws Exception{
			try {
				//Thread.sleep(3000);
				System.out.println("Entering the First Name");
				driver.findElement(By.xpath(".//*[@id='txtFirstName']")).sendKeys("RealPageTest");
			} catch (Exception e) {
				return "Failed - unable to find first name object";
			}
			return "Pass";
		}
		
	public String EnterLasttName() throws Exception{
			try {
				//Thread.sleep(3000);
				System.out.println("Entering the Last Name");
				
				//driver.findElement(By.xpath(".//*[@id='txtLastName']")).sendKeys(TestData+sd.format(timestamp));
				driver.findElement(By.xpath(".//*[@id='txtLastName']")).sendKeys(sdf1.format(timestamp));
			} catch (Exception e) {
				return "Failed - unable to find Last name object";
			}
			return "Pass";
		}
		
	public String EnterCallBackNumber() throws Exception{
			try {
				
				System.out.println("Entering the Call Back Number");
	
				driver.findElement(By.xpath(".//*[@id='txtcallbacknumber']")).sendKeys("124-144"+"-"+ PhoneNumner +"x4414");
				
			} catch (Exception e) {
				return "Failed - unable to find Phone number object";
			}
			return "Pass";
		}
		
	public String EnterEmailID() throws Exception{
			try {
				//Thread.sleep(3000);
				System.out.println("Entering the Email ID");
	
				driver.findElement(By.xpath(".//*[@id='txtemailaddress']")).sendKeys("Email"+ EmailID +"@ReaTest.com");
				
			} catch (Exception e) {
				return "Failed - unable to find Last name object";
			}
			return "Pass";
		}
		 
	public String ClickprospectButton() throws Exception{
		try {
			Thread.sleep(3000);
			System.out.println("clicking on prospect Button");
			//Keywords.getWebElement("Prospect.prospectButton").click();
		} catch (Exception e) {
			return "Failed - unable to Click prospect Button";
		}
		return "Pass";
	 }
	
	public String selectProspectName() throws Exception{
		try {
			System.out.println("clicking on Prospect Name");
		
			WebElement element = driver.findElement(By.xpath(".//*[@id='theProspect 1']/td[4]/a"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
	
		} catch (Exception e) {
			return "Failed - unable to select Prospect Name";
		}
		return "Pass";
	}
		
	public String UploadDocument() throws Exception{
	try {
			System.out.println("clicking on attachment icon");
			driver.findElement(By.xpath(".//*[@id='email-module-set']/div[2]/div[6]/a")).click();
			Thread.sleep(1000);
			StringSelection stringSelection = new StringSelection("D:\\hchalla_Selenium\\Super\\KeywordDrivenFramework-master\\src\\main\\java\\KeywordDriven\\Selenium\\Data\\UploaDocument.xlsx");
			//StringSelection stringSelection = new StringSelection("D:/UploaDocument.xlsx");
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, null);
	        Thread.sleep(1000);
	        Robot robot = null;
	 
	        try {
	            robot = new Robot();
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	   
	        robot = new Robot();
	        robot.delay(500);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.delay(500);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.delay(500);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
	        
	} catch (Exception e) {
		return "Failed - unable to select Document";
	}
	return "Pass";
}
	
	public String SelectActionstype() throws Exception{
		try {
			System.out.println("clicking on Actions type");
			
			Thread.sleep(1000);
		
			driver.findElement(By.xpath("//div/ul/li[5]/a[contains(text(),'emailed')]")).click();
		} catch (Exception e) {
			return "Failed - unable to select Actions type";
		}
		return "Pass";
	}
	
	public String SelectTagcontact() throws Exception{
		try {
			System.out.println("clicking on Tagcontact");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[@id='multiTaggedContacts']/dl/dd/div/ul/li[1]/label")).click();
		} catch (Exception e) {
			return "Failed - unable to select Tagcontact";
		}
		return "Pass";
	}
	
	public String SelectAgent() throws Exception{
		try {
			System.out.println("clicking on Agent");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[@id='dk_container_ActiveAgentId1']//a[contains(text(),'Srinivas Nathi')]")).click();
		} catch (Exception e) {
			return "Failed - unable to select Agent";
		}
		return "Pass";
	}
	
	public String SelectCategory() throws Exception{
		try {
			System.out.println("clicking on Category");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div/ul/li[2]/a[contains(text(),'amenities2')]")).click();
		} catch (Exception e) {
			return "Failed - unable to select Category";
		}
		return "Pass";
	}
	
	public String Selectpolicy() throws Exception{
		try {
			System.out.println("clicking on policy");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div/ul/li[3]/a[contains(text(),'community amenities1')]")).click();
		} catch (Exception e) {
			return "Failed - unable to select policy";
		}
		return "Pass";
	}
	
	public String SelectAppAgentName() throws Exception{
		try {
			System.out.println("Select Appointment Agent name");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[@id='dk_container_ActiveAgentId']//a[contains(text(),'Srinivas Nathi')]")).click();
		} catch (Exception e) {
			return "Failed - unable to select Appt Agent Name";
		}
		return "Pass";
	}
	
	public String SelectAppUnitName() throws Exception{
		try {
			System.out.println("Select Appointment Unit name");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[@id='dk_container_ActiveUnitId']//a[contains(text(),'Bldg: AL, Unit: 218B')]")).click();
		} catch (Exception e) {
			return "Failed - unable to selectAppt Unit Name";
		}
		return "Pass";
	}
	
	public String SelectRemainderAgentname() throws Exception{
		try {
			System.out.println("Select Remainder name");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[@id='dk_container_ddlFollowUpAgent']//a[contains(text(),'Srinivas Nathi')]")).click();
		} catch (Exception e) {
			return "Failed - unable to select Remainder Agent name";
		}
		return "Pass";
	}
	
	public String SelectRemainderTime() throws Exception{
		try {
			System.out.println("Select Remainder time");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[@id='ui-active-item']")).click();
		} catch (Exception e) {
			return "Failed - unable to select Remainder Time";
		}
		return "Pass";
	}
	
	public String SelectContactGroup() throws Exception{
		try {
			System.out.println("Select Contact Group Name");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath(".//*[@id='dk_container_ddlcontactgroup_assoc_referrer_0_0']//a[contains(text(),'Resident')]")).click();
			
			Thread.sleep(1000);
		} catch (Exception e) {
			return "Failed - unable to select ContactGroup";
		}
		return "Pass";
	}
	
	public String SelectContactType() throws Exception{
		
		try {
			
			System.out.println("Select Contact Type");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath(".//*[@id='dk_container_ddlcontacttype_assoc_referrer']//a[contains(text(),'Resident')]")).click();
		} catch (Exception e) {
			return "Failed - unable to select ContactType ";
		}
		return "Pass";
	}
	
	public String SelectConcludeReason() throws Exception{
		try {
			
			System.out.println("Select Conclude reason from drop down");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div/ul/li[3]//a[contains(text(),'Bedroom size')]")).click();
			
		} catch (Exception e) {
			
			return "Failed - unable to select Conclude Reason";
		}
		return "Pass";
	}
	
	public String SelectProspectdd() throws Exception{
		try {
			
			for(int i=2;i<3;i++) {
				
				driver.findElement(By.xpath(".//*[@id='dk_container_ProspectListTypeDDL']/a")).click();
				
				Thread.sleep(500);
				//driver.findElement(By.xpath("//*[@id='ProspectListTypeDDL']//option[contains(text(),'All Active Prospects')]")).click();
				
				driver.findElement(By.xpath(".//*[@id='dk_container_ProspectListTypeDDL']/div/ul/li["+i+"]/a")).click();
				
			}
			
		} catch (Exception e) {
			
			return "Failed - unable to select Prospect drop down";
		}
		return "Pass";
	}
	
	public String ListUnmanagedProspects() throws Exception{
		try {
			
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='unmanagedList']//tbody//tr"));
			int UnmanagedCount = rows.size();
			System.out.println("Number of Unmanaged Prospects in today Page is : "+UnmanagedCount);
			
		} catch (Exception e) {
			
			return "Failed - unable to get number of unmanaged prospects in today page";
		}
		return "Pass";
	}
	
	public String Logout() throws Exception{
		try {
			
			driver.findElement(By.xpath(".//*[@id='global-header']/ul/li[6]/a/span")).click();
			
			Thread.sleep(1000);
			
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ESCAPE);
			
		/*	Thread.sleep(1000);
			
			if(driver.findElement(By.xpath("//*[@id='promptGuestModal']/div/div")).isDisplayed())                                                                                                         
			{         
			  *//**Do this*//*  
				Thread.sleep(500);
				driver.findElement(By.xpath("//*[@id='ModalIgnorePromptId']")).click();
			}    
			else    
			{     
			  *//**Do this*//*  
				Thread.sleep(500);
			 //driver.findElement(By.xpath("//a[contains(text(),'log out')]")).click();
			}*/
			
			driver.findElement(By.xpath("//a[contains(text(),'log out')]")).click();
			
		} catch (Exception e) {
			
			return "Failed - unable to Logout Application";
		}
		return "Pass";
	}
			
    public String SelectLeadType() throws Exception{
		
		try {
			
			// Locating drop down
			driver.findElement(By.xpath(".//*[@id='dk_container_ddlLeadType']/a")).click();

			// Waiting till options in drop down are visible
			/*WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions
					.visibilityOf(driver.findElement(By.xpath("//div[@class='visible']"))));*/
					
			   Thread.sleep(1000);
				// Getting list of options
				List<WebElement> itemsInDropdown = driver
						.findElements(By.xpath(".//*[@id='dk_container_ddlLeadType']/div/ul//li"));

				// Getting size of options available
				int size = itemsInDropdown.size();
				System.out.println(size);

				// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(2, size);

				
				// Selecting random value
				itemsInDropdown.get(randnMumber).click();
				
				System.out.println(itemsInDropdown.get(randnMumber));
			
			Thread.sleep(1000);
			
		} catch (Exception e) {
			
			return "Failed - unable to select LeadType";
		}
		return "Pass";
	}

    public String SelectPriority() throws Exception{
	
	try {
		
		// Locating drop down
		driver.findElement(By.xpath(".//*[@id='dk_container_ddlpriority']/a")).click();

		   Thread.sleep(1000);
			// Getting list of options
			List<WebElement> itemsInDropdown = driver
					.findElements(By.xpath(".//*[@id='dk_container_ddlpriority']/div/ul//li"));

			// Getting size of drop downs values available
			int size = itemsInDropdown.size();
			System.out.println(size);

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(2, size);

			
			// Selecting random value
			itemsInDropdown.get(randnMumber).click();
			
			System.out.println(itemsInDropdown.get(randnMumber));
		
		Thread.sleep(1000);
		
	} catch (Exception e) {
		
		return "Failed - unable to select Priority ";
	}
	return "Pass";
}

    public String SelectSourceValues() throws Exception{

	try {
		
		     // Locating drop down
		    driver.findElement(By.xpath(".//*[@id='dk_container_ddlLeadSource']/a")).click();

		   //Thread.sleep(1000);
			// Getting list of options
			List<WebElement> itemsInDropdown = driver.findElements(By.xpath(".//*[@id='dk_container_ddlLeadSource']/div/ul//li"));
		   // Getting size of drop downs values available
			int size = itemsInDropdown.size();
			System.out.println(size);
			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(2, size);	
			// Selecting random value
			itemsInDropdown.get(randnMumber).click();
			
			System.out.println(itemsInDropdown.get(randnMumber));
		
		Thread.sleep(1000);
		
	} catch (Exception e) {
		
		return "Failed - unable to select Source Value";
	}
	return "Pass";
}

    public String CurrentTimeStamp() throws Exception{
	
	try {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_d_H_m_s");
		//Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(sdf.format(timestamp));
		
	} catch (Exception e) {
		
		return "Failed - unable to get current time stamp";
	}
	return "Pass";
    }

    
}


