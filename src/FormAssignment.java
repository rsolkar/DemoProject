import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormAssignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rutuj\\OneDrive\\Documents\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://rahulshettyacademy.com/angularpractice/";
		driver.get(url);
		driver.findElement(By.xpath("//div/input[@name='name'][1]")).sendKeys("Danny");
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("danny@xyz.com");
		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("danny@123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		WebElement dropdownvalue = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(dropdownvalue);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("09-01-1997");
		driver.findElement(By.xpath("//input[@value='Submit']")).submit();
		String Successmessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(Successmessage);
	
	}

	
		

}
