package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {

	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		//driver.findElement(By.className("s-suggestion s-suggestion-ellipsis-direction(6)")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple iPhone 14 Pro 128GB Space Black")).click();
		driver.findElement(By.className("a-size-base a-color-secondary")).sendKeys("2");
		//driver.findElement(null)
	}
}
