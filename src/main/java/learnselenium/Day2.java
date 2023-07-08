package learnselenium;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fb%2F%3F_encoding%3DUTF8%26node%3D16225006011%26pf_rd_r%3DWY6KMGQ67GFP8ZPG0ZVR%26pf_rd_p%3Df45920d2-503d-49e9-9acc-386645974fc6%26pd_rd_r%3Df369d63b-ec0e-4a18-9292-3a0e63227cad%26pd_rd_w%3DPigUg%26pd_rd_wg%3D9MAc4%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	driver.findElement(By.id("ap_email")).sendKeys("subashiniallimuthu@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Kishona@aug04");
	driver.findElement(By.id("signInSubmit")).click();
	System.out.println("This testing has been completed");
	
	
	}
}
