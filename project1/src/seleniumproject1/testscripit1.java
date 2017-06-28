package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscripit1 {

	public static void main(String[] args) {
		
		String actualTitle = "Guru99 Bank Manager HomePage";
		WebDriver driver = new FirefoxDriver();
		driver.get(utility.url);
		driver.findElement(By.name("uid")).sendKeys(utility.uid);;
		driver.findElement(By.name("password")).sendKeys(utility.password);
		driver.findElement(By.name("btnLogin")).click();
		String expectedTitle =driver.getTitle();
				
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Testcases pass");
		} else {
			System.out.println("fail");
		}
	driver.quit();
	}

}
