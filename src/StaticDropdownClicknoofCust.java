import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdownClicknoofCust {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rutuj\\OneDrive\\Documents\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		for(int i=0;i<2;i++)
		{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}
		driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
	}

}
