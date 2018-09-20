package Repository;
/*package KeywordDriven.Selenium.Repository;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverScript {

public WebDriver driver;
@Test(priority=1)
    public void Login() {
                
                System.out.println("SPM Application Launched successfully");
                                   
                Random randomGenerator = new Random();  
                int randomInt = randomGenerator.nextInt(1000);  
                System.out.println(("124-144"+"-"+ randomInt +"x4414")); 
                driver.findElement(By.xpath(".//*[@id='txtcallbacknumber']")).sendKeys(("124-144"+"-"+ randomInt +"x4414"));
                                     //124-144-1441 x4414
                driver.findElement(By.cssSelector("#UserName")).sendKeys("FirstName"+ randomInt +"Test");
                driver.findElement(By.cssSelector("#Password")).sendKeys("LastName"+ randomInt +"TEST12");
                
                                System.setProperty("webdriver.chrome.driver", "D:\\hchalla_Selenium\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
                
                                // Initialize browser
                                driver=new ChromeDriver();
                                
                                // Open SPM Application
                                driver.get("http://web-bake.v2.lead2lease.com");
                                
                                // Maximize browser
                                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                                
                                driver.manage().window().maximize();
                                
                                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                                
                                driver.findElement(By.cssSelector("#UserName")).sendKeys("hchalla2020");
                                driver.findElement(By.cssSelector("#Password")).sendKeys("Test12345");
                                driver.findElement(By.cssSelector("#loginsubmitbutton")).click();
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                
                                //Click on lead name in today page
                                driver.findElement(By.xpath(".//*[@id='theProspect 1']/td[4]/a")).click();
                                
                                driver.findElement(By.xpath(".//*[@id='divLeftPanelView']/ul/li[5]/a")).click();
                                
                                driver.findElement(By.xpath(".//*[@id='referrer-search-input']")).sendKeys("Test");
                                
                                driver.findElement(By.xpath(".//*[@id='find-referrers']")).click();
                                
                                driver.findElement(By.xpath(".//*[@id='referrers-search-modal']/div[1]/div[2]/table/tbody/tr[1]/td[1]/a")).click();
                
}
    
   // @Test(priority=2)
   public void NewP() {
    
                                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
               
                                driver.findElement(By.cssSelector("#UserName")).sendKeys("hchalla2020");
                                driver.findElement(By.cssSelector("#Password")).sendKeys("Test12345");
                                driver.findElement(By.cssSelector("#loginsubmitbutton")).click();
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                
                                driver.findElement(By.cssSelector("#leads")).click();
                                
                                driver.findElement(By.cssSelector("#new-lead")).click();
                                
                                driver.findElement(By.cssSelector("#txtFirstName")).sendKeys("hchalla2020");
                                driver.findElement(By.cssSelector("#txtLastName")).sendKeys("TestLastName");
                                                                
                   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);         
                
           WebElement LeadType = driver.findElement(By.xpath("//*[contains(@class,'dk_label')][contains(text(),'lead type')]"));
           LeadType.click();
                   driver.findElement(By.xpath("//*[@class='dk_options']//*[text()='walk-in']")).click();
                                
                   WebElement SourceType = driver.findElement(By.xpath("//*[contains(@class,'dk_label')][contains(text(),'source*')]"));
                   SourceType.click();
                   driver.findElement(By.xpath("//*[@class='dk_options']//*[text()='caring.com']")).click();
                                
                   driver.findElement(By.xpath(".//*[@id='txtcallbacknumber']")).sendKeys("312-313-3313 x3131");
                                driver.findElement(By.xpath(".//*[@id='txtemailaddress']")).sendKeys("Test2126@test.com");
                                
                                driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
                                
                                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                                
   } 
                                 //@Test(priority=3)
                                public void Logout() {
                                                
                                                    driver.findElement(By.xpath(".//*[@id='global-header']/ul/li[6]/a")).click();
                                                driver.findElement(By.cssSelector(".log-out-btn>a")).click();
                                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                                driver.close();
            
             }
                
 
       public static void main(String[] args){
                   
                   DriverScript SPM =  new DriverScript();
                   SPM.Login();
                   //SPM.NewP();
                   //SPM.Logout();
                  
     }
   
}
*/