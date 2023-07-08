package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseassignment {
	
	public static void main (String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		String leadsPage = driver.getTitle();
		System.out.println(leadsPage);
		
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement SourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select choose = new Select(SourceId);
		choose.selectByIndex(2);
		
		WebElement marketingCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaign = new Select(marketingCampaignId); 
		campaign.selectByValue("10001");
		
		WebElement industryEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus = new Select(industryEnumId);
		indus.selectByVisibleText("Finance");
		
		//no of options in dropdown
		List<WebElement> options = indus.getOptions();
		int size = options.size();
		System.out.println("Size of the dropdown" + size);
		indus.selectByIndex(size-3);
		
		//print all values in console
		for(int i=0; i<size;i++) {
			String text = options.get(i).getText();
			System.out.println("Options in the dropdown at index "+i+" "+"text");
		}
		
		//select multiple options in dropdown
		boolean multiple = indus.isMultiple();
		System.out.println(multiple);
		
		WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("2");
		//driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		
		String LeadName = driver.findElement(By.id("viewLead_firstname_sp")).getText();
		System.out.println(LeadName);
		//Thread.sleep(3000);
		//driver.close();
	}

}
