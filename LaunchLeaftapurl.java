package Week2.Day1homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchLeaftapurl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Demosalesmanager");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("crmsfa");
		WebElement element2 = driver.findElement(By.className("decorativeSubmit"));
		element2.click();
		System.out.println("Leaftaps Successful");
		driver.quit();

	}

}
