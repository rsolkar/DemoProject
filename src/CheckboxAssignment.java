import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rutuj\\OneDrive\\Documents\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL ="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		boolean b = driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		if(b==true)
		{
			System.out.println("Test Passed");
		}
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		int i = driver.findElements(By.xpath("//label/input[@type='checkbox']")).size();
		System.out.println(i);
	}

}
