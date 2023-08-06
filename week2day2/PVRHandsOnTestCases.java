package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRHandsOnTestCases {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/" );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//span[contains 'Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/movie-library']")).click();
		
		//driver.findElement(By.xpath("//select[@name contains 'city']")).click();
		//WebElement CityDropDown = driver.findElement(By.xpath("//select[@name contains 'city']"));
		WebElement CityDropDown = driver.findElement(By.id ("city"));
		Select City = new Select(CityDropDown);
		City.selectByVisibleText("Bhopal"); 
		
		WebElement GenreDropDown = driver.findElement(By.xpath("//div[@label contains 'Genre']"));
		Select Genre = new Select(GenreDropDown);
		Genre.selectByVisibleText("Animation");
		
		WebElement LanguageDropDown = driver.findElement(By.xpath("//div[@label contains 'lang']"));
		Select Language = new Select(LanguageDropDown);
		Language.selectByVisibleText("English");
		
		driver.findElement(By.className("btn btn-submit btn-primary")).click();
		
	}

}
