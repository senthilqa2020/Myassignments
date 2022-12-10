package Week2.Day1homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchSalesforce {

	public static void main(String[] args) {
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://login.salesforce.com/");
		WebElement element3 = driver1.findElement(By.id("username"));
		element3.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement element4 = driver1.findElement(By.id("password"));
		element4.sendKeys("Testleaf$321");
		WebElement element5 = driver1.findElement(By.id("Login"));
		element5.click();
		System.out.println("Salesforce Successful");
		

	}

}
