package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys Test");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("Test1");
		WebDriver driver =new ChromeDriver();
		System.out.println("Test2");
		driver.get("https://testapp-dops.azurewebsites.net/webapp/");
		System.out.println("Test3");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		System.out.println("Test");
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}
