package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Padmaja");
		driver.findElement(By.id("lastNameField")).sendKeys("Aravamudan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Paddy");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Aravamudan");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("padmaja.aravamudan@gmail.com");
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select StateDropDown = new Select (State);
		StateDropDown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Mail me to my mail address");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 String title = driver.getTitle();//browser level verification
	        System.out.println(title);
	}

}
