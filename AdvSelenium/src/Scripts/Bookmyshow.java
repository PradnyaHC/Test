package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bookmyshow 

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe")	;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Avatar: The Way of Water']")).click();	
               
	
	}
}
