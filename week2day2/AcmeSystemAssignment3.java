package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeSystemAssignment3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login" );
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		String title = driver.getTitle();//browser level verification
        System.out.println(title);
        driver.findElement(By.xpath("//form[contains(@action,'https://acme-test.uipath.com/logout']")).click();
        driver.close();
        
			

	}

}
