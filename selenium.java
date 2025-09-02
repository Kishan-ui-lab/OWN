import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		//List<WebElement> li = driver.findElements(By.xpath("//iframe"));
		
	}
}
	
	
	
	/*
	
	driver.SwitchTo().defaultContent(); Toswitch back from frame to window.
	  
	  = > To know how many links are there in web page 
	          driver.findelements(By.tagName("a")).size();
	          
	 => To find links in footer section of web page, then 
	 
	        Webelement footerdriver = driver.findElement(By.id(""));
	        footerdriver.findElements(By.tagName("a)).size();
	        
	  = > click on each link in the column and check if the pages are opening 
	     		
	     			for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	     			{
	     				columndriver.findElements(By.tagName("a")).get(i).click();
	     			}
	     			
	    Strict answer is "No" , we cannot automate API's with selenium.
	   
	  = > To know the parent of the xpath web element , then put /..  then it will show the parent of that particular web element.
	
	= > To know , how many frames are present in application then use   driver.findElements(By.tagName("iframe"));
	     
	     While loop continously executes the loop, until the condition is false
	*/
