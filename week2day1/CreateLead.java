package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Padmaja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aravamudan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Paddy");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("Selenium Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("padmaja.aravamudan@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		 String title = driver.getTitle();//browser level verification
	        System.out.println(title);
	}

}