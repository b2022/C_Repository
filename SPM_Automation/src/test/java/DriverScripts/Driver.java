package DriverScripts;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Driver {

	 private WebDriver driver;	
	 
		@Test				
		public void SPM_UI() throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			
			MainDriverScript UI =  new MainDriverScript();
			
			UI.initBrowser();
			UI.DriverScript();
			
			
		
		}		
}	
