import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class assertiontest {

	public static void main(String[] args) throws InterruptedException 
	{	
		String c="Rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rutuj\\OneDrive\\Documents\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.geko.driver", "C:\\Users\\rutuj\\OneDrive\\Documents\\EclipseWorkspace\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		WebDriver driver = new FirefoxDriver();*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String retrievedpassword = getpassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(c);
		driver.findElement(By.name("inputPassword")).sendKeys(retrievedpassword);
		Thread.sleep(1000);
		driver.findElement(By.className("submit")).click();
		/*Thread.sleep(1000);
		String a = driver.findElement(By.tagName("p")).getText();
		System.out.println(a);
		Assert.assertEquals(a,"You are successfully logged in.");
		String b = driver.findElement(By.tagName("h2")).getText();
		System.out.println(b);
		Assert.assertEquals(b,"Hello "+c+",");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();*/
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul@xyz.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("+918108361286");
		driver.findElement(By.className("reset-pwd-btn")).click();
		String PasswordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		System.out.println(PasswordText);
		String[] splitext= PasswordText.split("'");
		String[] splittext2=splitext[1].split("'");
		return splittext2[0];
		
		
		
	}

}
