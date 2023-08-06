package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567892");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[href='/crmsfa/control/viewLead?partyId=11107']")).click();
		driver.findElement(By.xpath("//a[@href='javascript:document.deleteLeadForm.submit()']")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a")).click();
				
		driver.close();
		
	}

}
