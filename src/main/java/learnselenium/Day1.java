package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RNTBCI");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathish");
		
		WebElement sourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select source = new Select(sourceId);
		 source.selectByIndex(4);
		 boolean multiple = source.isMultiple();
			System.out.println(multiple);
		 
		 
		 WebElement industryId = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select industry = new Select(industryId);
		 industry.selectByValue("IND_SOFTWARE"); 
		 
		 List<WebElement> list = industry.getOptions();
		 int size = list.size();
		 System.out.println(size);
		 
		 for(int j=0; j<=list.size(); j++) {
			 String name1= list.get(j).getText();
		 }
		 
		WebElement ownershipId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(ownershipId);
		ownership.selectByVisibleText("S-Corporation");
		
		List<WebElement> options = ownership.getOptions();
		int size1 = options.size();
		System.out.println("Total values in ownership dropdown is:" + size1);
		for(int i=0; i<=options.size(); i++ ) {
			String name = options.get(i).getText();
			System.out.println(name);
			  }
		
		 WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		 countryCode.clear();
		 countryCode.sendKeys("3");
		  
		 
		
		 
 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		//Thread.sleep(3000);
		//driver.close();
		
	}
		
	
}
